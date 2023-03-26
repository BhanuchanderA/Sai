package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/del")
public class TestDeleteStudent extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		StudentService s=new StudentService();
		int id=Integer.parseInt(req.getParameter("id"));
		
		Student student=s.deleteStudent(id);
		if(student!=null) {
			RequestDispatcher re=req.getRequestDispatcher("home.jsp");
			re.forward(req, resp);
		}
		else {
			RequestDispatcher re=req.getRequestDispatcher("deletestudent.jsp");
			re.include(req, resp);
		}
	}

}
