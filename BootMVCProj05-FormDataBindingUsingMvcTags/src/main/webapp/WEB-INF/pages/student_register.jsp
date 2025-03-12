<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration form</title>
</head>
<body>
<h1 style="color:blue;text-align:center">Student Registration Form</h1>
<frm:form action="register" method="post" modelAttribute="stud">
<table style="border:0; bgcolor:cyan">
<tr>
<td>Student id::</td>
<td><frm:input path="sno"/></td>
</tr>
<tr>
<td>Student Name::</td>
<td><frm:input path="sname"/></td>
</tr>
<tr>
<td>Student Address ::</td>
<td><frm:input path="sadd"/></td>
</tr>
<tr>
<td>Student avg</td>
<td><frm:input path="avg"/></td>
</tr>
<tr>
<td><input type="submit" value="register"></td>
<td><input type="reset" value="cancel"></td> 
</tr>
</table>
</frm:form>
</body>
</html>