<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>J2EE Exam</title>
</head>
<body>
    <h1>Timesheet Tracking</h1>
    <form action="<%=request.getContextPath()%>/checkin.ctc" method="post">
        <input type="submit" value="Check-in">
    </form>
    <form action="checkout" method="post">
        <input type="submit" value="Check-out">
    </form>
    
</body>
</html>
