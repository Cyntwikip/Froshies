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


@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("newUsername");
		String password = request.getParameter("newPassword");
		String email = request.getParameter("newEmail");
		String accountType = request.getParameter("newAccountType");
		String volunteerType = request.getParameter("newVolunteerType");
		String organizationName = request.getParameter("newOrganizationName");
		String firstName = request.getParameter("newFirstName");
		String lastName = request.getParameter("newLastName");
		String contactNumber1 = request.getParameter("newContactNumber1");
		String contactNumber2 = request.getParameter("newContactNumber2");
		String region = request.getParameter("Region");
		String province = request.getParameter("Province");
		String city = request.getParameter("City");
		
		AccountService accountService = new AccountService();
		if(accountType.equals("volunteer")) {
			if(volunteerType.equals("individual")) {
				accountService.createNewVolunteerIndividual(username, password, email, firstName, lastName, contactNumber1, contactNumber2, region, province, city);
			}else if(volunteerType.equals("organization")) {
				accountService.createNewVolunteerOrganization(username, password, email, organizationName, contactNumber1, contactNumber2, region, province, city);
			}
		}else {
			// create Account for organizer;
		}
	}
}
