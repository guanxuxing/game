<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
    <title>cni</title>
</head>
<body>
<p>
   <%-- 【平民】小丽(任务)<br/>
    她是一个可爱的小姑娘，长着萌萌的脸，声音却有些沙哑。她天真烂漫，却也懂得不少江湖之事，和她对话开始你的江湖之路吧。<br/>
    她俏脸生春，妙目含情，轻轻一笑，不觉让人怦然心动。 <br/>
    看起来大约十多岁。<br/>
    武功看起来好像不堪一击，出手似乎极轻。<br/>
    她看起来气血充盈。<br/>--%>
<p>
    <c:choose>
        <c:when test="${null != gn}">
            ${gn.desc}
        </c:when>
        <c:otherwise>
           <span style="color: red;"> npc信息不存在 </span>
        </c:otherwise>
    </c:choose>

</p>
    <a href="/db1.jsp?_cmd=62+">对话</a>|
    <a href="/db1.jsp?_cmd=63+">邀请组队</a><br/>
    <a href="/db1.jsp?_cmd=64+">袭击</a>|
    <a href="/db1.jsp?_cmd=65+">切磋</a><br/>
    <a href="/db1.jsp?_cmd=66+">返回</a><br/>
    <a href="/db1.jsp?_cmd=67+">返回游戏</a><br/>
</p>

</body>
</html>
