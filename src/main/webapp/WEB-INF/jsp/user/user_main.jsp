<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
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
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron">
			<h1><img src="${pageContext.request.contextPath }/${personal.img }" style="width:200px;height:150px" alt="touXiang">
				
					欢迎访问${personal.username }的主页
				</h1>
				<h2>分享生活  留住感动</h2>
			
			<table style="color:#00000" class="table table-bordered">
				<thead>
					<tr>
						<th>
							学号
						</th>
						<th>
							性别
						</th>
						<th>
							类型
						</th>
						<th>
							学院
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							${personal.sno }
						</td>
						<td>
							<c:if test="${personal.gender==0 }">
								男
							</c:if>
							<c:if test="${personal.gender==1 }">
								女
							</c:if>
						</td>
						<td>
							<c:if test="${personal.type==0 }">
								学生
							</c:if>
							<c:if test="${personal.type==1 }">
								老师
							</c:if>
							<c:if test="${personal.type==2 }">
								组织机构
							</c:if>
						</td>
						<td>
							${personal.dept.name }
						</td>
					</tr>
				</tbody>
			</table>
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
							<a href="${pageContext.request.contextPath }/user/personal.do?col=${ly.colName.name }" target="_blank">
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
								等觉得很赞！
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