<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html >
<head>
<title>MEDICINES - BEST FROM THE WASTE</title>
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,400,800,700,300' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=BenchNine:300,400,700' rel='stylesheet' type='text/css'>
<script src="js/modernizr.js"></script>
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>
<body>


header section -->
 
<header class="top-header">
<div class="container">
<div class="row">
<div class="col-xs-5 header-logo">
<br>
<a href="index.html"><img src="img/logo.png" alt="" class="img-responsive logo"></a>
</div>

 




mobile display -->
 
<div class="col-md-7">
<nav class="navbar navbar-default">
<div class="container-fluid nav-bar">
<!-- Brand and toggle get grouped for better

<div class="navbar-header">
<button type="button" class="navbar-toggle
 
collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
<span class="sr-only">Toggle
 
navigation</span>






content for toggling --> example-navbar-collapse-1">
 

<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
</div>

<!-- Collect the nav links, forms, and other

<div class="collapse navbar-collapse" id="bs-
 


>Home</a></li> href="#about">INSPECTOR</a></li> href="#provider">PROVIDER</a></li> href="#seeker">SEEKER</a></li>
 
<ul class="nav navbar-nav navbar-right">
<li><a class="menu active" href="#home"

<li><a class="menu"

<li><a class="menu"

<li><a class="menu"

</ul>
 




</div>
 



</div>
 


</div>
 
</div><!-- /navbar-collapse -->
</div><!-- / .container-fluid -->
</nav>
 
</header> <!-- end of header area -->

<section class="slider" id="home">
<div class="container-fluid">
<div class="row">
 
<div id="carouselHacked" class="carousel slide carousel- fade" data-ride="carousel">
<div class="header-backup"></div>
<!-- Wrapper for slides -->
<div class="carousel-inner" role="listbox">
<div class="item active">
<img src="img/slide-one.jpg" alt="">
<div class="carousel-caption">

<h2><font color='yellow'>BEST
<br>FROM THE WASTE </font> </h2>
</div>
</div>
<div class="item">
<img src="img/slide-two.jpg" alt="">
<div class="carousel-caption">

<h2><font color='yellow'>BEST
<br>FROM THE WASTE </font> </h2>
</div>
</div>
<div class="item">
<img src="img/slide-three.jpg" alt="">
<div class="carousel-caption">

<h3><font color='yellow'>BEST FROM
THE WASTE </font> </h3>
</div>
</div>
<div class="item">
<img src="img/slide-four.jpg" alt="">
<div class="carousel-caption">

<h3><font color='yellow'>BEST FROM
THE WASTE </font> </h3>
</div>
</div>
</div>
<!-- Controls -->
<a class="left carousel-control" href="#carouselHacked" role="button" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left" aria-
 
hidden="true"></span>
 

<span class="sr-only">Previous</span>
</a>
<a class="right carousel-control" href="#carouselHacked"
 
role="button" data-slide="next">
<span class="glyphicon glyphicon-chevron-right" aria-
 
hidden="true"></span>
 

<span class="sr-only">Next</span>
</a>
 
</div>
</div>
</div>
</section><!-- end of slider section -->
<br><br><br><br><br><br><br><br><br><br><br><br>
<!-- about section -->
<section class="about text-center" id="about">
<div class="container">
<div class="row">
<h2><br>INSPECTOR LOGIN</h2>
<div class="col-md-4 col-sm-6">
<div class="single-about-detail clearfix">
<div class="about-img">
<img class="img-responsive"
 
src="img/item1.jpg" alt="">
 

</div>
<div class="about-details">
<div class="pentagon-text">
<h1>I</h1>
 


</div>
 


</div>
 
</div>
 

</div>
 
<div class="col-md-4 col-sm-6">
<br><br><br>
<form action="ilogin.jsp">
<%
String msg=request.getParameter("msg")==null?"notnull":"invalidI";
if(msg.equals("invalidI")){
%>
<h3><font color="red">Login Failed</font></h3>
<%
}
%>
<input type="email" class="form-control" id="iemail"
name="iemail" placeholder="Enter Id"><br>
<input type="password" class="form-control" id="ipswrd" name="ipswrd" placeholder="Enter Password"><br>
<button type="submit" class="btn btn-
 
default">Login</button>

</div>
 

</form>
 

 




src="img/item3.jpg" alt="">
 
<div class="col-md-4 col-sm-6">
<div class="single-about-detail">
<div class="about-img">
<img class="img-responsive"
 
</div>
<div class="about-details">
 
<div class="pentagon-text">
<h1>I</h1>
 




</div>
 



</div>
 


</div>
 


</div>
 
</div>
 

</div>
 
</section><!-- end of about -->
<br><br><br><br><br><br><br><br>
<section class="about text-center" id="provider">
<div class="container">
<div class="row">
<h2><br>PROVIDER SIGN UP</h2>
<div class="col-md-4 col-sm-6">
<form action="psignup.jsp" onclick="return
psignup()">
<input type="text"
class="form-control" id="pname" name="pname" placeholder="Enter Name"><br>
<input type="text" class="form-control" id="pemail" name="pemail" placeholder="Enter Email"><br>
<input type="text" class="form-control" id="pmobile" name="pmobile" placeholder="Enter Mobile"><br>
<input type="text" class="form-control" id="ppswrd" name="ppswrd" placeholder="Select Password"><br>

<textarea class="form-control" rows="5" id="paddress" name="paddress" placeholder="Enter Address"></textarea><br>
<button type="submit" class="btn btn-
 
default">SIGNUP</button>
 

</form>
 


</div>
 

 




src="img/provider.png" alt="">
 
<div class="col-md-4 col-sm-6">
<div class="single-about-detail">
<div class="about-img">
<img class="img-responsive"
 
</div>
<div class="about-details">
<div class="pentagon-text">
<h1>P</h1>
 


</div>
 


</div>
 
</div>
 

</div>
 

<div class="col-md-4 col-sm-6">
<br><br><br>
<form action="plogin.jsp">
<%
 
String msg1=request.getParameter("msg1")==null?"notnull":"plogfailed";
if(msg1.equals("plogfailed")){
%>
<h3><font color="red">Login Failed</font></h3>
<%
}
%>

<input type="email" class="form-control" id="pemail1" name="pemail1" placeholder="Enter Id"><br>
<input type="password" class="form-control" id="ppswrd1" name="ppswrd1" placeholder="Enter Password"><br>
<button type="submit" class="btn btn-
 
default">Login</button>

</div>
 

</form>
 


</div>
</div>
</section><!-- end of about section -->


<section class="about text-center" id="seeker">
<div class="container">
<div class="row">
<h2>SEEKER SIGN UP</h2>
<div class="col-md-4 col-sm-6">
<form
action="ssignup.jsp">

<input type="text" class="form-control" id="sname" name="sname" placeholder="Enter Name"><br>
<input type="text" class="form-control" id="semail" name="semail" placeholder="Enter Email"><br>
<input type="text" class="form-control" id="smobile" name="smobile" placeholder="Enter Mobile"><br>
<input type="text" class="form-control" id="spswrd" name="spswrd" placeholder="Select Password"><br>

<textarea class="form-control" rows="5" id="saddress" name="saddress" placeholder="Enter Address"></textarea><br>
<button type="submit" class="btn btn-
 
default">SIGNUP</button>
 

</form>
 


</div>
 

<div class="col-md-4 col-sm-6">
<div class="single-about-detail">
<div class="about-img">
 

src="img/provider.png" alt="">
 


</div>
 
<img class="img-responsive"
 
<div class="about-details">
<div class="pentagon-text">
<h1>S</h1>
 


</div>
 


</div>
 
</div>
 

</div>
 

<div class="col-md-4 col-sm-6">
<br><br><br>

<form action="slogin.jsp">
<%
String msg2=request.getParameter("msg2")==null?"notnull":"slogfailed";
if(msg2.equals("slogfailed")){
%>
<h3><font color="red">Login Failed</font></h3>
<%
}
%>
<input type="email" class="form-control" id="semail1"
name="semail1" placeholder="Enter Id"><br>
<input type="password" class="form-control" id="spwd1" name="spswrd1" placeholder="Enter Password"><br>
<button type="submit" class="btn btn-
 
default">Login</button>

</div>
 

</form>
 


</div>
</div>
</section><!-- end of about section -->


<!-- map section -->
<!-- end of map section -->

<!-- contact section starts here -->
<!-- end of contact section -->

<!-- footer starts here -->
</footer>

<!-- script tags

<script src="js/jquery-2.1.1.js"></script>
 
<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
<script src="js/gmaps.js"></script>
<script src="js/smoothscroll.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/custom.js"></script>
</body>
</html>
