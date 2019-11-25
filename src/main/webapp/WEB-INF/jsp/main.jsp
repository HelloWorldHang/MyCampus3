<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>main</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	 
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	 
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<style type="text/css">
		body { color: #333333; }

			#container { margin: 0 auto; width: 900px; font-family: arial; }
			
			#container h3 { font-family: "Microsoft YaHei"; }
			
			.heart { background: url(../img/heart.jpg); height: 20px; width: 20px; background-size: 100%; }
			
			.heart:hover, .heart:focus { background-position: right; }
			
			 @-webkit-keyframes heartBlast {  0% {
			
			 background-position: left;
			
			}
			
			 100% {
			
			 background-position: right;
			
			}
			
			}
			
			 @keyframes heartBlast {  0% {
			
			 background-position: left;
			
			}
			
			 100% {
			
			 background-position: right;
			
			}
			
			}
			
			.heartAnimation { display: inline-block; -webkit-animation-name: heartBlast; animation-name: heartBlast; -webkit-animation-duration: .8s; animation-duration: .8s; -webkit-animation-iteration-count: 1; animation-iteration-count: 1; -webkit-animation-timing-function: steps(28); animation-timing-function: steps(28); background-position: right; }
			
			.feed p { font-family: "Microsoft YaHei", 'Georgia', Times, Times New Roman, serif; font-size: 25px; }
			
			.feed { clear: both; margin-bottom: :20px;
			
			height: 150px; position: relative; }
			
			a { color: #7ac9ed; }
			
			p { margin: 0px; padding: 0px; }
			
			.likeCount { font-family: 'Georgia', Times, Times New Roman, serif; margin-top: 32px; margin-left: 68px; font-size: 25px; color: #999999 }
	</style>
	<script type="text/javascript">
	$(document).ready(function()

			{

			$('body').on("click",'.heart',function()

			{

			var A=$(this).attr("id");

			var B=A.split("like");

			var messageID=B[1];

			var C=parseInt($("#likeCount"+messageID).html());

			$(this).css("background-position","")

			var D=$(this).attr("rel");

			if(D === 'like') 

			{      

			$("#likeCount"+messageID).html(C+1);

			$(this).addClass("heartAnimation").attr("rel","unlike");

			}

			else

			{

			$("#likeCount"+messageID).html(C-1);

			$(this).removeClass("heartAnimation").attr("rel","like");

			$(this).css("background-position","left");

			}

			});

			});
	</script>
</head>
<body>
<h2 style="text-align:center; color:red;" >亲爱滴${user.username }，欢迎您！</h2>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
					 <a href="${pageContext.request.contextPath }/user/personal.do?sno=${user.sno }">
					 <img alt="touXiang" width="80" height="50" style="margin:1px auto" src="${pageContext.request.contextPath }/${user.img }"></a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="${pageContext.request.contextPath }/liuyan/liuyanMain.do">主页</a>
						</li>
								<li>
									 <a href="${pageContext.request.contextPath }/liuyan/column.do?column=1">我要吐槽</a>
								</li>
								<li>
									 <a href="${pageContext.request.contextPath }/liuyan/column.do?column=2">表白墙</a>
								</li>
								<li>
									 <a href="${pageContext.request.contextPath }/liuyan/column.do?column=4">说点啥</a>
								</li>
								<li>
									 <a href="${pageContext.request.contextPath }/liuyan/column.do?column=3">官宣</a>
								</li>
		
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							姓名：<input type="text" name="name" size=5px class="form-control" />
							内容：<input type="text" name="liuyan" class="form-control" />
							关键字：<input type="text" name="keyWord" size=5px class="form-control" />
						</div> <button type="submit" class="btn btn-default">查询</button>
					</form>
					<!-- <ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="#"></a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
							</ul>
						</li>
					</ul> -->
				</div>
				<form class="navbar-form navbar-left" role="search" action="${pageContext.request.contextPath }/user/publish.do" method="post">
						<div class="form-group">
							 <label for="exampleInputEmail1">发布内容</label><input name="liuyan" style="width:500px;" type="text" class="form-control" />
					 <label for="exampleInputEmail1">关键字</label><input name="keyword" style="width:100px;" type="text" class="form-control" />
  					选择栏目：<select name="col">
					  <option value ="1">我要吐槽</option>
					  <option value ="2">表白墙</option>
					  <c:if test="${user.type==2 }">
					  	<option value="3">官宣</option>
					  </c:if>
					  <option value="4">说点啥</option>
					</select>
				 	<button type="submit" class="btn btn-default">发布</button>
					</div>
					</form>
			</nav>
			
			<%-- <form role="form" action="${pageContext.request.contextPath }/user/publish.do" method="post">
					
			</form> --%>
<div id="myCarousel" style="width:1138px; height:450px;" class="carousel slide" data-ride="carousel" data-interval="2000">>
    <!-- 轮播（Carousel）指标 -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>   
    <!-- 轮播（Carousel）项目 -->
    <div class="carousel-inner">
    	<c:forEach items="${gunTuList }" var="GT" begin="0" end="0">
    		<!-- 激活轮播项目 -->
    		<div class="item active">
            	<a href="${GT.link }" target="_blank"><img src="${pageContext.request.contextPath }/${GT.img }"  title="${GT.title }" style="width:1138px; height:450px;"></a>
     		</div>
     		<c:forEach items="${gunTuList }" var="guntu" begin="1">
		    	<div class="item">
		            <a href="${guntu.link }" target="_blank"><img src="${pageContext.request.contextPath }/${guntu.img }"  title="${guntu.title }" style="width:1138px; height:450px;"></a>
		        </div>
    		</c:forEach>
    	</c:forEach>
    
    </div>
    <!-- 轮播（Carousel）导航 -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
</div>

<c:forEach items="${liuYanList }" var="ly">
	<div class="row clearfix">
		<div class="col-md-12 column">
		<div class="media well">
			 <!-- 发布人----------------- -->
			 <a href="${pageContext.request.contextPath }/user/personal.do?sno=${ly.sno }" target="_blank" class="pull-left">
				 <img height="120" src="${pageContext.request.contextPath }/${ly.stu.img }" class="media-object" alt='touxiang' /></a>
					<div class="media-body">
						<a href="${pageContext.request.contextPath }/user/personal.do?sno=${ly.sno }" target="_blank">
							<h4 class="media-heading">
								<font color="#FF0000">${ly.stu.username }</font> 
							</h4></a>
		<!-- 发布内容 -->			${ly.liuyan }  
							<a href="${pageContext.request.contextPath }/liuyan/column.do?column=${ly.col }" target="_blank">
							<font color="#80FFFF">#</font><font color="#0080FF">${ly.colName.name }</font><font color="#80FFFF">#</font>
							</a>
							<div class="media">
								 
						 			<!-- 评论----------------- -->
									<form action="${pageContext.request.contextPath }/liuyan/comment.do" method="get">
										<div class="btn-group">
										<button class="btn btn-default" type="button" onclick="location.href='${pageContext.request.contextPath }/liuyan/like.do?id=${ly.id }'">
						 		 	<!-- 点赞数、评论数、转发按钮 -->
						 			<div class="heart" rel="like">${ly.lamount }</div>
						 			</button> 
						 			<button class="btn btn-default" type="button">转发${ly.ramount }</button> 
						 			<button class="btn btn-default" type="button">评论${ly.camount }</button>
						 			<!-- 评论框 -->
						 			</div>
										<span style="float:right"><input  type="text" name="comment" placeholder="说两句吧">
										<input type="hidden" name="id" value="${ly.id }">
										<input type="submit" class="btn btn-default" value="评论"></span>
									</form>
								<!-- 赞的人----------------- -->
								<c:forEach items="${ly.likes }" var="like">
									<a href="${pageContext.request.contextPath }/user/personal.do?sno=${like.sno }" target="_blank">
									${like.stu.username }、</a>
								</c:forEach>
								<c:if test="${ly.lamount >0}">等觉得很赞！</c:if>
								<!-- 评论的人----------------- -->
								<div ><br>
									<ul  class="list-group">
									<c:forEach items="${ly.comments }" var="comment">
										<li class="list-group-item">
										<a href="${pageContext.request.contextPath }/user/personal.do?sno=${comment.sno }" target="_blank" class="pull-left">
										<img src="${pageContext.request.contextPath }/${comment.stu.img }" height="30px"> ${comment.stu.username }
										</a>
										:${comment.comment }</li>
									</c:forEach>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
	</c:forEach>	

		</div>
	</div>
</div>
</body>
</html>