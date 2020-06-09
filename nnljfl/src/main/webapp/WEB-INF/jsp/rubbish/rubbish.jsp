<%@page pageEncoding="UTF-8"%>
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
	<link rel="stylesheet" href="${APP_PATH }/static/css/doc.min.css">
	<style>
	.tree li {
        list-style-type: none;
		cursor:pointer;
	}
	table tbody tr:nth-child(odd){background:#F4F4F4;}
	table tbody td:nth-child(even){color:#C00;}
td{
text-align: center;
}
th{text-align: center;}
	</style>
  </head>

  <body>
<!-- 员工修改的模态框 -->
<div class="modal fade" id="rubbishUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">垃圾修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">垃圾名称</label>
		    <div class="col-sm-10">
		      	<p class="form-control-static" id="rubbishName_update_static"></p>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">垃圾介绍</label>
		    <div class="col-sm-10">
		      <input type="text" name="rubbishTitle" class="form-control" id="rubbishTitle_update_input" placeholder="">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">垃圾类型</label>
		    <div class="col-sm-4">
		    	<!-- 部门提交类型id即可 -->
		      <select class="form-control" name="typeId">
		      </select>
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="rubbish_update_btn">更新</button>
      </div>
    </div>
  </div>
</div>

<!-- 员工添加的模态框 -->
<div class="modal fade" id="rubbishAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">垃圾添加</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">垃圾名称</label>
		    <div class="col-sm-10">
		      <input type="text" name="rubbishName" class="form-control" id="rubbishName_add_input" placeholder="请输入垃圾名称">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">垃圾介绍</label>
		    <div class="col-sm-10">
		      <input type="text" name="rubbishTitle" class="form-control" id="rubbishTitle_add_input" placeholder="请简短介绍该垃圾">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">垃圾类型</label>
		    <div class="col-sm-4">
		    	<!-- 部门提交部门id即可 -->
		      <select class="form-control" name="typeId">
		      </select>
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="rubbish_save_btn">保存</button>
      </div>
    </div>
  </div>
</div>


    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
            <div><a class="navbar-brand" style="font-size:32px;" href="user.html">暖暖垃圾分类 - 用户维护</a></div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li style="padding-top:8px;">
				<div class="btn-group">
				  <button type="button" class="btn btn-default btn-success dropdown-toggle" data-toggle="dropdown">
					<i class="glyphicon glyphicon-user"></i> ${admin.adminName} <span class="caret"></span>
				  </button>
					  <ul class="dropdown-menu" role="menu">
						<li><a href="#"><i class="glyphicon glyphicon-cog"></i> 个人设置</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-comment"></i> 消息</a></li>
						<li class="divider"></li>
						<li><a href="login.html"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
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
            <input type="text" class="form-control" placeholder="Search...">
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
<form class="form-inline" role="form" style="float:left;">
  <div class="form-group has-feedback">
    <div class="input-group">
      <div class="input-group-addon">查询条件</div>
      <input class="form-control has-success" type="text" placeholder="请输入查询条件">
    </div>
  </div>
  <button type="button" class="btn btn-warning"><i class="glyphicon glyphicon-search"></i> 查询</button>
</form>
<button type="button" class="btn btn-danger" style="float:right;margin-left:10px;"id="rubbish_delete_all_btn"><i class=" glyphicon glyphicon-remove"></i> 删除</button>
<button type="button" class="btn btn-primary" style="float:right;"id="rubbish_add_modal_btn"><i class="glyphicon glyphicon-plus"></i> 新增</button>
<br>
 <hr style="clear:both;">
          <div class="table-responsive">
          
            <table class="table  table-hover" id="rubbishs_table">
              <thead>
                <tr >
                  
				  <th  width="30"><input type="checkbox" id="check_all"></th>
                  <th >id</th>
                  <th >垃圾名称</th>
                  <th >垃圾介绍</th>
                  <th>垃圾类型</th>
                  <th style="text-align: center;">类型描述</th>
                  <th style="text-align: center;" width="200">操作</th>
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
				    if ( $(this).find("ul") ) {
						$(this).toggleClass("tree-closed");
						if ( $(this).hasClass("tree-closed") ) {
							$("ul", this).hide("fast");
						} else {
							$("ul", this).show("fast");
						}
					}
				    
				});
			    to_page(1);
            });
            function to_page(pn){
            	//$("#rubbish_table tbody").empty();
    			$.ajax({
    				url:"${APP_PATH}/rubbish/adrubbish",
    				data:"pn="+pn,
    				type:"GET",
    				success:function(result){
    					//console.log(result);
    					//1、解析并显示员工数据
    					build_emps_table(result);
    					//2、解析并显示分页信息
    					build_page_info(result);
    					//3、解析显示分页条数据
    					build_page_nav(result);
    				}
    			});
    		}
            
            function build_emps_table(result){
            	$("#rubbishs_table tbody").empty();
            	var rubbish = result.extend.pageInfo.list;
            	$.each(rubbish,function(index,item){
            		//alert(item.rubbishName);
            		var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
    				var rubbishIdTd = $("<td></td>").append(item.rubbishId);
    				var rubbishNameTd = $("<td></td>").append(item.rubbishName);
    				var rubbishTitleTd = $("<td></td>").append(item.rubbishTitle);
    				var typeNameTd = $("<td></td>").append(item.typeModel.typeName);
    				var typeDatilTd = $("<td></td>").append(item.typeModel.typeDatil);
    	
    				var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
    								.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
    				//为编辑按钮添加一个自定义的属性，来表示当垃圾工id
    				editBtn.attr("edit-id",item.rubbishId);
    				
    				var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
    								.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
    				//为删除按钮添加一个自定义的属性来表示当前删除的垃圾id
    				delBtn.attr("del-id",item.rubbishId);
    				var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
    				//var delBtn = 
    				//append方法执行完成以后还是返回原来的元素
    				$("<tr></tr>")
    					.append(checkBoxTd)
    					.append(rubbishIdTd)
    					.append(rubbishNameTd)
    					.append(rubbishTitleTd)
    					.append(typeNameTd)
    					.append(typeDatilTd)
    					.append(btnTd)
    					.appendTo("#rubbishs_table tbody");
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
            
    		//清空表单样式及内容
    		function reset_form(ele){
    			$(ele)[0].reset();
    			//清空表单样式
    			$(ele).find("*").removeClass("has-error has-success");
    			$(ele).find(".help-block").text("");
    		}
    		
    		//点击新增按钮弹出模态框。
    		$("#rubbish_add_modal_btn").click(function(){
    			//清除表单数据（表单完整重置（表单的数据，表单的样式））
    			reset_form("#rubbishAddModal form");
    			//s$("")[0].reset();
    			//发送ajax请求，查出分类信息，显示在下拉列表中
    			getDepts("#rubbishAddModal select");
    			//弹出模态框
    			$("#rubbishAddModal").modal({
    				backdrop:"static"
    			});
    		});
    		
    		function getDepts(ele){
    			//清空之前下拉列表的值
    			$(ele).empty();
    			$.ajax({
    				url:"${APP_PATH}/typemodel/getmodel",
    				type:"GET",
    				success:function(result){
    					//{"code":100,"msg":"处理成功！",
    						
    					//console.log(result);
    					//显示分类信息在下拉列表中
    					//$("#rubbishAddModal select").append("")
    					$.each(result.extend.typemodel,function(){
    						var optionEle = $("<option></option>").append(this.typeName).attr("value",this.typeId);
    						optionEle.appendTo(ele);
    					});
    				}
    			});
    		}
    		
    		//点击保存，保存员工。
    		$("#rubbish_save_btn").click(function(){
    			//2、发送ajax请求保存员工
    			$.ajax({
    				url:"${APP_PATH}/rubbish/saverubbish",
    				type:"POST",
    				data:$("#rubbishAddModal form").serialize(),
    				success:function(result){
    					//alert(result.msg);
    					if(result.code == 100){
    						//垃圾保存成功；
    						layer.msg("垃圾信息保存成功", {time:1000, icon:6}, function(){
		                        	
		                        });
    						//1、关闭模态框
    						$("#rubbishAddModal").modal('hide');
    						//2、来到最后一页，显示刚才保存的数据
    						//发送ajax请求显示最后一页数据即可
    						to_page(totalRecord);
    					}else{
    						//显示失败信息
    						layer.msg("垃圾信息保存失败，请重新操作", {time:2000, icon:5, shift:6}, function(){
	                        	
	                        });
    					}
    				}
    			});
    		});
    			
    		$(document).on("click",".edit_btn",function(){
    			//alert("edit");
    			
    			//1、查出部门信息，并显示部门列表
    			getDepts("#rubbishUpdateModal select");
    			//2、查出垃圾信息，显示垃圾信息
    			getEmp($(this).attr("edit-id"));
    			//alert($(this).attr("edit-id"));
    			//3、把员工的id传递给模态框的更新按钮
    			$("#rubbish_update_btn").attr("edit-id",$(this).attr("edit-id"));
    			$("#rubbishUpdateModal").modal({
    				backdrop:"static"
    			});
    		});
    			
    		
    		function getEmp(id){
    			$.ajax({
    				url:"${APP_PATH}/rubbish/getAll/"+id,
    				type:"GET",
    				success:function(result){
    					//console.log(result);
    					var rubbishData = result.extend.rubbish;
    					$("#rubbishName_update_static").text(rubbishData.rubbishName);
    					$("#rubbishTitle_update_input").val(rubbishData.rubbishTitle);
    					$("#rubbishUpdateModal select").val([rubbishData.typeId]);
    				}
    			});
    		}
    		
    		//点击更新，更新员工信息
    		$("#rubbish_update_btn").click(function(){

    			//1、发送ajax请求保存更新的员工数据
    			$.ajax({
    				url:"${APP_PATH}/rubbish/edit/"+$(this).attr("edit-id"),
    				type:"PUT",
    				data:$("#rubbishUpdateModal form").serialize(),
    				success:function(result){
    					console.log(result);
    					if(result.code==100){
    						layer.msg("垃圾信息更改成功", {time:1000, icon:6}, function(){
	                        	
	                        });
    						//1、关闭对话框
    						$("#rubbishUpdateModal").modal("hide");
    						//2、回到本页面
    						to_page(currentPage);
    					}else{
							layer.msg("垃圾信息更改失败，请重新操作", {time:2000, icon:5, shift:6}, function(){
	                        	
	                        });
    					}
    				}
    			});
    		});
    		
    		//单个删除
    		$(document).on("click",".delete_btn",function(){
    			//1、弹出是否确认删除对话框
    			var rubbishName = $(this).parents("tr").find("td:eq(2)").text();
    			var rubbishId = $(this).attr("del-id");
    			//alert($(this).parents("tr").find("td:eq(1)").text());
    			if(confirm("确认删除【"+rubbishName+"】吗？")){
    				//确认，发送ajax请求删除即可
    				$.ajax({
    					url:"${APP_PATH}/rubbish/delete/"+rubbishId,
    					type:"DELETE",
    					success:function(result){
						layer.msg("删除成功", {time:1000, icon:6}, function(){
	                        	
	                        });
    						//回到本页
    						to_page(currentPage);
    					}
    				});
    			}
    		});
    		//完成全选/全不选功能
    		$("#check_all").click(function(){
    			//attr获取checked是undefined;
    			//我们这些dom原生的属性；attr获取自定义属性的值；
    			//prop修改和读取dom原生属性的值
    			$(".check_item").prop("checked",$(this).prop("checked"));
    		});
    		//check_item
    		$(document).on("click",".check_item",function(){
    			//判断当前选择中的元素是否5个
    			var flag = $(".check_item:checked").length==$(".check_item").length;
    			$("#check_all").prop("checked",flag);
    		});
    		
    		//点击全部删除，就批量删除
    		$("#rubbish_delete_all_btn").click(function(){
    			//
    			var rubbishNames = "";
    			var del_idstr = "";
    			$.each($(".check_item:checked"),function(){
    				//this
    				rubbishNames += $(this).parents("tr").find("td:eq(2)").text()+",";
    				//组装员工id字符串
    				del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
    			});
    			//去除empNames多余的,
    			rubbishNames = rubbishNames.substring(0, rubbishNames.length-1);
    			//去除删除的id多余的-
    			del_idstr = del_idstr.substring(0, del_idstr.length-1);
    			if(confirm("确认删除【"+rubbishNames+"】吗？")){
    				//发送ajax请求删除
    				$.ajax({
    					url:"${APP_PATH}/rubbish/delete/"+del_idstr,
    					type:"DELETE",
    					success:function(result){
							layer.msg("删除成功", {time:1000, icon:6}, function(){
	                        	
	                        });
    						//回到当前页面
    						to_page(currentPage);
    					}
    				});
    			}
    		});
    		
            $("tbody .btn-success").click(function(){
                window.location.href = "assignRole.html";
            });
            $("tbody .btn-primary").click(function(){
                window.location.href = "edit.html";
            });
        </script>
  </body>
</html>
