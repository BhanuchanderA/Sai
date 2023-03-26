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
@WebServlet("/getid")
public class TestGetById extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService s=new StudentService();
		Student student=s.getStudent(Integer.parseInt(req.getParameter("id")));
		if(student!=null) {
			req.setAttribute("abc", student);
			RequestDispatcher rd=req.getRequestDispatcher("id.jsp");
					rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("personinfo.jsp");
			rd.include(req, resp);
		}
		
	}

}
