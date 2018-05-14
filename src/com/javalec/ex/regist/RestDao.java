package com.javalec.ex.regist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class RestDao {

	public static final int REST_NONEXISTENT  = 0;	// 존재하지 않는 가게
	public static final int REST_EXISTENT = 1;	// 존재하는 가게
	public static final int REST_JOIN_FAIL = 0;	// 가게 등록 실패
	public static final int REST_JOIN_SUCCESS = 1;	// 가게 등록 성공
	
	private static RestDao instance = new RestDao();
	
	private RestDao() {
	}
	
	public static RestDao getInstance(){
		return instance;
	}
	
	public int insertRest(RestDto dto) {
		int ri = 0;
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		String query = "INSERT INTO rest VALUES(? || ? || LPAD(rest_seq.nextval,3,0),?,?,?,?,?,00000000,?,000000000)";
		
		try {
			connection = getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, dto.getG_code());
			pstmt.setString(2, dto.getK_code());
			pstmt.setString(3, dto.getR_name());
			pstmt.setString(4, dto.getIntro());
			pstmt.setString(5, dto.getSeat_num());
			pstmt.setString(6, dto.getK_code());
			pstmt.setString(7, dto.getG_code());
			pstmt.setString(8, dto.getM_code());
			pstmt.executeUpdate();
			ri = RestDao.REST_JOIN_SUCCESS;	// 가게 등록 성공
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return ri;
	}
	
	public int confirmR_name(String r_name) {
		int ri = 0;
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query = "select r_name from rest where r_name = ?";
		
		try {
			connection = getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, r_name);
			set = pstmt.executeQuery();
			if(set.next()){
				ri = RestDao.REST_EXISTENT;	// 존재하는 가게
			} else {
				ri = RestDao.REST_NONEXISTENT;	// 존재하지 않는 가게
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				pstmt.close();
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return ri;
	}
	
	public RestDto getRest(String r_code) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query = "select * from rest where r_code = ?";
		RestDto dto = null;
		
		try {
			connection = getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, r_code);
			set = pstmt.executeQuery();
			
			if(set.next()) {
				dto = new RestDto();
				dto.setR_code(set.getString("r_code"));
				dto.setR_name(set.getString("r_name"));
				dto.setIntro(set.getString("intro"));
				dto.setSeat_num(set.getString("seat_num"));
				dto.setK_code(set.getString("k_code"));
				dto.setG_code(set.getString("g_code"));
				dto.setI_code(set.getString("i_code"));
				dto.setM_code(set.getString("m_code"));
				dto.setU_code(set.getString("u_code"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				pstmt.close();
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
		
	}
	
	public int updateRest(RestDto dto) {
		int ri = 0;
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		String query = "update rest set r_name=?, intro=?, seat_num=?, k_code=?, g_code=?, i_code=?, u_code=? where id=?";
		
		try {
			connection = getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, dto.getR_name());
			pstmt.setString(2, dto.getIntro());
			pstmt.setString(3, dto.getSeat_num());
			pstmt.setString(4, dto.getK_code());
			pstmt.setString(5, dto.getG_code());
			pstmt.setString(6, dto.getI_code());
			pstmt.setString(7, dto.getU_code());
			ri = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return ri;
	}
	
	private Connection getConnection() {
		
		Context context = null;
		DataSource dataSource = null;
		Connection connection = null;
		try {
			context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			connection = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
