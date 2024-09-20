package com.systex.view;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.jasper.compiler.NewlineReductionServletWriter;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
	    String croot = request.getContextPath();
	    response.setCharacterEncoding("UTF-8");
	    PrintWriter outPrintWriter = response.getWriter();
	    outPrintWriter.println("<html>");
	    outPrintWriter.println("<head>");
	    outPrintWriter.println("<title>Hello Servlet </title>");
	    outPrintWriter.println("<link href=\""+croot+"/style/mystyle.css\" rel=\"stylesheet\">");
	    outPrintWriter.println("</head/");
	    outPrintWriter.println("<body");
	    
	    outPrintWriter.println("<h2>  Hello Servlet  </h2>");
	    outPrintWriter.println("<p>" +new SimpleDateFormat().getInstance().format(new Date())+ "  </p>");
	    
	   
	    outPrintWriter.println("<table> ");
	    outPrintWriter.println("<tbody> ");
//	    outPrintWriter.println("  <tr>");
//	    outPrintWriter.println("  <th> 第一個 </th>");
//	    outPrintWriter.println("  <th> 第二個 </th>");
//	    outPrintWriter.println("  <th> 成績 </th>");
//	    
//	    outPrintWriter.println("</tr>");
	    
	    for(int a =2; a<10;a++) {
	    	outPrintWriter.println("  <tr>");
	    	
	    	for(int b= 1 ;b<10;b++) {
	    		
	    		outPrintWriter.println("   <td>"+a+"*"+b+"="+a*b+"</td>");
	    		
	    	}
	    	
	    	 outPrintWriter.println("</tr>");
	    	
	    }
	    
	    outPrintWriter.println("</tbody> ");
	    outPrintWriter.println(" </table>");
	    outPrintWriter.println("</body>");
	    outPrintWriter.print("<a href=\""+croot+"/index.jsp\" ><img src =\""+croot+"/images/chii.jpeg \"> </a>");
	
	    outPrintWriter.close();

		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
