<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JK3Bxx</title>
</head>

<%
	ArrayList<String[]> result = 
		(ArrayList<String[]> ) request.getAttribute("result");
%>

<body>
<SELECT NAME="ITEM_NO">

<% for (String[] ss : result){ %>
		<OPTION VALUE="<%= ss[1] %>">
		<%= ss[0] %>
		</OPTION>
<% } %>

</SELECT>
<input type="submit" value="送信">

</body>
</html>