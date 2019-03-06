<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?5e6f610b7c6d85fdde3a9795242b61e5";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
    <title>夺宝中华侠客行-登录</title>
</head>

<body>
请选择游戏分区：<br> <br>
<a href="./db2.jsp?_user=qaz111&sign=a619087444b1ebbd8c4d7c9384f27559">三区：争霸江湖(新)</a><br> <br>
<a href="./db1.jsp?_user=qaz111&sign=a619087444b1ebbd8c4d7c9384f27559">二区：纵横四海</a><br> <br>
<a href="./db0.jsp?_user=qaz111&sign=a619087444b1ebbd8c4d7c9384f27559">一区：风云再起</a><br> <br>
<a href="http://db.xk007.cn/">夺宝中华官网首页</a><br>

</body>
</html>

