<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Date"%>
<!-- Declaration -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!int value = 22;%>
	<!-- Directive -->

	<!-- 	Scriplets -->
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));

	int sum = i + j;

	out.println("your sum:" + sum);
	out.println("value: " + value);
	out.println(new Date());
	%>

	<%=sum%>
	<!-- Expression -->

</body>
</html>