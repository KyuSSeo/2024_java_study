<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="isErrorPage2.jsp"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		 
	%>
	
<form>
<div class="p-5 mb-4 bg-body-tertiary rounded-3">
	<div class="container-fluid py-5">
        <h1 class="display-5 text">전송 검사</h1>      
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<p><b>숫자1 : </b><span class="badge text-bg-danger"> <%=num1%></span></p>
				<p><b>숫자2 : </b><span class="badge text-bg-danger"> <%=num2%></span></p>
			</div>
		</div>
	</div>
</div>

<div class = "container">
	<div class = "text-center">
		<hr>
			<a href = "welcome.jsp"><button type = "button" class ="btn btn-outline-primary">홈 돌아가기</button></a>
		<hr>
	</div>
</div>
</form>
</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>