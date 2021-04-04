<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Hello</h1>
<c:forEach var="artist" items="${artists}">
	${artist.name}
</c:forEach>