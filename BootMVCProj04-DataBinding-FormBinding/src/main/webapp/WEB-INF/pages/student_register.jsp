<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student registration form</title>
</head>
<body>
<h1 style="color:red;text-align:center">student Registration form</h1>
<form action="register" method=post>
<table style="text-align:center;color:cyan;width: 100%; border: 1px solid black;">
<tr>
<td>student number</td>
<td><input type="text" name="sno"></td>
</tr>
<tr>
<td>student name</td>
<td><input type="text" name="sname"></td>
</tr>
<tr>
<td>student address</td>
<td><input type="text" name="sadd"></td>
</tr>
<tr>
<td>student avg</td>
<td><input type="text" name="avg"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="register"></td>
</tr>
</table>
</form>
</body>
</html>