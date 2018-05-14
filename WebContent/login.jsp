<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인 페이지</title>
<link href="css/login.css" type="text/css" rel="stylesheet" media="screen,projection"/>
<script src="js/login.js"></script>
</head>
<body>
<div class='wrap'>
  <span class='title'>Real Time Seat Join</span>
    <form action="loginOk.jsp" method="post">
        <input type='text' id='id' name='id' placeholder='UserID'>
        <input type='password' id='pw' name='pw' placeholder='Password'>
        <button type="button" class='forgot' onclick="location.href='join.jsp' ">Join us?</button> <button type='submit' class='login'>LOG IN</button>
    </form>
</div>
</body>
</html>