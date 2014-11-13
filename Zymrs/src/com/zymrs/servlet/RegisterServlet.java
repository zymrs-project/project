package com.zymrs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javax.swing.JOptionPane;

import jpa___.Client;
import jpa___.ClientManager;



public class RegisterServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegisterServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		Client client = new Client();
		client.setFirst_name(request.getParameter("firstname"));
		client.setLast_name(request.getParameter("lastname"));
		client.setEmail(request.getParameter("email"));
		client.setAddress(request.getParameter("address"));
		client.setUsername(request.getParameter("username"));
		client.setPassword(request.getParameter("password"));
		client.setCity(request.getParameter("city"));
		
		
		
			final String appName="";
			final String moduleName="jpa_01";
			final String distinctName="";
			final String beanName = "ClientManagerBean";
			final String viewClassName = "jpa___.ClientManager";
			InitialContext context;
			try {
				context = new InitialContext();
			
			
				ClientManager clientManager = (ClientManager)context.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName);
				boolean flag = clientManager.Register(client);
				if(flag==true){
					request.setAttribute("RegisterInfo", "success");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}else{
					request.setAttribute("RegisterInfo", "failed");
					request.getRequestDispatcher("register.jsp").forward(request, response);
					
				}
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public void RegisterFailed(){
		String msg="Username already exists!";
		int type=JOptionPane.YES_NO_OPTION;
		String title="Register Info";
		JOptionPane.showMessageDialog(null,msg,title,type); 
	}
	public void RegisterSuccess(){
		String msg="Congratulation!Register successfully!";
		
		String title="Register Info";
		JOptionPane.showMessageDialog(null,msg,title,-1); 
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
