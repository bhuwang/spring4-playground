<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="attende.form.page" /></title>
<style type="text/css">
.error {
	color: #ff0000;
}

.error-block {
	color: #000;
	background-color: #fee;
	border: 3px solid #f00;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<h2>
		<spring:message code="attende.form.page" />
	</h2>
	<br />
	<a href="?language=en">English</a>
	<a href="?language=ne">Nepali</a>
	<br />
	<br />
	<form:form commandName="attende">
		<form:errors path="*" cssClass="error-block" element="div" />

		<label for="name"> <spring:message code="attende.name" />
		</label>
		<form:input path="name" cssErrorClass="error" />
		<form:errors path="name" cssClass="error" />
		<br />

		<label for="emailAddress"> <spring:message
				code="attende.email.address" /></label>
		<form:input path="emailAddress" cssErrorClass="error" />
		<form:errors path="emailAddress" cssClass="error" />
		<br />
		
		<label for="phone"> <spring:message
				code="attende.phone" /></label>
		<form:input path="phone" cssErrorClass="error" />
		<form:errors path="phone" cssClass="error" />
		<br />

		<input type="submit" class="btn"
			value='<spring:message code="attende.save"/>'>
	</form:form>
</body>
</html>