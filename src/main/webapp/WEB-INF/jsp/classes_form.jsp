<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Classes</title>
	 <c:set var="contextPath" value="${pageContext.request.contextPath}" />
	 <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
     <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

</head>
<body>
<jsp:include page="header.jsp"/>
	<div class="container">
		<spring:url value="/classes/addclasses" var="addURL" />
		<h2>Add Student</h2>
		<form:form modelAttribute="classesForm" method="post"
			action="${addURL}" cssClass="form">
			<form:hidden path="id" />
			
			<div class="form-group">
				<label>Section</label>
				<form:input path="section" cssClass="form-control" id="section" />
			</div>
			
			 <div class="form-group">
				<label>Teacher Name</label>
				<form:select path="Tracher_id"  cssClass="form-control" id="Tracher_id">
					<form:options items="${teacherlist}" itemLabel="techName" itemValue="id"/>
					
				</form:select>
			</div>
			<div class="form-group">
				<label>Subject Name</label>
				<form:select path="Subject_id"  cssClass="form-control" id="Subject_id">
					<form:options items="${subjectList}" itemLabel="name" itemValue="id"/>
				</form:select>
			</div>
			 <div class="form-group">
				<label>Student Name</label>
				<form:checkboxes path="" items="${studentList}" itemLabel="sname" itemValue="id" cssClass="form-control" />
					
								
				
			</div>
			<div class="form-group">
				<label>Time of class</label>
				<form:input path="time" cssClass="form-control"
					id="time" />
			</div>

			<button type="submit" class="btn btn-success">Add Class</button>
		</form:form>

	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>