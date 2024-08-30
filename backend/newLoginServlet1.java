

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class newLoginServlet1 extends HttpServlet {
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
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
				String password=request.getParameter("password");
				try {
					PreparedStatement st=con.prepareStatement("select * from data where username='"+username+"' and password='"+password+"'  ");
				ResultSet rs=st.executeQuery();
				
				if(rs.next()) {
					String name=rs.getString("name");
						
						  out.println("<html>");
					        out.println("<head>");
					        out.println("<h1> Welcome "+name);
					        out.print("</h1>");
					        out.print("<h3>click here to <a href=\"/WebProject/newLogin.jsp\"> login again</a></h3>");
					        out.print("<style>");
					        out.print("body { background-color: #e60000; }");
					        out.println("body { text-align: center; }");// Light blue background
					        out.println("</style>");
					        out.println("</head>");
					        out.println("</html>");
				}
				else {
					out.println("login fail");
				}
				
				}
				
				catch(Exception e) {
					out.println(e);
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
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

}
}
