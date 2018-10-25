<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--JSTL 사용을 위한 코드 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<th>일련번호</th><th>영화이름</th><th>상세정보</th><th>이미지</th>
<c:forEach var="item" items="${list}">
<tr>
<td>${item.id}</td>
<td>${item.name}</td>
<td>${item.description}</td>
<td><img src="${pageContext.request.contextPath}/image/${item.img}" /></td>
</tr>
</c:forEach>
</table>
</body>
</html>