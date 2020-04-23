<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>

    <link type="text/css"  rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/wangEditor.min.js"></script>
</head>
<body>
	
	<div class="container" align="center" >
        <h2 class="text-center vitar">账号注册</h2><br/>
        
        <form method="post" class="form-inline" role="form" action="UsersController?op=add"  >
        	<table >
        		<tr>
        			<td>身份证号:</td>
        			<td> <input name="cardId"   type="text"   ></td>
        		</tr>
        		<tr>
        			<td>用户名:</td>
        			<td> <input name="name"  type="text"></td>
        		</tr>
        		<tr>
        			<td>密码:</td>
        			<td> <input name="password"  type="password"></td>
        		</tr>
        		<tr>
        			<td>确认密码:</td>
        			<td> <input name="repassword"  type="password"></td>
        		</tr>
        		
        		<tr>
        			<td class="text-center" > 
        			<input value="注册"    type="submit"  class="form-control btn-primary ">
        			</td>
        			<td><a href="login.jsp">返回</a></td>
        		</tr>
        	</table>
           	
        </form>
        
        
	</div>

</body>
</html>