<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
  
	    <base href="<%=basePath%>">
	  	<meta charset="UTF-8">
	    <title>用户列表</title>
		<link rel="stylesheet" type="text/css" href="/assets/css/bootstrap.min.css">
		<script type="text/javascript" src="/assets/js/jquery-1.8.3.js"></script>
		<script type="text/javascript" src="/assets/js/bootstrap.min.js"></script>
	</head>
  
	<body>
    	<div class="navbar navbar-default">
		    <div class="container">
		        <!-- Brand and toggle get grouped for better mobile display -->
		        <div class="navbar-header">
		            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		                <span class="sr-only">Toggle navigation</span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		            </button>
		            <a class="navbar-brand" href="#">用户管理系统</a>
		        </div>
		
		        <!-- Collect the nav links, forms, and other content for toggling -->
		        <div class="collapse navbar-collapse">
		            <ul class="nav navbar-nav">
		                <li class="active"><a href="#">首页 <span class="sr-only">(current)</span></a></li>
		                <li><a href="#">关于我们</a></li>
		            </ul>
		            <ul class="nav navbar-nav navbar-right">
		                <li class="dropdown">
		                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">张三 <span class="caret"></span></a>
		                    <ul class="dropdown-menu">
		                        <li><a href="#">详细信息</a></li>
		                        <li role="separator" class="divider"></li>
		                        <li><a href="#">安全退出</a></li>
		                    </ul>
		                </li>
		            </ul>
		        </div><!-- /.navbar-collapse -->
		    </div><!-- /.container-fluid -->
		</div>
    
    	<div class="container">
    		<div class="row">
    			<div class="panel panel-default">
    				<div class="panel-heading">用户列表 <a href="users/save" class="btn btn-primary pull-right" style="margin-top:-7px;">添加用户</a></div>
    				<table class="table table-hover table-bordered">
    					<tr>
    						<th>ID</th>
    						<th>用户名</th>
    						<th>密码</th>
    						<th>邮箱</th>
    						<th>操作</th>
    					</tr>
    					
    					<c:forEach items="${users }" var="user">
    						<tr>
    							<td>${user.id }</td>
    							<td>${user.username }</td>
    							<td>${user.password }</td>
    							<td>${user.email }</td>
    							<td>
    								<a href="users/update/${user.id}" class="btn btn-warning">修改</a>
    								<a href="users/delete/${user.id }" class="btn btn-danger">删除</a>
    							</td>
    						</tr>
    					</c:forEach>
    				</table>
    			</div>
    		</div>
    	</div>	
	</body>
</html>
