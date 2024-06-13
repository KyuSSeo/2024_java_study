<%@ page contentType="text/html; charset=utf-8"%>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<title>Database SQL</title>
</head>
<body>
<div class="container">
	<form action="insert_process.jsp" name="form" method="post">
	  <div class="row mb-3">
    	<label class="col-sm-2 col-form-label">학번</label>
    	<div class="col-sm-3">
      		<input type="text" class="form-control" name="num">
    	</div>
  	  </div>
  	  <div class="row mb-3">
    	<label class="col-sm-2 col-form-label">패스워드</label>
    	<div class="col-sm-3">
      		<input type="password" class="form-control" name="pwd">
    	</div>
  	  </div>
	  <div class="row mb-3">
    	<label class="col-sm-2 col-form-label">학과</label>
    	<div class="col-sm-3">
      		<input type="text" class="form-control" name="depart">
    	</div>
  	  </div>
  	  <div class="row mb-3">
    	<label class="col-sm-2 col-form-label">이름</label>
    	<div class="col-sm-3">
      		<input type="text" class="form-control" name="name">
    	</div>
  	  </div>
	  <div class="row mb-3">
    	<label class="col-sm-2 col-form-label">주소</label>
    	<div class="col-sm-3">
      		<input type="text" class="form-control" name="address">
    	</div>
  	  </div>
  	  <div class="row mb-3">
    	<label class="col-sm-2 col-form-label">연락처</label>
    	<div class="col-sm-3">
      		<input type="text" class="form-control" name="phone">
    	</div>
  	  </div>  	  
  	  <div class="row mb-3">
    	<label class="col-sm-2 col-form-label">이메일</label>
    	<div class="col-sm-3">
      		<input type="text" class="form-control" name="email">
    	</div>
  	  </div>  
  	  <div class="row mb-3">
    	<div class="col-sm-2">
      		<input type="submit" class="btn btn-primary" value="전송">
    	</div>
  	  </div>
  	</form>
 </div>

<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>