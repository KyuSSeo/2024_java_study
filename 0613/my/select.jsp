<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>                   
<html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<head>
<title>Database SQL</title>
</head>
<body>
<%@ include file="dbconn.jsp" %>
<div class="container">			
	<table class="table table-bordered">
		 <thead>
			<tr class="table-secondary">
				<th scope="col">학번</th>
				<th scope="col">패스워드</th>
				<th scope="col">학과</th>
				<th scope="col">이름</th>
				<th scope="col">주소</th>
				<th scope="col">연락처</th>
				<th scope="col">이메일</th>
			</tr>
		</thead>	
		<%
			ResultSet rs = null;			
			PreparedStatement pstmt = null;

			try {
				String sql = "select * from student";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					String num = rs.getString("num");
					String passwd = rs.getString("passwd");
					String depart = rs.getString("depart");
					String name = rs.getString("name");
					String address = rs.getString("address");
					String phone = rs.getString("phone");
					String email = rs.getString("email");
		%>
		<tr>
			<td><%=num%></td>
			<td><%=passwd %></td>
			<td><%=depart%></td>
			<td><%=name%></td>
			<td><%=address%></td>
			<td><%=phone%></td>
			<td><%=email %></td>
		</tr>
		<%
				}
			} catch (SQLException ex) {
				out.println("Student 테이블 호출이 실패했습니다.<br>");
				out.println("SQLException: " + ex.getMessage());
			} finally {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			}
		%>
	</table>
</div>	
	<hr>
	<div class="container">
		<div class="text-center">
			<a href = "../ch15/welcome.jsp"><button type="button" class="btn btn-outline-primary">홈 돌아가기</button></a>
		</div>
	</div>
	<hr>
</body>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</html>
