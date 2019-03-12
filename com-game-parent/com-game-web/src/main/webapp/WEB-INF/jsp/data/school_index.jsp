<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <title>夺宝中华侠客行-三区</title>
</head>
<body>
<p>
    <a href="<%=basePath%>route/sl">帮派排行</a><br/>
    <a href="/db2.jsp?_cmd=42+">预备帮派</a><br/>
    <a href="/db2.jsp?_cmd=43+">创建帮派</a><br/>
    <a href="/db2.jsp?_cmd=44+">返回</a><br/>
    <a href="/db2.jsp?_cmd=45+">返回游戏</a><br/>
</p>
</body>
</html>
