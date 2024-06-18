<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="NewFile2.html" />
<br>
<%
 String uname = (String)session.getAttribute("user");
 if(uname != null)
 {
 out.println("welcome" + uname);
 out.println(" this is your profile");
 }
 else 
 {
 out.println("please login first");
%>
 <jsp:include page="NewFile1.html" />
<%
 }
%>