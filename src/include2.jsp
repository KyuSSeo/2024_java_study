<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<title>Directives Tag</title>
</head>
<body>
	<%@ include file="header2.jsp" %>  
  
	현재 시간 :  <%= java.util.Calendar.getInstance().getTime() %> <br>
	
	<%
	Date nowTime = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
	%>

	<div class="text-center text-success">현재 날짜 :  <%=sf.format(nowTime) %></div>

	<div class="container">
		<div class="text-center">
			<hr>
				<a href="welcome.jsp"><button type="button" class="btn btn-outline-primary">홈 돌아가기</button></a>
			<hr>
		</div>
	</div>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>