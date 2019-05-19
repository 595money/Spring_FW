<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	The student is confirmed: ${student.firstName} ${student.lastName}

	<br>
	<br> Country: ${student.city}

	<ul>
		<c:forEach var="temp" items="${student.gender }">
			<li>${temp }</li>
		</c:forEach>


	</ul>


	<br>
	<br>
</body>
</html>