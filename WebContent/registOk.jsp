<%@page import="com.javalec.ex.regist.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("EUC-KR"); %>
<jsp:useBean id="dto" class="com.javalec.ex.regist.RestDto"/>
<jsp:setProperty name="dto" property="*" />
<%
		RestDao dao = RestDao.getInstance();
		if(dao.confirmR_name(dto.getR_name()) == RestDao.REST_EXISTENT) {
%>
		<script language="javascript">
			alert("�ش� ���� ���� �̹� ���� �մϴ�.");
			history.back();
		</script>
<%
		} else {
			int ri = dao.insertRest(dto);
			if(ri == RestDao.REST_JOIN_SUCCESS) {
				session.setAttribute("r_name", dto.getR_name());
%>
			<script language="javascript">
				alert("���� ������ �����߽��ϴ�.");
				document.location.href="Main.jsp";
			</script>
<%
			} else {
%>
			<script language="javascript">
				alert("���� ������ �����߽��ϴ�.");
				document.location.href="regist.jsp";
			</script>
<%
			}
		}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>