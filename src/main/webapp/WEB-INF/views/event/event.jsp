<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Event Registration Form</title>
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
	<h2>Event Registration Form</h2>
	<form:form commandName="event">
		<form:errors path="*" cssClass="error-block" element="div" />
		<label for="eventName">Event Name:</label>
		<form:input path="eventName" cssErrorClass="error" />
		<input type="submit" class="btn" value="Enter Event">
	</form:form>
</body>
</html>