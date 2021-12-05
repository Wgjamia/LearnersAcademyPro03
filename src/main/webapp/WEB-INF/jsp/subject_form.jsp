<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Subject</title>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
    
</head>
<body>
<jsp:include page="header.jsp"/>
	<div class="container">
		<spring:url value="/subject/addSubject" var="addURL" />
		<h2>Add Subject</h2>
		<form:form modelAttribute="subjectForm" method="post"
			action="${addURL}" cssClass="form">
			<form:hidden path="id" />
			<div class="form-group">
				<label>Subject Name</label>
				<form:input path="name" cssClass="form-control" id="name" />
			</div>
			<div class="form-group">
				<label>ShortCut Name</label>
				<form:input path="shortcut" cssClass="form-control" id="shortcut" />
			</div>
			<button type="submit" class="btn btn-success">Add Subject</button>
		</form:form>

	</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>