<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red
}
</style>
<title>歡迎來到冒險者公會</title>
</head>
<body>
	<form:form action="processUserForm" modelAttribute="theUser">
	帳號:<form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br>
		<br>
	密碼:<form:input path="password" />
		<form:errors path="password" cssClass="error" />
		<input type="submit" value="發送" />
	</form:form>

</body>
</html>