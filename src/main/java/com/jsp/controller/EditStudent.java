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
@WebServlet("/ed")
public class EditStudent extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		StudentService s=new StudentService();
		Student s2=s.getStudent(id);
		if(s2!=null) {
			req.setAttribute("obj", s2);
			RequestDispatcher re=req.getRequestDispatcher("updateperson.jsp");
			re.forward(req, resp);
		}
		else {
			RequestDispatcher re=req.getRequestDispatcher("edit.jsp");
			re.include(req, resp);
		}
	}
}
