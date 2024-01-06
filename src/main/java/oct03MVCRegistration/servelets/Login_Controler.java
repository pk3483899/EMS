package oct03MVCRegistration.servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MODEL;
import model.ModelImp;

@WebServlet("/Login")
public class Login_Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login_Controler() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		MODEL m=new ModelImp();
		m.connectDB();
		boolean status = m.verify(email, pass);
		System.out.println(status);
	
		if(status) {
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			session.setMaxInactiveInterval(30*30*24);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/welcome.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("msg", "Error, Please try again...");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
		
	}
	
	

}
