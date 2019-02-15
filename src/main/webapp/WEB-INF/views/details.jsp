<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Being Java Guys | Registration Form</title>
</head>
<body>
	<center>
		<h2>Being Java Guys | User Details</h2>
		<table border="1">
			<tr>
				<td>Name :</td>
				<td>${user.name}</td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td>${user.gender}</td>
			</tr>
			<tr>
				<td>City :</td>
				<td>${user.city}</td>
			</tr>
			<c:forEach items="${user.interest}" var="interset">
				<tr>
					<td>Interest :</td>
					<td>${interset}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>
