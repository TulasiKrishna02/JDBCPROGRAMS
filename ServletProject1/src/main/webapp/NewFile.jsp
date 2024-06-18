<jsp:include page="NewFile.html" />
</br>
<% 
 String name=request.getParameter("uname"); 
 String pass=request.getParameter("pwd");
 String un = "lbrce";
 String ps = "lbrce123";
 if(name.equals(un) && pass.equals(ps))
 {
 session.setAttribute("user",name); 
 out.println("welcome:" + name);
 }
 else
 {
 out.println("invalid user name & password");
%>
 <jsp:include page="index.html" /> 
<%
 }
%>