<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to Singup page</h1>

<form action="saveUser" method="post">

FirstName  : <input type="text" name="firstName" placeholder="Enter the first Name"/>

<br>

Email : <input type="text" name="email" placeholder="Enter the Emial Id"/>
<br>

Password: <input type="password" name="password" placeholder="Enter the Password"/>

<input  type="Submit" value="SignUp"/>

</form>

</body>
</html>