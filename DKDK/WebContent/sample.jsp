<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="model.userDTO"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="cow.css">
<meta http-equiv="Content-Type" content="text/html; charset= UTF-8">
<title>cow</title>
</head>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<body>

<h1>サンプル</h1>



	<table class="table table-hover">



  <c:forEach var = "user" items = "${userAllList}">
    <tr>
      <td>${user.userId}</td>
      <td>${user.password}</td>
      <td>${user.name}</td>
      <td>${user.area}</td>
      <td>${user.income}</td>
      <td>${user.school}</td>
      <td>${user.gender}</td>
      <td>${user.age}</td>
      <td>${user.height}</td>
      <td>${user.body}</td>
      <td>${user.job}</td>
      <td>${user.holiday}</td>
      <td>${user.cigar}</td>
      <td>${user.child}</td>
      <td>${user.userfree}</td>
      <td>${user.picId}</td>
    </tr>
   </c:forEach>

</table>

</body>
</html>