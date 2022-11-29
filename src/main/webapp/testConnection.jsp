<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
Connection connection = null ; 
String DB_URL="jdbc:mysql://127.0.0.1:3306/";
String DB_name="bdd" ; 
String USER="root" ; 
String PASSWORD="root";

try{
	// Load JDBC  DRIVER CLASS  
	Class c = Class.forName("com.mysql.jdbc.Driver");
	// create  a connection using ge Connection 
	//  
	connection  = DriverManager
   .getConnection(DB_URL+DB_name, USER, PASSWORD); 
	out.println("Connected");
	
	
}catch(Exception e){
	
	out.println("Error !!!!!"+e) ; 
	
}




%>

</body>
</html>