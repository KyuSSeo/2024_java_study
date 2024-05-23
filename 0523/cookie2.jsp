<%@ page contentType="text/html; charset=utf-8"%>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<title>Cookie</title>
</head>
<body>
<form action="cookie_process2.jsp" method="POST">
	<div class="row mb-3">
		<label for="id" class="col-sm-2 col-form-label">아이디</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="id" name = "id">
			</div>
	</div>
	<div class="row mb-3">
		<label for="passwd" class="col-sm-2 col-form-label">비밀번호</label>
			<div class="col-sm-3">
				<input type="password" class="form-control" id="passwd" name = "passwd">
			</div>
	</div>
	<button type="submit" class="btn btn-primary">Sign in</button>
</form>
</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>