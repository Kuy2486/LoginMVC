<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <%
    User loginUser = (User) session.getAttribute("loginUser");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ツイッター</title>
</head>
<body>
<h1>LOGIN RESULT</h1>
<% if(loginUser != null){ %>
<p>ようこそ${loginUser.name}さん!!</p>
<a href="/LoginMVC/Main">つぶやき投稿・閲覧/プレイ</a>
<%} else{ %>
<p>ログインに失敗しました。</p>
<a href="/LoginMVC/">TOPへ</a>
<%} %>
</body>
</html>