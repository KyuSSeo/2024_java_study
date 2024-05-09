<%@ page contentType="text/html; charset=utf-8"%>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<title>Exception</title>
</head>
<body>
	<div class=container>
	
	<form action="exception_process2.jsp" method="post">
		<div class="mb-3 row">
			<label class="col-sm-2">아이디</label>
			<div class="col-sm-3">
				<input type="text" id="id" name="id" class="form-control">
			</div>
		</div>
		<div class="mb-3 row">
			<label class="col-sm-2">비밀번호</label>
			<div class="col-sm-3">
				<input type="password" id="passwd" name="passwd" class="form-control">
			</div>
		</div>
		<div class="mb-3 row">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-primary" value="전송">
			</div>
		</div>
	</form>
	
	</div>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
