package com.javalec.ex.view;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.local.LDao;
import com.javalec.ex.local.LDto;

public class BusanView implements LocalView {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		LDao dao = new LDao();
		ArrayList<LDto> dtos = dao.BusanList();
		request.setAttribute("list", dtos);
	}
}