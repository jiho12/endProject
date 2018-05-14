package com.javalec.ex.local;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.view.BusanView;
import com.javalec.ex.view.CCView;
import com.javalec.ex.view.DaeGuView;
import com.javalec.ex.view.DaeJunView;
import com.javalec.ex.view.GangWonView;
import com.javalec.ex.view.GwangJuView;
import com.javalec.ex.view.GyungGiView;
import com.javalec.ex.view.GyungSangView;
import com.javalec.ex.view.JeJuView;
import com.javalec.ex.view.JunRaView;
import com.javalec.ex.view.LocalView;
import com.javalec.ex.view.SeoulView;

/**
 * Servlet implementation class Controller
 */
//@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String viewPage = null;
		LocalView lv = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/Seoul.view")) {
			lv = new SeoulView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/GyungGi.view")) {
			lv = new GyungGiView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/GangWon.view")) {
			lv = new GangWonView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/CC.view")){
			lv = new CCView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/DaeJun.view")) {
			lv = new DaeJunView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/JunRa.view")) {
			lv = new JunRaView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/GwangJu.view")) {
			lv = new GwangJuView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/GyungSang.view")) {
			lv = new GyungSangView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/DaeGu.view")) {
			lv = new DaeGuView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/Busan.view")) {
			lv = new BusanView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		} else if(com.equals("/JeJu.view")) {
			lv = new JeJuView();
			lv.execute(request, response);
			viewPage = "local_list.jsp";
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}
