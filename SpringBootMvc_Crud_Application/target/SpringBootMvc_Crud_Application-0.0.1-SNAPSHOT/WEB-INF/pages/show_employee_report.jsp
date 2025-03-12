<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Report</title>
</head>
<body>

    <h1 style="color:red; text-align:center">Employees Report</h1>

    <c:choose>
        <c:when test="${!empty empList}">
            <table border="1" align="center" bgcolor="cyan">
                <tr style="color: red">
                    <th>Employee ID</th>
                    <th>Name</th>
                    <th>Job</th>
                    <th>Salary</th>
                    <th>Department No</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="emp" items="${empList}">
                    <tr style="color: blue">
                        <td>${emp.empno}</td>
                        <td>${emp.ename}</td>
                        <td>${emp.job}</td>
                        <td>${emp.sal}</td>
                        <td>${emp.deptno}</td>
                        <td>
                            <a href="emp_edit?no=${emp.empno}">Edit</a> |
                            <a href="emp_delete?no=${emp.empno}" onclick="return confirm('Are you sure?')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h2 style="color:red; text-align:center">No Employees Found</h2>
        </c:otherwise>
    </c:choose>

    <center>
        <a href="emp_add">Add Employee</a> |
        <a href="./">Home</a>
    </center>

</body>
</html>
