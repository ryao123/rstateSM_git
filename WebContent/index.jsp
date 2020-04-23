<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>房产信息查询</title>
<style type="text/css">
	.left1{
		
		width: 200px;
	}
	.left2{
		width: 100px;
	}
	.right{
		border: black 1px solid;
		margin-left: 100px;
	}
</style>

    <link type="text/css"  rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container" align="center" >
        <h2 class="text-center vitar">房产信息查询系统</h2><br/>
    </div>
    <div class="left1" align="left" >
       	<p> 用户名：<strong>${users.name }</strong>&nbsp;&nbsp;&nbsp;<a href="UsersController?op=loginout">退出</a></p>
    </div>
    <div  class="left2" align="left" >
       		<a href="EstateController?op=estateList">房产信息查询</a>
    </div>
      
      <div  class="right" >
      	<div class="container" align="center" >
       		<h4 class="text-center vitar">房产信息查询</h4><br/>
    	
      	 <form method="post"  class="form-inline" role="form"  action="EstateController?op=estateList" >
      	 	<p>查询类型：
      	 		<select name="type">
      	 			<option value="00">请选择</option>
      	 			<option value="01">用户名</option>
      	 			<option value="02">身份证</option>
      	 		</select>
      	 		<input type="text" name="query"/>
      	 		<input type="submit" value="查找"/>
      	 	</p>
        	<table border="1">
        		<tr>
        			<th>序号</th>
        			<th>项目名称</th>
        			<th>产权人</th>
        			<th>身份证号码</th>
        			<th>房屋类型</th>
        			<th>使用面积</th>
        			<th>建造时间</th>
        		</tr>
        		<c:forEach items="${pg.pageLists }" var="r">
	        		<tr>
	        			<td>${r.id }</td>
	        			<td>${r.projectName}</td>
	        			<td>${r.users.name }</td>
	        			<td>${r.cardId }</td>
	        			<td>${r.houseType }</td>
	        			<td>${r.area }</td>
	        			<td><fmt:formatDate value="${r.buildTime }" pattern="YYYY-MM-dd HH:mm:ss"/></td>
	        			
	        		</tr>
        		</c:forEach>
        	</table>
        	<div class="paging" style="border-bottom: 1px solid  #64A26F; color: #006666; ">
    			<span class="fr"><a href="${pageContext.request.contextPath}/EstateController?op=estateList&pageIndex=1">首页</a>&nbsp;
    			<a href="${pageContext.request.contextPath}/EstateController?op=estateList&pageIndex=${pg.currPage-1 }">上一页</a>&nbsp;
    			<a href="${pageContext.request.contextPath}/EstateController?op=estateList&pageIndex=${pg.currPage+1 }">下一页</a>&nbsp;
    			<a href="${pageContext.request.contextPath}/EstateController?op=estateList&pageIndex=${pg.totalPages }">尾页</a>&nbsp;</span>
    			 共有图书${pg.totalCount }种，分${pg.totalPages }页显示，每页显示${pg.pageSize }个商品
    		</div>
        </form>
      </div>
    </div>
	
</body>
</html>