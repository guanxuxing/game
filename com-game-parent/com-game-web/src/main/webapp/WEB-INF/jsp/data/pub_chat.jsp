<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
    <title>夺宝中华侠客行-一区</title>
</head>
<script type="text/javascript">
    function chat(){
        var chatText = $("#chattext").val();
        $.ajax({
            type: "POST",
            url: 'pchat',
            data: {chatText:chatText},
            dataType:'json',
            cache: false,
            success: function(data){
                if("0000" == data.code){
                    alert("发表成功");
                    window.location.href="gopchat";
                }else{
                    alert("发表失败");
                }
            },
            error : function(data) {
                alert("请重新发表");
            }
        });

    }
</script>


<p>
    <a href="/db0.jsp?_cmd=82+">刷新</a>|
    <a href="/db0.jsp?_cmd=83+">切换频道</a>
    <br/>【公共聊天频道】<br/>发言:
<form >
    <input name="chattext" id="chattext"/>
    <input type="button" onclick="chat();" value="确定" />
</form>(35字内)<br/><%--13:24--%>
<p>
</p>
<c:forEach items="${list}" var="item">
    ${item.chatTime} <a href="/db0.jsp?_cmd=3+"> ${item.nickName}</a> 说: ${item.chatText}<br/>
</c:forEach>
<%--<a href="/db0.jsp?_cmd=85+">8甜茵儿8</a>说:<br/>10:14
<a href="/db0.jsp?_cmd=3+">咻！</a>说:1<br/>10:49
<a href="/db0.jsp?_cmd=4+">踏雪寻梅</a>说:<br/>--%>
<a href="/db0.jsp?_cmd=5+">返回</a><br/>
<a href="/db0.jsp?_cmd=6+">返回游戏</a>
<br/>
</p>
</body>
</html>

