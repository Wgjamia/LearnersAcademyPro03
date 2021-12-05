<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teachers List</title>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
    
</head>
<body>
<jsp:include page="header.jsp"/>
	<div class="container">
		<table class="table table-striped">
			<thead class="thead-dark">
				<th scope="row">ID</th>
				<th scope="row">Teacher Name</th>
				<th scope="row">Age</th>
				<th scope="row">Update</th>
				<th scope="row">Delete</th>
			</thead>
			<tbody>
				<c:forEach items="${teacherList}" var="teacher">
					<tr>
						<td>${teacher.id}</td>
						<td>${teacher.techName}</td>
						<td>${teacher.age}</td>
						<td><spring:url value="/teacher/editTeacher/${teacher.id}"
								var="editURL" /> <a class="btn btn-info" href="${editURL}"
							role="button">Update</a></td>
						<td><spring:url value="/teacher/deleteTeacher/${teacher.id}"
								var="deleteURL" /> <a class="btn btn-danger"
							href="${deleteURL}" role="button">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<spring:url value="/teacher/addTeacher/" var="addURL" />
		<a class="btn btn-success" href="${addURL}" role="button">Add New
			Teacher</a>
	</div>
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
	
</body>
</html>