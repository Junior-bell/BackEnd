<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Employee</title>
</head>
<body>
    <h1 style="color:red;text-align:center">Register Employee</h1>

    <form:form modelAttribute="emp" action="emp_add" method="post">
        <table align="center" bgcolor="cyan">
            <tr>
                <td>Employee Name:</td>
                <td><form:input path="ename" /></td>
            </tr>
            <tr>
                <td>Job:</td>
                <td><form:input path="job" /></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><form:input path="sal" /></td>
            </tr>
            <tr>
                <td>Department No:</td>
                <td><form:input path="deptno" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>
                <td><input type="reset" value="Cancel"></td>
            </tr>
        </table>
    </form:form>

    <center><a href="emp_report">View Employees</a></center>
</body>
</html>
