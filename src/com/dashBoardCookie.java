package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class dashBoardCookie
 */
@WebServlet("/dashBoardCookie")
public class dashBoardCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dashBoardCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out=response.getWriter();
	      Cookie[]cookies=request.getCookies();
	      String userId=null;
	      out.println("<html><body>");
     	if(cookies!=null)
	     {
	 		
        	for(Cookie cookie:cookies)
	        {
		       if(cookie.getName().equals("userId"))
		       { 
		          userId=cookie.getValue();
		       }
	         }
		  }
	if(userId!=null)
	{ 
		out.println("Hello"+userId);
	
	}
	 else
	  {
		 out.println("Plz Login First!") ;
	  }
    out.println("</body></html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
