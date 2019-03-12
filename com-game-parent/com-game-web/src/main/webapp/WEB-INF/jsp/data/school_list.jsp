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
    <title>夺宝中华侠客行-三区</title>
</head>
<body>
<p>
   <%-- <a href="/db2.jsp?_cmd=55+">天魔教教</a>(848334)<br/>
    <a href="/db2.jsp?_cmd=56+">魔刀盟帮</a>(828444)<br/>
    <a href="/db2.jsp?_cmd=57+">广寒宫帮</a>(4417)<br/>
    <a href="/db2.jsp?_cmd=58+">横扫军</a>(2530)|<a href="/db2.jsp?_cmd=59+">加入</a><br/>
    <a href="/db2.jsp?_cmd=60+">九天神教</a>(2074)<br/>
    <a href="/db2.jsp?_cmd=61+">六路军</a>(0)<br/>--%>
    <c:forEach items="${list}" var="item">
     <a href="">${item.name}</a> (${item.currentNum}/${item.maxNum})
        <c:if test="${item.currentNum<item.maxNum}">
            <a href="">加入</a>
        </c:if>
        <br/>
    </c:forEach>

    <a href="/db2.jsp?_cmd=62+">返回</a><br/>
    <a href="/db2.jsp?_cmd=63+">返回游戏</a><br/></p>
</body>
</html>
