<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class=container>
	
	<form action="tryCatch2.jsp" method="post">
		<div class="mb-3 row">
			<label class="col-sm-2">숫자1</label>
			<div class="col-sm-3">
				<input type="text" id="num1" name="num1" class="form-control">
			</div>
		</div>
		<div class="mb-3 row">
			<label class="col-sm-2">숫자2</label>
			<div class="col-sm-3">
				<input type="text" id="num2" name="num2" class="form-control">
			</div>
		</div>
		<div class="mb-3 row">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-primary" value="전송">
			</div>
		</div>
	</form>
	
</div>
</body>
</html>