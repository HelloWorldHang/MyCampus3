<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
    <title>注册页面</title>
    <link rel="stylesheet" type="text/css" href="css/regist.css">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
	<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	 
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	 
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js">
		
	</script>
    <style type="text/css">
    </style>
</head>
<body>

    <div class="wrapper">
        <article>
            <h1><em><img src="${pageContext.request.contextPath }/upload\user\9.jpg" width="100px"></em><span>校园动态</span></h1>
            <div class="main">
                <form action="${pageContext.request.contextPath }/user/regist.do" method="post" enctype = "multipart/form-data">
                    <div class="tel">
                        <input type="text" name="sno" placeholder="学号"><em>请输入正确的学号！最多十二个字符</em>
                    </div>
                    <div class="userName">
                        <input type="text" name="username" placeholder="用户名"><em>由1-10个字符组成！</em>
                    </div>
                    <div class="password">
                        <input type="password" name="password" placeholder="密码"><em></em>
                    </div>
                    性别：  <label><input style="width:40px;height:18px" name="gender" type="radio" value="0" checked/>男 </label> 
					<label><input style="width:40px;height:18px" name="gender" type="radio" value="1" />女 </label> <br>
                    类型：  <label><input style="width:40px;height:18px" name="type" type="radio" value="0" checked/>学生 </label> 
					<label><input style="width:40px;height:18px" name="type" type="radio" value="1" />老师</label> 
					<label><input style="width:40px;height:18px" name="type" type="radio" value="2" />组织机构</label> 
				<div class="dropdown">
  					学院：<select name="deptno">
					  <option value ="1">计算机科学与工程学院</option>
					  <option value ="2">教育技术学院</option>
					  <option value="3">文学院</option>
					  <option value="4">物理与电子工程学院</option>
					  <option value="5">美术学院</option>
					  <option value="6">音乐学院</option>
					</select>
				</div>
				上传头像：<input type="file" name="file" />
                    <input type="submit" value="注册">
                </form>
            </div>
        </article>
        <footer>
            <ul>
                <li><a href="#">联系我们</a></li>
                <li><a href="#">关于我们</a></li>
                <li><a href="#">人才招聘</a></li>
                <li><a href="#">友情链接</a></li>
                <li><a href="#">公司地址</a></li>
                <li><a href="#">关注我们</a></li>
            </ul>
            <p>本网站版权归╳╳╳技术有限公司所有，未经许可，不得转载。 更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
        </footer>
    </div>
</body>
</html>
