<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<style>

</style>
<body>
	<frame frameborder ="1"> </frame>
	<div align ="center">
		<form action="userList" method="get">
		
		<h1 style ="color:DodgerBlue;">Welcome!!! </h1>
			<div>	
				<h2>Please login!!</h2>
				
					<div>
						<label>User Name</label>
						<input type ="email" name = "username"> 
					</div>	
					<div>
						<label>Password</label>
						<input type ="password" name = "password"> 
					</div>
					<div >	
						<input type= "submit" value ="Login" >
					</div>
					
			</div>
		</form>
	</div>
	<div align ="center">
		<form action = "account_register" method="post">	
			<input type= "submit" value ="Register">
		</form>
	</div>
</body>
</html>