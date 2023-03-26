package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/dispall")
public class TestDisplayAll extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService st=new StudentService();
		
	
		List<Student> l=st.getAllStudent();
		if(l.size()>0) {
			req.setAttribute("di", l);//we are adding list object into session object with a key name //abc// when we wnat retreive we to call 
			//req.getAttribute("by passing key name")	
			RequestDispatcher r= req.getRequestDispatcher("displayperson.jsp");
			r.forward(req, resp);
		}
		else {
			RequestDispatcher r= req.getRequestDispatcher("/home.jsp");
			r.include(req, resp);
		
			
		}
}
}
