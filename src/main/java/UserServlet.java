

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//  /list  /create /update /delete 
		String action  =  request.getServletPath() ; 
		try {
			switch (action) {
			case "/create":
				createNewUser(request ,response)  ;  
				break;
			case "/update":
				updateUser(request ,response)  ;  
				break;
			case "/delete":
				deleteUser(request ,response)  ;  
				break;
			case "/list":
				showUsers(request ,response)  ;  
				break;
			default:
				showUsers(request ,response)  ;  
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	
	private void showUsers(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out   = response.getWriter() ;  
		
		out.println("show  users ");
	}



	private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}


	private void updateUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}


	private void createNewUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}


	

}
