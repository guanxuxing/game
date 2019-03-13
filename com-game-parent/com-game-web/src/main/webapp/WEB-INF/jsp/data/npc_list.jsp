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

    <title>n</title>
</head>

<body>
<p>
<%--<a href="/db1.jsp?_cmd=57+">少林寺第一代弟子「123」戏</a><br/>
<a href="/db1.jsp?_cmd=58+">魔教第二代弟子殉道</a><br/>
<a href="/db1.jsp?_cmd=59+">唐门第一代长老连天</a><br/>
<a href="/db1.jsp?_cmd=60+">魔教第一代长老「身无彩凤双飞翼」遥控器&lt;睡眠中&gt;</a><br/>--%>
    <c:forEach items="${list}" var="item">
       【 <a href="<%=basePath%>route/gcn?n_c=${item.npcCode}">${item.npcName}</a> 】<br/>
    </c:forEach>
<a href="/db1.jsp?_cmd=61+">返回</a><br/>
<a href="/db1.jsp?_cmd=62+">返回游戏</a><br/>
</p>
</body>
</html>
