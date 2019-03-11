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
    商店(买东西)<br/>
    这里可以买卖东西。<br/>
    <a href="<%=basePath%>route/ssl">买东西</a>|
    <a href="/db2.jsp?_cmd=50+">卖东西</a><br/>

    你遇到了<a href="/db2.jsp?_cmd=51+">竹剑。</a><br/>
    请选择你的行走方向：<br/><div style="text-align:right;">
    <a href="/db2.jsp?_cmd=52+">东：镜湖(挣钱) →</a>

    <br/></div><br/>
<a href="/db2.jsp?_cmd=53+">任务</a>|
<a href="/db2.jsp?_cmd=54+">状态</a>|<a href="/db2.jsp?_cmd=55+">个人</a>|
<a href="/db2.jsp?_cmd=56+">武功</a><br/>
<a href="/db2.jsp?_cmd=57+">心法</a>|
<a href="/db2.jsp?_cmd=58+">物品</a>|
<a href="/db2.jsp?_cmd=59+">公聊</a>|
<a href="/db2.jsp?_cmd=60+">交流</a><br/>
<a href="/db2.jsp?_cmd=61+">关系</a>|
<a href="/db2.jsp?_cmd=62+">帮派</a>|
<a href="/db2.jsp?_cmd=63+">双倍</a>|
<a href="/db2.jsp?_cmd=64+">帮助</a><br/>
<a href="/db2.jsp?_cmd=65+">新手引导</a>|||
<a href="/db2.jsp?_cmd=66+">环顾四方</a><br/>
<a href="/db2.jsp?_cmd=67+">返回长安客栈</a><br/>
<a href="/db2.jsp?_cmd=68+">返回首页</a>|||
<a href="/db2.jsp?_cmd=69+">元宝商城</a><br/><br/>
</p>
</body>
</html>
