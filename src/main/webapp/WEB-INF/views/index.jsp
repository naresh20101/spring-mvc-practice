<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is a home page</title>
</head>
<body>
<h1>Home page is here</h1>
<%
 Integer id= (Integer)request.getAttribute("id");
 String name=(String)request.getAttribute("name");
 List<String> friends=(List<String>) request.getAttribute("f");
%>
<h1>Id <%=id %></h1>
<h1>Name <%=name %></h1>
<%
for(String s:friends)
{
out.println(s);
}
%>
</body>
</html>