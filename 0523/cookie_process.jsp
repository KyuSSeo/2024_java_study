<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Cookie</title>
</head>
<body>
	<%
		String user_id = request.getParameter("id");
		Cookie cookie_id = new Cookie("userID", user_id);
		response.addCookie(cookie_id);
		response.sendRedirect("welcome01.jsp");
	%>
</body>
</html>