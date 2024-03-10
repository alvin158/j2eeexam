<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>J2EE Exam</title>
</head>
<body>
    <h1>Timesheet for Team Lead</h1>
        <h1>List of Persons</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>checkin</th>
            <th>checkout</th>
        </tr>
        <c:forEach items="${timesheetList}" var="timesheet">
            <tr>
                <td>${timesheet.checkIn}</td>
                <td>${timesheet.checkOut}</td>
                <!-- Access other properties of the Person object as needed -->
            </tr>
        </c:forEach>
    </table>
</body>
</html>
