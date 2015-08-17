<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>prodow test</title>

</head>
<body>
<h1>Hello, Result Page</h1>
<ul>
<c:forEach var="foo" items="${render}" varStatus="status">
	<li>${foo.name}</li>
</c:forEach>
</ul>
<a href="/prodowjavatest">返回</a>
</body>
</html>