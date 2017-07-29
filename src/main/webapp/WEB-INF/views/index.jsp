<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<h3>Home Page</h3>
	<ul>
		<li>
			<a href="attende">Attende</a>
		</li>
		<li>
			<a href="event">Event</a>
		</li>
		<li>
			<form action="logout" id="logout" method="post">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
			<a href="#" onclick="document.getElementById('logout').submit();">Logout</a>
		</li>
	</ul>
</body>
</html>