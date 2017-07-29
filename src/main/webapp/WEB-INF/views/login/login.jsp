<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style type="text/css">
.error-block {
	color: #ff0000;
	background-color: #fee;
	border: 3px solid #f00;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body onload="document.f.j_username.focus();">
	<h3>Custom Login Page</h3>
	<c:if test="${not empty error}">
		<div class="error-block">
			Your login was unsuccessful.
			<br>
			Caused: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
	<div id="login-box">

		<h2>Login with Username and Password</h2>

		<c:if test="${not empty error}">
			<div class="error"></div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
		<c:if test="${not empty logout}">
			<div class="msg">You have successfully logged out.</div>
		</c:if>
		<br />
		<form name='f' action="login" method='POST'>
			<table>
				<tr>
					<td>User:</td>
					<td>
						<input type='text' name='username' value=''>
					</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td>
						<input type='password' name='password' />
					</td>
				</tr>
				<tr>
					<td colspan='2'>
						<input name="submit" type="submit" value="Login" />
					</td>
				</tr>
			</table>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
	</div>
</body>
</html>