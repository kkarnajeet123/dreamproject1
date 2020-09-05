<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserList</title>
</head>

<body>
	<!--<c:if test="${!empty users}">-->
	<div>
		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email Address</th>
					<th>Phone Number </th>
					<th>Gender</th>
					<th>Street-Apt</th>
					<th>State-Country</th>
					<th>Zip Code</th>
					<th>Action</th>
			
				</tr>
			</thead>
		<tbody>
			<c:forEach items ="${users}" var="user">
			<tr>
				<td> ${user.userid }</td>
				<td> ${user.firstName }</td>
				<td> ${user.lastName }</td>
				<td> ${user.emailAddress }</td>
				<td> ${user.phone_num }</td>
				<td> ${user.gender}</td>
				<td> ${user.address.address1},${user.address.address2}, ${user.address.city}</td>
				<td> ${user.address.state}, ${user.address.country}</td>
				<td> ${user.address.zipcode}</td>
				<td> <a href ="user_edit?id=${user.userid}">Edit</a>
					 <a href ="user_delete?id=${user.userid}">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
<!--</c:if>-->
</body>
</html>