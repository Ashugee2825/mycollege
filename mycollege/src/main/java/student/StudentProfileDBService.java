package student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentProfileDBService {
    Connection con;
    
    
    public StudentProfileDBService () {
    	DBConnectionDTO conDTO = new DBConnectionDTO();
    	con = conDTO.getConnection();
    	System.out.println(con);
    }
        
        public void closeConnection() 
        {
        	try {
        		con.close();
        	}
        	catch (Exception e) {
        		
        		System.out.println(e);
        	}
        	
        }
    	
       
        
        public void createStudent(StudentProfile studentProfile) {
        	
        String query="INSERT INTO student_profile(name,mobileNo) VALUES(?,?)";
        
        
        System.out.println(query);
        
        			try {
        				
       PreparedStatement pstmt = con.prepareStatement(query);
       pstmt.setString(1,studentProfile.getName());
       pstmt.setString(2,studentProfile.getMobileNo());
       
       				int x =pstmt.executeUpdate();
        			}
        			
        			catch (Exception e) {
        				System.out.println(e);
        			}
        			
        			
        }

        public static void main(String[] args) {
			
        	StudentProfile studentProfile = new StudentProfile();
        	studentProfile.setDefault();
        	StudentProfileDBService studentProfileDBService = new StudentProfileDBService();
        	studentProfileDBService.createStudent(studentProfile);
        	
		}
}

