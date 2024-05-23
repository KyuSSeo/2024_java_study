<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<title>Cookie</title>
</head>
<body>
	<%
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("passwd");

		if (user_id.equals("admin") && user_pw.equals("admin1234")) {
			Cookie cookie_id = new Cookie("userID", user_id);
			cookie_id.setMaxAge(60*60);
			response.addCookie(cookie_id);	
			out.println("<hr>");
			out.println("<div class =\"container\">");
			out.println("<div class=\"text-center\">");
			Date now = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("오늘은 yyyy-MM-dd일 입니다.");
			String formatedTime = formatter.format(now);
			out.println(formatedTime+"<br>");
			formatter = new SimpleDateFormat("현재시각은 HH:mm 분 입니다.");
			formatedTime = formatter.format(now);
			out.println(formatedTime+"<br>");
			out.println("<span class=\"badge text-bg-success\">" + user_id + "</span>님 쿠키 설정이 성공했습니다.");
			out.println("</div>");
			out.println("</div>");
			out.println("<hr>");
			%>
				<div class = "container">
					<div class = "text-center">
							<a href = "welcome2.jsp"><button type = "button" class ="btn btn-outline-primary">홈 돌아가기</button></a>
					</div>
				</div>
			<%
		} else {
			%>	
				<hr>
				<div class = "container">
					<div class = "text-center">
						<span class="badge text-bg-danger"> 아이디와 비밀번호를 확인해 주세요</span>
					</div>
				</div>
				<hr>
				<div class = "container">
					<div class = "text-center">
							<a href = "cookie2.jsp"><button type = "button" class ="btn btn-outline-primary">홈 돌아가기</button></a>
					</div>
				</div>
			<%
		}
	%>

</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>