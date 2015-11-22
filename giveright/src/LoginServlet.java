

import giveright.entity.Account;
import giveright.services.AccountService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	private static final long	serialVersionUID	= 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get the username and password
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		AccountService accountService = new AccountService();
		boolean loginSuccess = accountService.authenticateAccount(username, password);
		
		
		if(loginSuccess) {
			int accountType = accountService.getAccountType(username);
			
			// Save username in the session
			HttpSession session = request.getSession(); // returns an HTTP session of an object
			session.setAttribute("username", username);
			
			// Add a cookie
			Cookie c = new Cookie("username", username);
			c.setMaxAge(60); // in seconds
			response.addCookie(c);
			
			if(accountType == Account.ACCOUNT_ORGANIZER) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("orgdashboard.jsp");
				dispatcher.forward(request, response);
			}else if(accountType == Account.ACCOUNT_VOLUNTEER){
				RequestDispatcher dispatcher = request.getRequestDispatcher("voldashboard.jsp");
				dispatcher.forward(request, response);
			}
		}
	}
}
