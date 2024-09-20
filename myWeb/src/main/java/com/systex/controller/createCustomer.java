package com.systex.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.LinkedList;

import com.systex.model.Customer;

/**
 * Servlet implementation class createCustomer
 */
public class createCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		switch (action) {
		case "cc1": {
			processCC1(request, response);
			break;
		}
		case "cc2":{
			processCC2(request, response);
			break;
		}
		default:{
			
		}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void processCC1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
RequestDispatcher view;
		
		LinkedList<String> errorMsg = new LinkedList<>();
		request.setAttribute("errors", errorMsg);
		// 1. Retrieve Form Data
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String address = request.getParameter("address");

	
		// 2. Convert Form Data
	
		if(name == null || name.trim().isEmpty()) {
			errorMsg.add("姓名欄位必須填寫");
		}
		if(email == null || email.trim().isEmpty()) {
			errorMsg.add("電郵欄位必須填寫");
		}		
		if(telephone== null || telephone.trim().isEmpty()) {
			errorMsg.add("電話欄位必須填寫");
		}
		if(address== null || address.trim().isEmpty()) {
			errorMsg.add("地址欄位必須填寫");
		}

		// 3. Validate Form Data
		if(!errorMsg.isEmpty()) {
			view = request.getRequestDispatcher("createCustomer1.jsp");
			view.forward(request, response);
			return;//將控制權還給container
		}
		// 4. Invoke Biz Logic
		try {
			Customer customer = new Customer();
			customer.setName(name);
			customer.setEmail(email);
			customer.setTelephone(telephone);
			customer.setAddress(address);
	        HttpSession httpSession = request.getSession();
			httpSession.setAttribute("cust", customer);
			request.setAttribute("cust", customer);
			view = request.getRequestDispatcher("createCustomer2.jsp");
			view.forward(request, response);
			return;
		} catch (Exception e) {
           e.printStackTrace();
       	view = request.getRequestDispatcher("createCustomer1.jsp");
       	view.forward(request, response);
		return;
			
		}
		
	}
	protected void processCC2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher view;
		
		LinkedList<String> errorMsg = new LinkedList<>();
		request.setAttribute("errors", errorMsg);
		// 1. Retrieve Form Data

		String gender = request.getParameter("gender");
	
		String birth = request.getParameter("birth");
		String[] habits = request.getParameterValues("habit");
		
	
		// 2. Convert Form Data
	
	
		if(birth== null || birth.trim().isEmpty()) {
			errorMsg.add("請選擇您的生日");
		}
		if(gender== null ){
			errorMsg.add("請選擇性別");
		}
		if(habits== null ){
			errorMsg.add("請至少勾選一項");
		}
		// 3. Validate Form Data
		if(!errorMsg.isEmpty()) {

			view = request.getRequestDispatcher("createCustomer2.jsp");
			view.forward(request, response);
			return;//將控制權還給container
		}
		// 4. Invoke Biz Logic
		try {
			Customer customer = new Customer();
			customer.setBirth(birth);
			customer.setGender(gender);
			customer.setHabits(habits);
		    HttpSession httpSession = request.getSession();
		    Customer customer2=(Customer)httpSession.getAttribute("cust");
		    customer2.setHabits(habits);
		    customer2.setGender(gender);
		    customer2.setBirth(birth);
		    request.setAttribute("cust", customer2);
		    
			view = request.getRequestDispatcher("createSuccessful.jsp");
			
			view.forward(request, response);
			return;
		} catch (Exception e) {
           e.printStackTrace();
       	view = request.getRequestDispatcher("createCustomer2.jsp");
       	view.forward(request, response);
		return;
			
		}
	}

}
