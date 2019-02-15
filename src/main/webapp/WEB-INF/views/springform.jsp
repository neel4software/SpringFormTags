<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Being Java Guys | Spring Form</title>
</head>
<body>
	<center>
		<h2>Being Java Guys | Registration Form</h2>
		<c:url var="showDetails" value="showDetails.html" />
		<form:form method="get" action="${showDetails}" modelAttribute="user">
			<table>
				<tr>
					<td>Name</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:radiobutton path="gender" value="Male" /> Male <form:radiobutton
							path="gender" value="Female" /> Female</td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:select path="city" items="${model.cityNames}" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:checkboxes items="${model.interests}"
							path="interest" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>
