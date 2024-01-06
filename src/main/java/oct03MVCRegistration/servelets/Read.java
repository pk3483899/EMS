package oct03MVCRegistration.servelets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MODEL;
import model.ModelImp;


@WebServlet("/Read")
public class Read extends HttpServlet{
	private static final long serialVersionUID = 1L;
       

    public Read() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(60*60*24*7);//if session is inactive for 10 seconds
		
		if(session.getAttribute("email")!=null) {
		MODEL mm=new ModelImp();
		mm.connectDB();
		ResultSet rs = mm.readData();
		
		request.setAttribute("result", rs);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/search.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("Login .jsp");
			rd.forward(request, response);
		}
		}catch(Exception e) {//when session timed out catch block will run
			RequestDispatcher rd = request.getRequestDispatcher("Login .jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
