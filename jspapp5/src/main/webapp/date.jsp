<%@page import="java.util.Date"%>
<%!
Date d=null;
String date="";
%>

<% 
d= new Date();
date=d.toString();
%>

<html>
<body>
<h1>

To day Date:<%= date %>

</h1>

</body>

</html>