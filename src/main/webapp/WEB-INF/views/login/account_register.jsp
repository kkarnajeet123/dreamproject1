<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AccountRegistration</title>
</head>
<body>

	<div align ="center">
		<form action="user_save" method="post">
		
		<h1 style ="color:DodgerBlue;">Welcome to your Pustakari!!! </h1>
			<div>	
				<h2>Register your account!!</h2>
				
					<div>
						<label>First Name</label>
						<input type ="text" name = "firstName"> 
					</div>	
					<div>
						<label>Last Name</label>
						<input type ="text" name = "lastName"> 
					</div>	
					<div>
						<label>Email Address</label>
						<input type = "email" name = "emailAddress"> 
					</div>	
					<div>
						<label>Phone Number</label>
						<input type ="number" name = "phone_num"> 
					</div>	
					<div>
						<label>Gender</label>
						<input type= "radio"  name="gender" value="Male">Male
						<input type= "radio" name="gender" value="Female"> Female
						
					</div>	
					<div>
						<label>Address 1</label>
						<input type ="text" name = "address.address1"> 
					</div>	
					<div>
						<label>Address 2</label>
						<input type ="text" name = "address.address2"> 
					</div>
					<div>
						<label>City</label>
						<input type ="text" name = "address.city"> 
					</div>
					<div>
						<label>State</label>
						<select name= "address.state">
						<option value="CA">California</option>
						<option value="IA">Iowa</option>
						<option value="NY">New York</option>
						<option value="TX">Texas</option>
						</select>
					</div>
					<div>
						<label>Zip Code</label>
						<input type ="text" name = "address.zipcode"> 
					</div>
					<div>
						<label>Country</label>
						<input type="text" name = "address.country"> 
					</div>
					
					<div>
						
						<input type="submit" name = "Add" > 
						<script type="text/javascript"> window.onload = alertName; </script>
					</form>
					</div>
					
			</div>
		</form>
	</div>

</body>
</html>