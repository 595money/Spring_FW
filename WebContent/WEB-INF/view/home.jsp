<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="test" modelAttribute="student">
firstName:<form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
lastName:<form:input path="lastName" />
		<form:select path="city">
			<form:options items="${theCityOptions}" />
		</form:select>
		<a href="student/showForm">a</a>
		<a href="student/showForm">b</a>
		<img
			src="${pageContext.request.contextPath}/resources/images/tenor.gif">
		
		F<form:checkbox path="gender" value="F" />
		M<form:checkbox path="gender" value="M" />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>