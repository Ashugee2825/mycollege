package student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionDTO {


Connection con;

String databaseName,dbUser, dbpassword,url,driver;

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getDriver() {
	return driver;
}

public void setDriver(String driver) {
	this.driver = driver;
}

public String getDatabaseName() {
	return databaseName;
}

public void setDatabaseName(String databaseName) {
	this.databaseName = databaseName;
}

public String getDbUser() {
	return dbUser;
}

public void setDbUser(String dbUser) {
	this.dbUser = dbUser;
}

public String getDbpassword() {
	return dbpassword;
}

public void setDbpassword(String dbpassword) {
	this.dbpassword = dbpassword;
}

public Connection getConnection()
{
	setdefaultDB();
	
    try{
      Class.forName(this.getDriver());
      con = DriverManager.getConnection(this.getUrl()+this.getDatabaseName(),this.getDbUser(),this.getDbpassword());
      
    }
    catch (Exception e){
	      e.printStackTrace();
	    }

    return con;
}




public void setdefaultDB()
{
	setDatabaseName("mycollegedb");
	setDbUser("root");
	setUrl("jdbc:mysql://localhost:3306/");
	//setDriver("com.mysql.jdbc.Driver");
	setDriver("com.mysql.cj.jdbc.Driver");
	setDbpassword("nitr@123");
}

}
