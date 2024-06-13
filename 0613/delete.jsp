<%@ page contentType="text/html; charset=utf-8"%>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<title>Database SQL</title>
</head>
<body>
<div class="container">	
	<form action="delete_process.jsp" name="form" method="post">
	  <div class="row mb-3">
    	<label class="col-sm-3 col-form-label">삭제할 학과명</label>
    	<div class="col-sm-3">
      		<input type="text" class="form-control" name="depart">
    	</div>
  	  </div> 	  
  	  <div class="row mb-3">
    	<div class="col-sm-3">
      		<input type="submit" class="btn btn-primary" value="전송">
    	</div>
  	  </div>
  	</form>
</div>

<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
