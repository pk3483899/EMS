package oct03MVCRegistration.servelets;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MODEL;
import model.ModelImp;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

		
		request.setAttribute("phone", phone);
		request.setAttribute("email", email);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/update.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		System.out.println("Email is : "+email);
		System.out.println("Phone Number is : "+phone);
		
		MODEL m = new ModelImp();
		m.connectDB();
		m.update(phone, email);
		
		ResultSet rs = m.readData();
		request.setAttribute("result", rs);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/search.jsp");
		rd.forward(request, response);
		
		
	}

}
