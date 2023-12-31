package student;

public class StudentProfile {

	String name;
	String mobileNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public void display() {
		
		System.out.println("Name="+this.name);
		System.out.println("Mobile No="+this.mobileNo);
		
		
	}
	
	public void setDefault()
	{
		this.name="kamal kishore";
		this.mobileNo="45633333";
		
	}
		
}
