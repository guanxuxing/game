<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>u</title>
</head>
<body>

   <c:forEach items="${list}" var="item">
      【  <a href="">(${item.userId}) ${item.nickName} </a> 】<br/>
   </c:forEach>
    <a href="/db1.jsp?_cmd=61+">返回</a><br/>
    <a href="/db1.jsp?_cmd=62+">返回游戏</a><br/>
</p>

</body>
</html>
