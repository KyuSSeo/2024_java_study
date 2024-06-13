<%@ page contentType="text/html; charset=utf-8"%>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<title>Database SQL</title>
</head>
<body>
<div class="container">	
	<form method="post" action="../ch15/insert_process.jsp">
  	<div class="row mb-3">
    <label for="num" class="col-sm-2 col-form-label">학번</label>
   		<div class="col-sm-3">
    		<input type="text" class="form-control" id="num" name = "num">
    	</div>
 	</div>
 	<div class="row mb-3">
    <label for="passwd" class="col-sm-2 col-form-label">비밀번호</label>
   		<div class="col-sm-3">
    		<input type="password" class="form-control" id="passwd" name = "passwd">
    	</div>
 	</div>
 	<div class="row mb-3">
    <label for="depart" class="col-sm-2 col-form-label">학과</label>
   		<div class="col-sm-3">
    		<input type="text" class="form-control" id="depart" name = "depart">
    	</div>
 	</div>
 	<div class="row mb-3">
    <label for="name" class="col-sm-2 col-form-label">이름</label>
   		<div class="col-sm-3">
    		<input type="text" class="form-control" id="name" name = "name">
    	</div>
 	</div>
 	<div class="row mb-3">
    <label for="address" class="col-sm-2 col-form-label">주소</label>
   		<div class="col-sm-3">
    		<input type="text" class="form-control" id="address" name = "address">
    	</div>
 	</div>
 	<div class="row mb-3">
    <label for="phone" class="col-sm-2 col-form-label">연락처</label>
   		<div class="col-sm-3">
    		<input type="text" class="form-control" id="phone" name = "phone">
    	</div>
 	</div>
 	<div class="row mb-3">
    <label for="email" class="col-sm-2 col-form-label">이메일</label>
   		<div class="col-sm-3">
    		<input type="Email" class="form-control" id="email" name = "email">
    	</div>
 	</div>
 	<button type="submit" class="btn btn-primary">전송</button>
	</form>
</div>
</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>