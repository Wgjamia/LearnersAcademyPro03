<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
	 <c:set var="contextPath" value="${pageContext.request.contextPath}" />
	 <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
     <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<nav class="navbar navbar-inverse">
		  	<div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">Learner Academy</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li class="active"><a href="/home">Home</a></li>
		      <li><a href="/student/addStudent/">Add Student</a></li>
		      <li><a href="/student/list/">List Student</a></li>
		      <li><a href="/teacher/addTeacher/">Add Teacher</a></li>
		      <li><a href="/teacher/list/">List Teacher</a></li>
		      <li><a href="/subject/addSubject/">Add Subject</a></li>
		      <li><a  href="/subject/list/">List Subject</a></li>
		      <li><a  href="/classes/addclasses/">Add Classes</a></li>
		      <li> <a  href="/classes/list/">List Classes</a></li>
		      <li> <a onclick="document.forms['logoutForm'].submit()">Logout</a></li>
		      
		    </ul>
		  </div>
		</nav>
		</div>
			
</body>
</html>