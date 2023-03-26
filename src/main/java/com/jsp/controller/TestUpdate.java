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

@WebServlet("/upd")
public class TestUpdate extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Student emp=new Student();
		emp.setId(Integer.parseInt(req.getParameter("id")));
		emp.setName(req.getParameter("name"));
		emp.setBranch(req.getParameter("branch"));
		emp.setEmail(req.getParameter("email"));
		emp.setPassword(req.getParameter("password"));
		
		StudentService se=new StudentService();
		Student s1=se.updateStudent(emp);
		if(s1!=null) {
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("edit.jsp");
			rd.include(req, resp);
		}
	}
	}


