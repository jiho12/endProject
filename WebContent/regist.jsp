<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	request.setCharacterEncoding("UTF-8");
	String m_code = session.getAttribute("m_code").toString();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link href="css/login.css" type="text/css" rel="stylesheet" media="screen,projection"/>
<title>Insert title here</title>
</head>
<body>
<div class='wrap'>
  <span class='title'>Real Time Seat Store Regist</span><br>
    <form action="registOk.jsp" method="post">
        <input type='text' id='name' name='r_name' placeholder='가게명'>
        <input type='text' id='introt' name='intro' placeholder='가게 소개'>
        <input type='text' id='seat_numt' name='seat_num' placeholder='좌석 수'>
        <input type='radio' name='k_code' value='1' checked>카페  &nbsp;
        <input type='radio' name='k_code' value='2'>식당  &nbsp;
        <input type='radio' name='k_code' value='3'>술집
        <select name="g_code">
        	<option value="01">서울</option>
        	<option value="02">경기</option>
        	<option value="03">강원</option>
        	<option value="04">충청</option>
        	<option value="05">대전</option>
        	<option value="06">전라</option>
        	<option value="07">광주</option>
        	<option value="08">경상</option>
        	<option value="09">대구</option>
        	<option value="10">부산</option>
        	<option value="11">제주</option>
        </select>
        <input type='text' name='m_code' value='<%=m_code %>' hidden/>
        <button type="reset" class='forgot'>Reset</button> <button type='submit' class='login'>Join</button>
    </form>

</div>
</body>
</html>