<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<title>Database SQL</title>
</head>
<body>
<%@ include file="dbconn.jsp" %>
<div class="container">	
<%
	request.setCharacterEncoding("utf-8");

	String num = request.getParameter("num");
	String pwd = request.getParameter("pwd");
	String depart = request.getParameter("depart");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");
	
	PreparedStatement pstmt = null;

	try {
		String sql = "insert into student2(num, pwd, depart, name, address, phone, email) values(?,?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.valueOf(num));
		pstmt.setString(2, pwd);
		pstmt.setString(3, depart);
		pstmt.setString(4, name);
		pstmt.setString(5, address);
		pstmt.setString(6, phone);
		pstmt.setString(7, email);
		pstmt.executeUpdate();
		out.println("<div class=\"alert alert-primary\" role=\"alert\">Student2 테이블  삽입이 성공했습니다.</div>");
	} catch (SQLException ex) {
		out.println("<div class=\"alert alert-danger\" role=\"alert\">Student2 테이블 삽입이 실패했습니다.</div>");
		out.println("<div class=\"alert alert-danger\" role=\"alert\">SQLException: " + ex.getMessage() + "</div>");
	} finally {
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}
%>
</div>

	<div class="container">
		<div class="text-center">
			<hr>
				<a href="index.jsp"><button type="button" class="btn btn-outline-primary">홈으로 돌아가기</button></a>
			<hr>
		</div>
	</div>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
