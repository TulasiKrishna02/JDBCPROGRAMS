<%@page isThreadSafe="true" %>
<%
System.out.println(Thread.currentThread().getName());
try{
	Thread.sleep(1000);
}catch(Exception e){
	e.printStackTrace();
}
System.out.println(Thread.currentThread().getName());

%>