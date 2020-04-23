<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
<style type="text/css">
	
</style>

    <link type="text/css"  rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container" align="center" >
	
	
	
        <h2 class="text-center vitar">房产信息查询系统</h2><br/>
        
        <form method="post" class="form-inline" role="form" action="UsersController?op=login"  >
        	<table >
        		<tr>
        			<td>请输入身份证号:</td>
        			<td> <input name="cardId"   type="text"   ></td>
        		</tr>
        		<tr>
        			<td>请输入密码:</td>
        			<td> <input name="password"  type="password"></td>
        		</tr>
        		<tr>
        			<td  colspan="2" class="text-center"  > 
        			<input value="登录"    type="submit"  class="form-control btn-primary ">
        			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        			 <a href="regist.jsp" style="font-size: 18px">注册</a>
        			</td>
        		</tr>
        	</table>
        </form>
        
	</div>
</body>
</html>