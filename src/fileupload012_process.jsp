<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="../bootstrap-5.3.3-dist/css/bootstrap.min.css">
<title>File Upload</title>
</head>
<body>
<div class="container">
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">파라미터 이름</th>
      <th scope="col">파라미터 값</th>
    </tr>
  </thead>
<tbody>
<%
	MultipartRequest multi = new MultipartRequest(request, "C:\\upload", 5 * 1024 * 1024, "utf-8",
	new DefaultFileRenamePolicy());

Enumeration params = multi.getParameterNames();

while (params.hasMoreElements()) {
	String name = (String) params.nextElement();
	out.println("<tr><td>" + name + "</td>");
	String value = multi.getParameter(name);
	out.println("<td>" + value + "</td></tr>");
}

	
	Enumeration files = multi.getFileNames();
	
	String name = (String) files.nextElement();
	String filename = multi.getFilesystemName(name);
	String original = multi.getOriginalFileName(name);
	String type = multi.getContentType(name);
	File file = multi.getFile(name);

	out.println("<tr><td>요청 파라미터 이름</td><td>" + name + "</td></tr>");
	out.println("<tr><td>실제 파일 이름</td><td>" + original + "</td></tr>");
	out.println("<tr><td>저장 파일 이름</td><td>" + filename + "</td></tr>");
	out.println("<tr><td>파일 콘텐츠 유형</td><td>" + type + "</td></tr>");

	if (file != null) {
		out.println("<tr><td>파일 크기</td><td>" + file.length());
		out.println("</td></tr>");
	}
%>
</tbody>
</table>
</div>

	<div class="container">
		<div class="text-center">
			<hr>
				<a href="welcome.jsp"><button type="button" class="btn btn-outline-primary">홈 돌아가기</button></a>
			<hr>
		</div>
	</div>
<script src="../bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>