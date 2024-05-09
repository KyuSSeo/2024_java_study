<%@ page contentType="text/html; charset=utf-8"%>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<title>Exception</title>
</head>
<body>


	<%
         try {
        	String num1 = request.getParameter("num1");
     		String num2 = request.getParameter("num2");
     		int a = Integer.parseInt(num1);
     		int b = Integer.parseInt(num2);
     		int c = a / b;
     		
            out.println("결과 : " + c);
            
         }
         catch (Exception e) {
            out.println("오류 발생 : " + e.getMessage());
         }
      %>
	
	
</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>
