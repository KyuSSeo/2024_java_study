<%@ page contentType="text/html; charset=utf-8"%>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<title>Database SQL</title>
</head>
<body>	
<div class="container">
	<form method="post" action="delete_process.jsp">	
		<div class="row mb-3">		
		 <label for="depart" class="col-sm-2 col-form-label">삭제할 학과명</label>
   		<div class="col-sm-3">
    		<input type="text" class="form-control" id="depart" name = "depart">
    	</div>
 		</div>
		<button type="submit" class="btn btn-primary">전송</button>
	</form>
</div>
</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>
