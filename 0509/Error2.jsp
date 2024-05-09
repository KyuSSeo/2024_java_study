<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<meta charset="UTF-8">
<title>Errors</title>
</head>
<body>
<form action="ErrorPage2.jsp" method="post">
<div class="p-5 mb-4 bg-body-tertiary rounded-3">
	<div class="container-fluid py-5">
        <h1 class="display-5 text">Error 검사</h1>      
	</div>
</div>
<div class="container">
<div class="row mb-3">
	<label for="num1" class="col-sm-2">숫자1</label>
	<div class="col-sm-10">
		<input type="text" class="form-control" id="num1" name = "num1">
	</div>
</div>
<div class="row mb-3">
	<label for="num2" class="col-sm-2">숫자2</label>
	<div class="col-sm-10">
		<input type="text" class="form-control" id="num2" name = "num2">
	</div>
</div>
</div>
<button type="submit" class="btn btn-primary">전송</button>
</form>
</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>