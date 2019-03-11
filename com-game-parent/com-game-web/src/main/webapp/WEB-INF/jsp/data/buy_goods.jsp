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
<p>
    冷板凳来到了这里。<br/>
    请输入你想一次购买布衣的数目（范围一到五十）
<form action='/db2.jsp'>
    <input type='hidden' name='_cmd' value='82 '/>
    <input name='_arg'/><input type='submit' value='确定'/>
</form><br/><a href="/db2.jsp?_cmd=83+">我只买一个布衣</a><br/>
<a href="/db2.jsp?_cmd=84+">返回</a><br/>
<a href="/db2.jsp?_cmd=85+">返回游戏</a><br/>
</p>
</body>
</html>
