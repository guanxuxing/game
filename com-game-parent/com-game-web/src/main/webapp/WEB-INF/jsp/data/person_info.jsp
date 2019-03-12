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
    <title>夺宝中华侠客行-状态/信息</title>
</head>
<body>
<p>
    【个人物品信息】<br/>
    <c:forEach items="${ugs}" var="item">
      名称:<span style="color: blue">${item.goods_name}</span>  数量:<span style="color: blue">${item.goods_num}</span> <br/>
    </c:forEach>
    <br/>
    【所属门派】 <br/>
    -----------<br/>
    【师傅】 <br/>
    -----------<br/>
    【武功招式】 <br/>
    -----------<br/>
    【生命值】 <br/>
    -----------<br/>
    【经验值】 <br/>
    -----------<br/>
    <a href="/db2.jsp?_cmd=62+">返回</a><br/>
    <a href="/db2.jsp?_cmd=63+">返回游戏</a><br/>
</p>
</body>
</html>

