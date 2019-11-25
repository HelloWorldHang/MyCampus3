<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			<form role="form" action="${pageContext.request.contextPath }/admin/updateGunTu.do" method="post" enctype = "multipart/form-data">
				<input name="id" type="hidden" value="${gunTu.id }"/>
				<div class="form-group">
					 <label for="exampleInputPassword1">超链接</label><input name="link" type="text" class="form-control" value="${gunTu.link }" id="exampleInputPassword1" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">标题</label><input name="title" type="text" class="form-control" value="${gunTu.title }" id="exampleInputPassword1" />
				</div>
				<img title="${gunTu.title }" src="${pageContext.request.contextPath }/${gunTu.img }" style="width:500px;height:300px;">
				<div class="form-group">
					 <label for="exampleInputFile">选择图片</label><input name="file" type="file" id="exampleInputFile" /><!-- file类型无法设置默认值 -->
				</div>
				<input type="hidden" name="img" value="${gunTu.img }">
				 <input type="submit" class="btn btn-default" value="Submit">
			</form>
		</div>
	</div>
</div>
</body>
</html>
