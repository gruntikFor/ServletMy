<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ page import="java.util.Date"%>
<!-- Declaration -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>hello values page</h1>

	<h2>${name}</h2>

	<c:out value="${name}"></c:out>
	<br>

	<c:out value="${listStudent}"></c:out>

	<ul>
		<c:forEach items="${listStudent}" var="student">
			<li><c:out value="${student}"></c:out></li>
		</c:forEach>
	</ul>

	<c:set var="str" value="Hello igoooork do brr" />

	${fn:length(str)}

	<ul>
		<c:forEach items="${fn:split(str,' ')}" var="s">
			<li><c:out value="${s}"></c:out></li>
		</c:forEach>
	</ul>

	index: ${fn:indexOf(str,"igoooork")}

	<c:if test="${fn:contains(str,'Hell2o')}">
		<h2>It's contains</h2>
	</c:if>
	
	<c:if test="${20>10}">
		<h2>20>10</h2>
	</c:if>


	<%@ include file="footer.jsp"%>

</body>
</html>