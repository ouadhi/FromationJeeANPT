

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/Login"} , name = "Login" )
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username") ;
		String password = request.getParameter("password") ;
		
		if(username.equals("admin") && password.equals("admin")) {
			response.sendRedirect("listuser.jsp");
			HttpSession session  = request.getSession() ; 
			session.setAttribute("username", username);
		}else {
			response.sendRedirect("login.jsp");
		}
		
		

		
	}

}
