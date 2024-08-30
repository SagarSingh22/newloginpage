

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class newRegisterServlet1 extends HttpServlet {
	Connection con;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newlogin","root","root");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try {
			PreparedStatement st=con.prepareStatement("insert into data values('"+name+"','"+username+"','"+password+"')");
	    st.executeUpdate();
	    out.println("Register Successfully");
	    out.println("<body bgcolor='violet'></body>");
	    out.println("click to <a href=\"/WebProject/newLogin.jsp\">login</a> here");
		}
		catch(Exception e) {
			System.out.println(e);
		}
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		doGet(request, response);
	}
public void destroy() {
	try{
		con.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
