<%@ page contentType="text/html; charset=utf-8"%>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<title>File Upload</title>
</head>
<body>
<div class="container">
	<form name="fileForm" method="post" enctype="multipart/form-data" action="fileupload022_process.jsp">
  		<div class="row mb-3">
    	 	<div class="col-sm-12 text-center">
      			<h4><label class="col-form-label">파일 업로드</label></h4>
    		</div>    	
  	  	</div> 	
  	  	<div class="row mb-3">
		    <label for="staticEmail" class="col-sm-2 col-form-label">이름</label>
    		<div class="col-sm-10">
      			<input type="text" class="form-control" name="name">
    		</div>
  		</div>
		<div class="row mb-3">
		    <label for="staticEmail" class="col-sm-2 col-form-label">주소</label>
    		<div class="col-sm-10">
      			<input type="text" class="form-control" name="address">
    		</div>
  		</div>  		
 		<div class="row mb-3">
		    <label for="staticEmail" class="col-sm-2 col-form-label">설명</label>
    		<div class="col-sm-10">
      			<textarea class="form-control" name="comment" cols="30" rows="3"	placeholder="가입인사를 입력해주세요"></textarea>
    		</div>
  		</div> 
		<div class="row mb-3">
		    <label for="staticEmail" class="col-sm-2 col-form-label">파일</label>
    		<div class="col-sm-10">
    			<div class="input-group">
      				<input type="file" class="form-control" name="filename">
      				<button class="btn btn-outline-secondary" type="button" id="inputGroupFileAddon04">Button</button>
      			</div>
    		</div>
  		</div>  			
  		<div class="row mb-3">
    	 	<div class="col-sm-12 text-end">
      			<input type="submit" class="btn btn-primary" value="파일 올리기">
    		</div>    	
  	  	</div> 			
	</form>
</div>
	
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>