package com.javalec.ex.local;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.local.LDto;

public class LDao {

	DataSource dataSource;
	
	public LDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<LDto> SeoulList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='01' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> GyungGiList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='02' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> GangWonList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='03' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> CCList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='04' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> DaeJunList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='05' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> JunRaList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='06' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> GwangJuList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='07' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> GyungSangList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='08' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> DaeGuList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='09' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> BusanList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='10' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public ArrayList<LDto> JeJuList() {
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT r_code, r_name, intro, seat_num FROM rest WHERE g_code='11' ORDER BY r_code desc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String r_code = resultSet.getString("r_code");
				String r_name = resultSet.getString("r_name");
				String intro = resultSet.getString("intro");
				String seat_num = resultSet.getString("seat_num");
				
				LDto dto = new LDto(r_code, r_name, intro, seat_num);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
}
