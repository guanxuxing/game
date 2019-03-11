<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <title>t</title>
</head>
<body>

<c:forEach items="${sl}" var="item">
   <a href="<%=basePath%>route/gbg?g_id=${item.id}"> ${item.name} ${item.priceDesc} </a> <br/>
</c:forEach>

<a href="/db2.jsp?_cmd=95+">返回</a><br/><a href="/db2.jsp?_cmd=96+">返回游戏</a><br/>

</body>
</html>
