<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="${ctx}">
<!--this scripts are used for the calander 
 -->

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ZYMRS</title>
<link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/lightbox.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="css/standard.css" media="screen"/>

<!--this scripts are used for the slider div  -->
 <link rel="stylesheet" type="text/css" href="http://athena.fhict.nl/users/i270018/ZYMRS/slide/js-image-slider.css"  />
 <script src="http://athena.fhict.nl/users/i270018/ZYMRS/slide/js-image-slider.js" type="text/javascript"></script>
 <link rel="stylesheet" type="text/css" href="http://athena.fhict.nl/users/i270018/ZYMRS/slide/generic.css"  />
 
</head>
<body>

<div class="container">
		
        <header>
        <div id="banner">
		 <div id="bannerinfo">
		 <a href="register.jsp">Register</a>
		</div>
		</div>
        <span	>Welcome  ${sessionScope.CurrentClient.username }</span>
        
        
         <div class="clear"></div>
	    </header>
    	<nav>
    		<ul>
    		  <li><a href="index.jsp">Home</a>
    			<li><a href="index.jsp">Flights</a>
    			<li><a href="index.jsp">Hotels</a>
    			<li><a href="index.jsp">Cars</a>
    			<li><a href="index.jsp">about Us</a>
    		</ul>
		</nav>
        </header>
	