<%@page isErrorPage="true" %>
<html>
<body>
<h1 style="color:red;" align="center">

<%
out.println(exception);
%>
</h1>
</body>
</html>