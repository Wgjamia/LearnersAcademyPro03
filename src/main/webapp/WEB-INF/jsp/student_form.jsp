<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
 	<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"/>
	<div class="container">
		<spring:url value="/student/addStudent" var="addURL" />
		<h2>Add Student</h2>
		<form:form modelAttribute="studentForm" method="post"
			action="${addURL}" cssClass="form">
			<form:hidden path="id" />
			<div class="form-group">
				<label>Student Name</label>
				<form:input path="sname" cssClass="form-control" id="sname" />
			</div>
			
			<div class="form-group">
				<label>Age</label>
				<form:input path="age" cssClass="form-control" id="age" />
			</div>
			<div class="form-group">
				<label>Date Of Birth</label>
				<form:input type="date" path="dateOfbirth" cssClass="form-control"
					id="dateOfbirth" />
			</div>

			<button type="submit" class="btn btn-success">Add Student</button>
		</form:form>

	</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>