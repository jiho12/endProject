<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = null; String name = null; String top = null; String footer = null;
if (session.getAttribute("id") != null)
{
	 id = session.getAttribute("id").toString();
	 name = session.getAttribute("name").toString();
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>실시간 좌석 정보 시스템</title>

</head>
<body>
	<!-- 상단 -->
	<jsp:include page="test.jsp">
		<jsp:param name="id" value="id"/>
		<jsp:param name="name" value="name"/>
	</jsp:include>
	<!-- 상단 -->
	<br>
	<!-- w3 -->
	<div class="w3-row-padding w3-theme">
		<div class="w3-third w3-section">
		<div class="w3-card-4">
		<img src="images/m1.png" style="width:100%">
		<div class="w3-container w3-white">
		<h4>서울 OO 카페</h4>
		<p>서울시 OO구 OO동  OOO-OOO번지
		영업시간 OO시 ~ OO시
		좌석 OO석</p>
		</div>
		</div>
		</div>
		
		<div class="w3-third w3-section">
		<div class="w3-card-4">
		<img src="images/m2.png" style="width:100%">
		<div class="w3-container w3-white">
		<h4>부산시 OO 식당</h4>
		<p>부산시 OO구 OO동  OOO-OOO번지
		영업시간 OO시 ~ OO시
		좌석 OO석</p>
		</div>
		</div>
		</div>
		
		<div class="w3-third w3-section">
		<div class="w3-card-4">
		<img src="images/m3.png" style="width:100%">
		<div class="w3-container w3-white">
		<h4>대전시 OO 식당</h4>
		<p>대전시 OO구 OO동  OOO-OOO번지
		영업시간 OO시 ~ OO시
		좌석 OO석</p>
		</div>
		</div>
		</div>
	</div>
	<div class="w3-row-padding w3-theme">
		<div class="w3-third w3-section">
		<div class="w3-card-4">
		<img src="images/m4.png" style="width:100%">
		<div class="w3-container w3-white">
		<h4>경기도 OO 카페</h4>
		<p>경기도 OO구 OO동  OOO-OOO번지
		영업시간 OO시 ~ OO시
		좌석 OO석</p>
		</div>
		</div>
		</div>
		
		<div class="w3-third w3-section">
		<div class="w3-card-4">
		<img src="images/m5.png" style="width:100%">
		<div class="w3-container w3-white">
		<h4>제주도 OO 카페</h4>
		<p>제주도 OO구 OO동  OOO-OOO번지
		영업시간 OO시 ~ OO시
		좌석 OO석</p>
		</div>
		</div>
		</div>
		
		<div class="w3-third w3-section">
		<div class="w3-card-4">
		<img src="images/m6.png" style="width:100%">
		<div class="w3-container w3-white">
		<h4>광주시 OO 카페</h4>
		<p>광주시 OO구 OO동  OOO-OOO번지
		영업시간 OO시 ~ OO시
		좌석 OO석</p>
		</div>
		</div>
		<br><br><br>
		</div>
	</div>
	<!-- w3 -->
	<!-- 하단 -->
	<jsp:include page="footer.jsp" />
	<!-- 하단 -->
</body>
</html>