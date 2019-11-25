<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>发布动态</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<form role="form" action="${pageContext.request.contextPath }/user/publish.do" method="post">
				<div class="form-group">
					 <label for="exampleInputEmail1">发布内容</label><input name="liuyan" style="width:500px;" type="text" class="form-control" />
				</div>
				<div class="form-group">
					 <label for="exampleInputEmail1">关键字</label><input name="keyword" style="width:300px;" type="text" class="form-control" />
				</div>
				<div class="dropdown">
  					选择栏目：<select name="col">
					  <option value ="1">我要吐槽</option>
					  <option value ="2">表白墙</option>
					  <c:if test="${user.type==2 }">
					  	<option value="3">官宣</option>
					  </c:if>
					  <option value="4">说点啥</option>
					</select>
				</div>
				 <button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>