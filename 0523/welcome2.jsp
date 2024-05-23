<%@ page contentType="text/html; charset=utf-8"%>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<title>Cookie</title>
</head>
<body>
<hr>

	<%  
	Cookie[] cookies = request.getCookies();
	
	out.println("현재 설정된 쿠키의 개수 => " + cookies.length + "<br>");
	out.println("==========================<br>");
	
	
	
	for (int i = 0; i < cookies.length; i++) {
		out.println("설정된 쿠키의 속성 이름 [ " + i + " ] : <span class=\"badge text-bg-primary\">" + cookies[i].getName() + "</span><br>");
		out.println("설정된 쿠키의 속성 값 [ " + i + " ] : <span class=\"badge text-bg-success\">" + cookies[i].getValue() + "</span><br>");
		out.println("---------------------------------------------<br>");
	}
	
	%>
<hr>
				<div class = "container">
					<div class = "text-center">
							<a href = "cookie_out2.jsp"><button type = "button" class ="btn btn-outline-primary">로그아웃</button></a>
					</div>
				</div>	

</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>