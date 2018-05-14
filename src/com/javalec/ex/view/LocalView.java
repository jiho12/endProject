package com.javalec.ex.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LocalView {
	
	void execute(HttpServletRequest request, HttpServletResponse response);
	
}