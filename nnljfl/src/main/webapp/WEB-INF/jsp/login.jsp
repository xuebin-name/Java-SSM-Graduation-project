<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
	<link rel="stylesheet" href="${APP_PATH }/static/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${APP_PATH }/static/css/font-awesome.min.css">
	<link rel="stylesheet" href="${APP_PATH }/static/css/main.css">

	
	<style>
	body{
		background: url("${APP_PATH }/static/img/bodyimg.jpg");
		background-repeat:no-repeat ;
		background-size:cover;
		background-attachment: fixed;
	}
	.formbody{
		margin:auto;
		width: 400px;
		htight:400px;
		margin-top: 200px;
		background-color:rgba(255,255,255,0.5);
		border-radius: 40px;
	}
	.icon{
		display:inline-block;
		width:100px;
		height:100px;
		background-image: url("${APP_PATH }/static/img/user.png");
		background-color:rgba(255,255,255,0.5);
		padding: 20px;
		border-radius: 50px;
	}
	</style>
  </head>
  <body>
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <div><a class="navbar-link" style="font-size:32px;">暖暖垃圾分类后台管理系统</a></div>
        </div>
      </div>
    </nav>

    <div class="container">
	<div class="formbody">
      <form class="form-signin" role="form">
      <div style="text-align: center;">
      <span class="icon"></span>
        <h2 class="form-signin-heading">用户登录</h2>
      </div>
		  <div class="form-group has-success has-feedback">
			<input type="text" class="form-control" id="phone" placeholder="请输入手机号" autofocus>
			<span class="glyphicon glyphicon-user form-control-feedback"></span>
		  </div>
		  <div class="form-group has-success has-feedback">
			<input type="password" class="form-control" id="password" placeholder="请输入登录密码" style="margin-top:10px;">
			<span class="glyphicon glyphicon-lock form-control-feedback"></span>
		  </div>
	
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住我
          </label>
          <br>
          <label>
            忘记密码
          </label>
          <label style="float:right">
            <a href="#">我要注册</a>
          </label>
        </div>
        <a class="btn btn-lg btn-block" onclick="dologin()" > 登录</a>
      </form>
      </div>
    </div>
    <script src="${APP_PATH }/static/jquery/jquery-2.1.1.min.js"></script>
    <script src="${APP_PATH }/static/bootstrap/js/bootstrap.min.js"></script>
	<script src="${APP_PATH }/static/layer/layer.js"></script>
    <script>
    function dologin() {
    	 var phone =  $("#phone").val();
    	  var password = $("#password").val();
    	  var check =/^1[3456789]\d{9}$/ ;
    	  var loadingIndex = null;
    	  //alert(check.test(phone));
    	  if(check.test(phone)!=true){
    		 //alert(check.test(phone));
    		 //alert(phone);
    		  layer.msg("用户登录账号不能为空，请输入", {time:2000, icon:5, shift:6}, function(){
              	
              });
          	return;
    	  }
    	  var loadingIndex = null;
    	  $.ajax({
          	type : "POST",
          	url  : "dologin",
          	data : {
          		"phone" : phone,
          		"password"  : password
          	},
          	beforeSend : function(){
          		loadingIndex = layer.msg('处理中', {icon: 16});
          	},
          	success : function(result) {
          		layer.close(loadingIndex);
          		
          		if (result.success) {
          			window.location.href = "index";
          		} else {
                      layer.msg("用户登录账号或密码不正确，请重新输入", {time:2000, icon:5, shift:6}, function(){
                      	
                      });
          		}
          	}
          });
    }

    </script>
  </body>
</html>