package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbcmodel.StudentData;


public class StudentService extends HttpServlet {
private static final long serialVersionUID = 1L;
   
    public StudentService() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	StudentData ob = new StudentData();
    	response.setContentType("text/html");
    	PrintWriter pw = response.getWriter();
    	try
    	{
    	pw.print(ob.getDetails());
    	}
    	catch(Exception e)
    	{
    	pw.print(e.getMessage());
    	}

    	}


    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doGet(request, response);
    	}

    	}
