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

		String depart = request.getParameter("depart");
	
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "select * from student2 where depart = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, depart);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String depart2 = rs.getString("depart");
				
				if (depart.equals(depart2)) {
					sql = "delete from student2 where depart = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, depart);					
					pstmt.executeUpdate();
					out.println("<div class=\"alert alert-primary\" role=\"alert\">Student2 테이블을 삭제했습니다.</div>");
				} else
					out.println("<div class=\"alert alert-danger\" role=\"alert\">Student2 테이블을 삭제하지 못했습니다.</div>");
			} else
				out.println("<div class=\"alert alert-danger\" role=\"alert\">Student2 테이블에 일치하는 학과가 없습니다.</div>");
		} catch (SQLException ex) {
			out.println("<div class=\"alert alert-danger\" role=\"alert\">SQLException: " + ex.getMessage() + "</div>");
		} finally {
			if (rs != null)
				rs.close();
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