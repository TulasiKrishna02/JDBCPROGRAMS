<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="NewFile2.html" />
<br>
<%
 session.removeAttribute("user");
 out.println("logout successfully");
%>
