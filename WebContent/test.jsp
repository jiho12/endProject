<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = null;
String name = null;
String grade = "";
String m_code = "";
if (session.getAttribute("id") != null)
{
	 id = session.getAttribute("id").toString();
	 name = session.getAttribute("name").toString();
	 grade = session.getAttribute("grade").toString();
	 m_code = session.getAttribute("m_code").toString();
}
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
	<title></title>

	<!-- CSS -->
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
	
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-amber.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>

	<style>
	.w3-theme {
	    color: #000 !important;
	    background-color: #FFFFFF !important;
	}
	
	
	#search_line {
	width: 30%;
	align: center;
	float: middle;
	text-align: center;
	content-align: center;
	}
	
	#NoSearch {
	width: 60%;
	height: 300px;
	text-align: center;
	}
	
	/* GENERAL BUTTON STYLING */
	#SearchBtn,
	#SearchBtn::after {
	  -webkit-transition: all 0.3s;
		-moz-transition: all 0.3s;
	  -o-transition: all 0.3s;
		transition: all 0.3s;
	}
	
	#SearchBtn {
	  background: none;
	  border: 3px solid #5D5D5D;
	  border-radius: 5px;
	  color: #fff;
	  display: block;
	  font-size: 15px;
	  font-weight: bold;
	  /* margin: 1em auto; */
	  padding: 5px;
	  position: relative;
	  text-transform: uppercase;
	}
	
	#SearchBtn::before,
	#SearchBtn::after {
	  background: #5D5D5D;
	  content: '';
	  position: absolute;
	  z-index: -1;
	}
	
	#SearchBtn:hover {
	  color: #4374D9;
	}
	
	</style>
</head>
<body>
	<nav class="nav-extended">
	    <div class="nav-wrapper">
	      <a href="Main.jsp" class="brand-logo">REAL TIME SEAT</a>
	      <span class="logName">
	      <% if(id != null) { %>
	      	<%=name %>님 안녕하세요.
	      <%} else { %>
	      	로그인이 필요합니다.
	      <% } %>
	      </span>
	      <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
	      <ul id="nav-mobile" class="right hide-on-med-and-down">

	      </ul>
	    </div>
	    <form>
	    </form>
	    <div class="nav-content">
	      <ul class="tabs tabs-transparent">
	        <li class="tab"><a href="#test1">마이페이지</a></li>
	        
	        <% if(grade.equals("1")) { %>
	        <li class="tab"><a href="#">가게 관리</a></li>
	        <% } else { %>
	        <li class="tab"><a href="#">test2</a></li>
	        <% } %>
	        
	        <% if(grade.equals("1")) { %>
	        <li class="tab"><a href="regist.jsp">가게 등록</a></li>
	        <% } else { %>
	        <li class="tab"><a href="#test3">test3</a></li>
	        <% } %>
	        
		    <% if(id != null) { %>
		    <li class="tab"><a href="logout.jsp" class="tab4">로그아웃</a></li>
      		<%} else { %>
	      	<li class="tab"><a href="login.jsp" class="tab4">로그인</a></li>
	       <% } %>
	      </ul>
	    </div>
	</nav>

	<ul class="sidenav" id="mobile-demo">
        <li><a href="Seoul.view" class="loc">서울</a></li>
        <li><a href="GyungGi.view" class="loc">경기</a></li>
        <li><a href="GangWon.view" class="loc">강원</a></li>
        <li><a href="CC.view" class="loc">충청</a></li>
        <li><a href="DaeJun.view" class="loc">대전</a></li>
        <li><a href="JunRa.view" class="loc">전라</a></li>
        <li><a href="GwangJu.view" class="loc">광주</a></li>
        <li><a href="GyungSang.view" class="loc">경상</a></li>
        <li><a href="DaeGu.view" class="loc">대구</a></li>
        <li><a href="Busan.view" class="loc">부산</a></li>
        <li><a href="JeJu.view" class="loc">제주</a></li>
	</ul>

  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="js/materialize.min.js"></script>
  <script src="js/materialize.js"></script>
  <script src="js/init.js"></script>

</body>
</html>