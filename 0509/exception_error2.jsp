<%@ page contentType="text/html; charset=utf-8"%>
<%@ page isErrorPage="true"%>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<title>Exception</title>
</head>
<body>
오류가 발생하였습니다. 오류가 발생하였습니다.오류가 발생하였습니다.오류가 발생하였습니다.오류가 발생하였습니다.
오류가 발생하였습니다. 오류가 발생하였습니다.오류가 발생하였습니다.오류가 발생하였습니다.오류가 발생하였습니다.
오류가 발생하였습니다. 오류가 발생하였습니다.오류가 발생하였습니다.오류가 발생하였습니다.오류가 발생하였습니다.
오류가 발생하였습니다. 오류가 발생하였습니다.오류가 발생하였습니다.오류가 발생하였습니다.오류가 발생하였습니다.<br>

<div class="container">
	<div class="text-center">
	<hr>
	
	<%
		if (response.getStatus() == 500) {
	%>
	오류 발생 : <%=exception.getMessage()%>
	</div>
	<hr>
	<%-- include login page --%>
	<%@ include file="exception2.jsp"%>
	<div class="text-center">
	<%
		} else {
	%>
	오류 발생 코드 : <%=response.getStatus()%><br>
	 
	<hr>
	<%
		}
	%>
	
	<hr>
	<a href="welcome.jsp"><button type="button" class="btn btn-outline-primary">홈 돌아가기</button></a>
	<hr>
	</div>
</div>
	

<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>