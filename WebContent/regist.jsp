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
        <input type='text' id='name' name='r_name' placeholder='���Ը�'>
        <input type='text' id='introt' name='intro' placeholder='���� �Ұ�'>
        <input type='text' id='seat_numt' name='seat_num' placeholder='�¼� ��'>
        <input type='radio' name='k_code' value='1' checked>ī��  &nbsp;
        <input type='radio' name='k_code' value='2'>�Ĵ�  &nbsp;
        <input type='radio' name='k_code' value='3'>����
        <select name="g_code">
        	<option value="01">����</option>
        	<option value="02">���</option>
        	<option value="03">����</option>
        	<option value="04">��û</option>
        	<option value="05">����</option>
        	<option value="06">����</option>
        	<option value="07">����</option>
        	<option value="08">���</option>
        	<option value="09">�뱸</option>
        	<option value="10">�λ�</option>
        	<option value="11">����</option>
        </select>
        <input type='text' name='m_code' value='<%=m_code %>' hidden/>
        <button type="reset" class='forgot'>Reset</button> <button type='submit' class='login'>Join</button>
    </form>

</div>
</body>
</html>