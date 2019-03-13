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
    <title>夺宝中华侠客行-随身物品</title>
</head>
<body>
<!-- 物品里面就只有装备，药品跟钱，别的没有 -->
【个人物品信息】<br/>
<c:forEach items="${ugs}" var="item">
    名称:<a href="<%=basePath%>route/gugs?goodsId=${item.goodsId}"> ${item.goods_name}</a>  数量:${item.goods_num} <br/>
</c:forEach>
<br/>
<a href="/db2.jsp?_cmd=62+">返回</a><br/>
<a href="/db2.jsp?_cmd=63+">返回游戏</a><br/>
</body>
</html>
