<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>   
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		  <h4>오류 발생</h4>
	<table class="table table-bordered">
      	 <tr>
            <td width = "20%"><b>Error:</b></td>
            <td>${pageContext.exception}</td>
         </tr>            
         <tr >
            <td><b>URI:</b></td>
            <td>${pageContext.errorData.requestURI}</td>
         </tr>            
         <tr >
            <td><b>Status code:</b></td>
            <td>${pageContext.errorData.statusCode}</td>
         </tr>  
         
         <tr>
         	<th scope="row">toString
         	<td> <%=exception.toString()%></td>
         </tr>
           
         <tr>
         	<th scope="row">getMessage</th>
         	<td><%=exception.getMessage()%></td>
         </tr>
	</table>
</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>