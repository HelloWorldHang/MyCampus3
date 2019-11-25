<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
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
			<ul class="nav nav-tabs">
				<li class="active">
					 <a href="#">滚图管理</a>
				</li>
				<li>
					 <a href="#">用户管理</a>
				</li>
				<li class="disabled">
					 <a href="#">动态管理</a>
				</li>
				<li class="dropdown pull-right">
					 <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉<strong class="caret"></strong></a>
					<ul class="dropdown-menu">
						<li>
							 <a href="#">操作</a>
						</li>
						<li>
							 <a href="#">设置栏目</a>
						</li>
						<li>
							 <a href="#">更多设置</a>
						</li>
						<li class="divider">
						</li>
						<li>
							 <a href="#">分割线</a>
						</li>
					</ul>
				</li>
			</ul>
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th>
							编号
						</th>
						<th>
							标题
						</th>
						<th>
							图片
						</th>
						<th>
							超链接
						</th>
						<th>
							操作
						</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${gunTuList }" var="guntu">
					<tr>
						<td>
							<h2>${guntu.id }</h2>
						</td>
						<td>
							<h3>${guntu.title }</h3>
						</td>
						<td  height="300">
							<img src="${pageContext.request.contextPath }/${guntu.img}" height="300">
						</td>
						<td>
							<a href="${guntu.link }" target="view_window"><h4>${guntu.link }</h4></a>
						</td>
						<td width="80" height="250">
							<br><br><button type="button" class="btn btn-default btn-info"><a href="${pageContext.request.contextPath }/admin/deleteGunTu.do?id=${guntu.id}">删除</a></button><br>
							<br><br><button type="button" class="btn btn-default btn-info"><a href="${pageContext.request.contextPath }/admin/selectGunTuById.do?id=${guntu.id}">修改</a></button>
						</td>
					</tr>
				</c:forEach>
					<td colspan="5"><h3 align="center"><a href="${pageContext.request.contextPath }/addguntu.jsp">增加滚图</a></h3></td>
				</tbody>
			</table> 
		</div>
	</div>
</div>
</body>
</html>