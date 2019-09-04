package com.ani;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		if(password == anitest)
		{
			response.sendRedirect("Welcome.jsp");
		}else {
			response.sendRedirect("");
		}
	}

	

}
