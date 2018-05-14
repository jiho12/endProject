<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- ��� -->
	<jsp:include page="test.jsp"/>
	<!-- ��� -->
	<br>
	<!-- w3 -->

	<input class="w3-input" id="SearchLine" type="text">
	<button class="btn-1" id="SearchBtn">Search</button>

	<br>
	<c:choose>
	<c:when test="${!empty list}">
	<div class="w3-row-padding w3-theme">
	<c:forEach items="${list}" var="dto">
		<div class="w3-third w3-section">
		<div class="w3-card-4">
		<img src="images/m1.png" style="width:100%">
		<div class="w3-container w3-white">
		<span>${dto.r_code}</span>
		<h4>${dto.r_name}</h4>
		<p>${dto.intro}</p>
		<p>�¼� : ${dto.seat_num} ��</p>
		</div>
		</div>
		</div>
	</c:forEach>
	</div>
	<br><br>
	</c:when>
	<c:otherwise>
	<br><br>
		<div id="NoSearch">
		�˻� ����� �����ϴ�....
		</div>
		<br><br>
	</c:otherwise>
	</c:choose>
	<!-- w3 -->
  	<!-- �ϴ� -->
	<jsp:include page="footer.jsp"/>
	<!-- �ϴ� -->
</body>
</html>