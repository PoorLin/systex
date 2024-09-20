package com.systex.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

import com.systex.model.Customer;

/**
 * Servlet implementation class CreateCustomerController
 */
public class CreateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher view;
		
		LinkedList<String> errorMsg = new LinkedList<>();
		request.setAttribute("errors", errorMsg);
		// 1. Retrieve Form Data
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String birth = request.getParameter("birth");
		String[] habits = request.getParameterValues("habit");
		String telephone = request.getParameter("telephone");
	
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
			System.out.println(123);
			view = request.getRequestDispatcher("createCustomer.jsp");
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
			customer.setBirth(birth);
			customer.setGender(gender);
			customer.setHabits(habits);
			request.setAttribute("cust", customer);
			view = request.getRequestDispatcher("createSuccessful.jsp");
			view.forward(request, response);
			return;
		} catch (Exception e) {
           e.printStackTrace();
       	view = request.getRequestDispatcher("error.jsp");
       	view.forward(request, response);
		return;
			
		}
		

		
		
		// 5. Select Next View
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
