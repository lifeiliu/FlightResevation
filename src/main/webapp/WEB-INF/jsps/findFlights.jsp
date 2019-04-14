<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>find Flights</title>
</head>
<body>
<h2>Search for flights</h2>
<table>

<tr>
<th>flightNumber</th>
<th>operatingAirline</th>
<th>departureCity</th>
<th>arrivalCity</th>
<th>dateOfDeparture</th>
<th>estimatedDepartureTime</th>
</tr>
<c:forEach items="${flights}" var="flight" >
<tr>
<td>${flight.flightNumber}</td>
<td>${flight.operatingAirline}</td>
<td>${flight.departureCity}</td>
<td>${flight.arrivalCity}</td>
<td>${flight.dateOfDeparture}</td>
<td>${flight.estimatedDepartureTime}</td>
<td><a href="">book this flight</a></td>
</tr> 
</c:forEach>
</table>

</body>
</html>