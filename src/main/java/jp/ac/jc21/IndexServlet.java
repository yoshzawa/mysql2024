package jp.ac.jc21;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet(urlPatterns = { "/index" })
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	final String dbServer = "192.168.100.160";
	final String dbPort = "3306";
	final String dbName = "test2023";
	final String user = "test2023";
	final String pass = "test2023";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String url = "jdbc:mysql://"+dbServer+"/"+dbName;
		response.getWriter().append("Connect to : ").append(url);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

}
