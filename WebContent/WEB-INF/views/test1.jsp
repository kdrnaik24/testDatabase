<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
	<form name="form" method="get" action="onclick">
		<tr>
			<td>UserName :</td>
			<td><input id="uname" name="uname" type="text"
				placeholder="username"></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><input id="upass" name="upass" type="password"
				placeholder="password" /></td>
		</tr>
		<tr>
			<td>ProjectId or key :</td>
			<td><input id="uprojectId" name="uprojectId" type="text"
				placeholder="projectId or key" /></td>
		</tr>
		<td><input type="submit" name="sub" value="Submit"></td>
		</tr>
	</form>
</body>
</html>