<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Goals Report</title>
</head>
<body>

	<table>
		<tr>
			<th>Goal Minutes</th>
			<th>Exercise Minutes</th>
			<th>Activity</th>
		</tr>
		<c:forEach items="${goalReports}" var="report">
		<tr>
			<td>${report.goalMinutes}</td>
			<td>${report.exerciseMinutes}</td>
			<td>${report.exerciseActivity}</td>
		</tr>
		
		</c:forEach>
		
	</table>

</body>
</html>