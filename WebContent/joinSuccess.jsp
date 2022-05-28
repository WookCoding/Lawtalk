<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 성공</title>
</head>
<body>
	<table border="1" style="margin: 0 auto;">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>성별</th>
			<th>출생년도</th>
			<th>이메일</th>
		</tr>
		<c:forEach var="User" items="${userList}">
			<tr>
				<td><c:out value="${User.getUserNum()}"/></td>
				<td><c:out value="${User.getUserName()}"/></td>
				<td><c:out value="${User.getUserId()}"/></td>
				<td><c:out value="${User.getUserPw()}"/></td>
				<td><c:out value="${User.getUserGender()}"/></td>
				<td><c:out value="${User.getUserBirth()}"/></td>
				<td><c:out value="${User.getUserEmail()}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>