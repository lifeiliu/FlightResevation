<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Register</title>
</head>
<body>
<h2>User Register</h2>
<form action="registerUser" method="post">
<pre>
First Name: <input type="text" name="firstName" />
Last Name:  <input type="text" name="lastName" />
User Name:  <input type="text" name="email" />
Password:   <input type="password" name="password" />
Confirm Password: <input type="password" name="confirmPassword" />
<input type="submit" value="Register" />
</pre>
</form>
</body>
</html>