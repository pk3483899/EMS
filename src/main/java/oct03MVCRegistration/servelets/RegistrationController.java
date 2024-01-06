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

@WebServlet("/insert")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(30*30*24*7);
			if (session.getAttribute("email") != null) {

				String name = request.getParameter("name");
				String city = request.getParameter("city");
				String email = request.getParameter("email");
				String phone = request.getParameter("phone");

				MODEL mm = new ModelImp();
				mm.connectDB();
				mm.insertData(name, city, email, phone);

				request.setAttribute("msg", "Data inserted successfully.");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/welcome.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);

			}

		} catch (Exception e) {  //when session timed out catch block will run
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}
}
