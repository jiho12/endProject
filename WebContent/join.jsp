<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link href="css/login.css" type="text/css" rel="stylesheet" media="screen,projection"/>
<script src="js/login.js"></script>
</head>
<body>
<div class='wrap'>
  <span class='title'>Real Time Seat Join</span><br>
    <form action="joinOk.jsp" method="post" name="reg_frm">
        <input type='text' id='id' name='id' placeholder='UserID'>
        <input type='password' id='pw' name='pw' placeholder='Password'>
        <input type='password' id='pw_check' placeholder='Password Check'>
        <input type='text' id='name' name='name' placeholder='Name'>
        <input type='radio' name='gender' value='M' checked>Man &nbsp;
        <input type='radio' name='gender' value='W'>Woman
        <input type='text' id='tel' name='tel' placeholder='Phone'>
        <input type='radio' name='grade' value='0' checked>일반회원  &nbsp;
        <input type='radio' name='grade' value='1'>사업자
        <button type="reset" class='forgot'>Reset</button> <button type='submit' class='login'  onclick="infoConfirm()">Join</button>
    </form>

</div>
</body>
</html>