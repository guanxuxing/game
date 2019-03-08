<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC  "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <title>夺宝中华侠客行-三区</title>
    <link rel="stylesheet" href="/xhtml/img/default.css" type="text/css"/>
</head>
<body>
<p>商店(买东西)<br/>
    这里可以买卖东西。<br/>
    <a href="/db2.jsp?_cmd=20+">买东西</a>|
    <a href="/db2.jsp?_cmd=21+">卖东西</a><br/>你遇到了<a href="/db2.jsp?_cmd=22+">竹剑。</a>
    <br/>请选择你的行走方向：<br/><div style="text-align:right;"><a href="/db2.jsp?_cmd=23+">东：镜湖(挣钱) →</a><br/></div><br/>
    <a href="/db2.jsp?_cmd=24+">任务</a>|<a href="/db2.jsp?_cmd=25+">状态</a>|<a href="/db2.jsp?_cmd=26+">个人</a>|
    <a href="/db2.jsp?_cmd=27+">武功</a><br/><a href="/db2.jsp?_cmd=28+">心法</a>|
    <a href="/db2.jsp?_cmd=29+">物品</a>|<a href="/db2.jsp?_cmd=30+">公聊</a>|
    <a href="/db2.jsp?_cmd=31+">交流</a><br/><a href="/db2.jsp?_cmd=32+">关系</a>|
    <a href="/db2.jsp?_cmd=33+">帮派</a>|<a href="/db2.jsp?_cmd=34+">双倍</a>|
    <a href="/db2.jsp?_cmd=35+">帮助</a><br/><a href="/db2.jsp?_cmd=36+">新手引导</a>|||
    <a href="/db2.jsp?_cmd=37+">环顾四方</a><br/><a href="/db2.jsp?_cmd=38+">返回长安客栈</a><br/>
   <a href="/db2.jsp?_cmd=39+">返回首页</a>|||<a href="/db2.jsp?_cmd=40+">元宝商城</a><br/><br/>
</p>
</body>
</html>

