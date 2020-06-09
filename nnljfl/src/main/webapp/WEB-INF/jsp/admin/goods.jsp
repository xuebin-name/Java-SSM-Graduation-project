<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  %>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
	<link rel="stylesheet" href="${APP_PATH }/static/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${APP_PATH }/static/css/font-awesome.min.css">
	<link rel="stylesheet" href="${APP_PATH }/static/css/main.css">
	<style>
	.tree li {
        list-style-type: none;
		cursor:pointer;
	}
	.tree-closed {
	    height : 40px;
	    
	}
	.tree-expanded {
	    height : auto;
	}
	td{
text-align: center;

}
th{text-align: center;}
	</style>
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <div><a class="navbar-brand" style="font-size:32px;" href="#">暖暖垃圾分类-后台管理系统</a></div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li style="padding-top:8px;">
				<div class="btn-group">
				  <button type="button" class="btn btn-default btn-success dropdown-toggle" data-toggle="dropdown">
					<i class="glyphicon glyphicon-user"></i> ${admin.adminName}<span class="caret"></span>
				  </button>
					  <ul class="dropdown-menu" role="menu">
						<li><a href="#"><i class="glyphicon glyphicon-cog"></i> 个人设置</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-comment"></i> 消息</a></li>
						<li class="divider"></li>
						<li><a href="index.html"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
					  </ul>
			    </div>
			</li>
            <li style="margin-left:10px;padding-top:8px;">
				<button type="button" class="btn btn-default btn-danger">
				  <span class="glyphicon glyphicon-question-sign"></span> 帮助
				</button>
			</li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="查询">
          </form>
        </div>
      </div>
    </nav>
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
			<div class="tree">
				<ul style="padding-left:0px;" class="list-group">
					<li class="list-group-item tree-closed" >
						<a href="#"><i class="glyphicon glyphicon-dashboard"></i> 控制面板</a> 
					</li>
					<li class="list-group-item tree-closed">
						<span><i class="glyphicon glyphicon glyphicon-tasks"></i> 信息管理 <span class="badge" style="float:right">3</span></span> 
						<ul style="margin-top:10px;display:none;">
							<li style="height:30px;">
								<a href="${APP_PATH }/user/main"><i class="glyphicon glyphicon-king"></i> 个人信息管理</a> 
							</li>
							
							<li style="height:30px;">
								<a href="${APP_PATH }/goods/index"><i class="glyphicon glyphicon-lock"></i> 订单信息</a> 
							</li>
						</ul>
					</li>
					<li class="list-group-item tree-closed">
						<span><i class="glyphicon glyphicon-ok"></i>垃圾管理 <span class="badge" style="float:right">3</span></span> 
						<ul style="margin-top:10px;display:none;">
							<li style="height:30px;">
								<a href="${APP_PATH }/rubbish/index"><i class="glyphicon glyphicon-check"></i> 已存在垃圾</a> 
							</li>
							
						</ul>
					</li>
					<li class="list-group-item tree-closed">
						<span><i class="glyphicon glyphicon-th-large"></i> 投放 <span class="badge" style="float:right">7</span></span> 
						<ul style="margin-top:10px;display:none;">
							<li style="height:30px;">
								<a href="cert.html"><i class="glyphicon glyphicon-picture"></i> 资质维护</a> 
							</li>
							<li style="height:30px;">
								<a href="type.html"><i class="glyphicon glyphicon-equalizer"></i> 分类管理</a> 
							</li>
							<li style="height:30px;">
								<a href="process.html"><i class="glyphicon glyphicon-random"></i> 流程管理</a> 
							</li>
							<li style="height:30px;">
								<a href="advertisement.html"><i class="glyphicon glyphicon-hdd"></i> 广告管理</a> 
							</li>
							<li style="height:30px;">
								<a href="message.html"><i class="glyphicon glyphicon-comment"></i> 消息模板</a> 
							</li>
							<li style="height:30px;">
								<a href="project_type.html"><i class="glyphicon glyphicon-list"></i> 项目分类</a> 
							</li>
							<li style="height:30px;">
								<a href="tag.html"><i class="glyphicon glyphicon-tags"></i> 项目标签</a> 
							</li>
						</ul>
					</li>
					<li class="list-group-item tree-closed" >
						<a href="param.html"><i class="glyphicon glyphicon-list-alt"></i> 参数管理</a> 
					</li>
				</ul>
			</div>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<div class="panel panel-default">
			  <div class="panel-heading">
				<h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
			  </div>
			  <div class="panel-body">
				
				<br>
 <hr style="clear:both;">
          <div class="table-responsive">
          
            <table class="table  table-hover" id="orders_table">
              <thead>
                <tr >
                  
				  
                  <th >id</th>
                  <th >用户姓名</th>
                  <th >联系电话</th>
                  <th>日期</th>
                  <th>联系地址</th>
                  <th style="text-align: center;" width="200">处理状态</th>
                </tr>
              </thead>
              <tbody>
              </tbody>
			 
            </table>
          </div>
          <!-- 显示分页信息 -->
		<div class="row">
			<!--分页文字信息  -->
			<div class="col-md-6" id="page_info_area"></div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
				
			</div>
		</div>
			  </div>
			  
			</div>
        </div>
      </div>
    </div>
    <script src="${APP_PATH }/static/jquery/jquery-2.1.1.min.js"></script>
    <script src="${APP_PATH }/static/bootstrap/js/bootstrap.min.js"></script>
	<script src="${APP_PATH }/static/script/docs.min.js"></script>
	<script src="${APP_PATH}/static/layer/layer.js"></script>
        <script type="text/javascript">
        var totalRecord,currentPage;
            $(function () {
			    $(".list-group-item").click(function(){
                    // jquery对象的回调方法中的this关键字为DOM对象
                    // $(DOM) ==> JQuery
				    if ( $(this).find("ul") ) { // 3 li
						$(this).toggleClass("tree-closed");
						if ( $(this).hasClass("tree-closed") ) {
							$("ul", this).hide("fast");
						} else {
							$("ul", this).show("fast");
						}
					}
				});
			    to_page(1)
            });
        	
            function to_page(pn){
            	//$("#rubbish_table tbody").empty();
    			$.ajax({
    				url:"${APP_PATH}/goods/getorder",
    				data:"pn="+pn,
    				type:"GET",
    				success:function(result){
    					console.log(result);
    					//1、解析并显示员工数据
    					build_orders_table(result);
    					//2、解析并显示分页信息
    					build_page_info(result);
    					//3、解析显示分页条数据
    					build_page_nav(result);
    				}
    			});
    		}
            function timestamp_todate(item){
            	var datetime = new Date();
            	datetime.setTime(item);
            	//alert(datetime.toTimeString().substr(0, 8));
        		var year = datetime.getFullYear();
        		var month = datetime.getMonth()+1;
        		var date = datetime.getDate();
        		var hour = datetime.getHours();
        		var minute = datetime.getMinutes();
        		var second = datetime.getSeconds();
        		return year+"-"+month+"-"+date+"-"+hour+":"+minute+":"+second;
            }
            function build_orders_table(result){
            	$("#orders_table tbody").empty();
            	var orders = result.extend.pageInfo.list;
            	//alert(orders);
            	$.each(orders,function(index,item){
            		var stuts;
            		
            		if(item.rubbisStuts==0){
            			stuts =$("<td></td>").append("订单待处理").addClass("color : red");
            		}else{
            			stuts= $("<td></td>").append("已处理");
            		}
    				var orderIdTd = $("<td></td>").append(item.orderId);
    				var userNameTd = $("<td></td>").append(item.userName);
    				var userPhoneTd = $("<td></td>").append(item.userPhone);
    				var riqi = $("<td></td>").append(timestamp_todate(item.date));
    				
    				var userAddressTd = $("<td></td>").append(item.userAddress);
    				
    				var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
    								.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("处理");
    				//为编辑按钮添加一个自定义的属性，来表示当垃圾工id
    				editBtn.attr("edit-id",item.orderId);
    				
    				
    				//为删除按钮添加一个自定义的属性来表示当前删除的垃圾id
    				
    				var btnTd = $("<td></td>").append(editBtn);
    				//var delBtn = 
    				//append方法执行完成以后还是返回原来的元素
    				$("<tr></tr>")
    					
    					.append(orderIdTd)
    					.append(userNameTd)
    					.append(userPhoneTd)
    					.append(riqi)
    					.append(userAddressTd)
    					.append(stuts)
    					.append(btnTd)
    					.appendTo("#orders_table tbody");
            	})
            }
          //解析显示分页信息
    		function build_page_info(result){
    			$("#page_info_area").empty();
    			$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
    					result.extend.pageInfo.pages+"页,总"+
    					result.extend.pageInfo.total+"条记录");
    			totalRecord = result.extend.pageInfo.total;
    			currentPage = result.extend.pageInfo.pageNum;
    		}
    		//解析显示分页条，点击分页要能去下一页....
    		function build_page_nav(result){
    			//page_nav_area
    			$("#page_nav_area").empty();
    			var ul = $("<ul></ul>").addClass("pagination");
    			
    			//构建元素
    			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
    			var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
    			if(result.extend.pageInfo.hasPreviousPage == false){
    				firstPageLi.addClass("disabled");
    				prePageLi.addClass("disabled");
    			}else{
    				//为元素添加点击翻页的事件
    				firstPageLi.click(function(){
    					to_page(1);
    				});
    				prePageLi.click(function(){
    					to_page(result.extend.pageInfo.pageNum -1);
    				});
    			}
    			
    			
    			
    			var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
    			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
    			if(result.extend.pageInfo.hasNextPage == false){
    				nextPageLi.addClass("disabled");
    				lastPageLi.addClass("disabled");
    			}else{
    				nextPageLi.click(function(){
    					to_page(result.extend.pageInfo.pageNum +1);
    				});
    				lastPageLi.click(function(){
    					to_page(result.extend.pageInfo.pages);
    				});
    			}
    			
    			
    			
    			//添加首页和前一页 的提示
    			ul.append(firstPageLi).append(prePageLi);
    			//1,2，3遍历给ul中添加页码提示
    			$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
    				
    				var numLi = $("<li></li>").append($("<a></a>").append(item));
    				if(result.extend.pageInfo.pageNum == item){
    					numLi.addClass("active");
    				}
    				numLi.click(function(){
    					to_page(item);
    				});
    				ul.append(numLi);
    			});
    			//添加下一页和末页 的提示
    			ul.append(nextPageLi).append(lastPageLi);
    			
    			//把ul加入到nav
    			var navEle = $("<nav></nav>").append(ul);
    			navEle.appendTo("#page_nav_area");
    		}
	
    		$(document).on("click",".edit_btn",function(){
    			//alert($(this).attr("edit-id"));
    			var id = $(this).attr("edit-id");
    			$.ajax({
    				url:"${APP_PATH}/goods/update/"+id,
    				type:"PUT",
    				success:function(result){
    					console.log(result);
    					if(result.code==100){
							layer.msg("订单处理成功", {time:1000, icon:6}, function(){
	                        	
	                        });
							to_page(currentPage);
    					}else{
							layer.msg("订单处理失败，请重新操作", {time:2000, icon:5, shift:6}, function(){
	                        	
	                        });
    					}
    					
    				}
    				
    			})
    				
    		})
    		
        </script>
  </body>
</html>

