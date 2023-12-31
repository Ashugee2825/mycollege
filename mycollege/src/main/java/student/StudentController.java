package student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentController
 */

//http://localhost:8080/mycollege/StudentController?name=prakash&mobileNo=907778
	
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//http://localhost:8080/mycollege/StudentController?name=prakash&mobileNo=907778
		String name= request.getParameter("name");
		String mobileNo=request.getParameter("mobileNo");
		
		String opr= request.getParameter("opr");
		String page=request.getParameter("page");
		
		//make DTO
		StudentProfile studentProfile = new StudentProfile();
		studentProfile.setName(name);
		studentProfile.setMobileNo(mobileNo);
		
		StudentProfileDBService studentProfileDBService = new StudentProfileDBService();
    	studentProfileDBService.createStudent(studentProfile);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
