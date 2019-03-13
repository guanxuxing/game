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
    <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
    <title>夺宝中华侠客行-物品使用</title>
</head>
<body>

<script type="text/javascript">
    function useGoods (){
        var useType = $("#use_type").val();
        var useNum = $("#user_num").val();
        var gsNum = $("#gs_num").val();
        $.ajax({
            type: "POST",
            url: '<%=basePath%>route/ugs_01',
            data: {u_t:useType,u_u:useNum,g_n:gsNum},
            dataType:'json',
            cache: false,
            success: function(data){
                if("0000" == data.code){
                    alert("使用成功 【 名称: "+goodsName+", 数量: "+buyNum+" 】");
                    // window.location.href="index.jsp";
                }
                else{
                    alert(data.msg);
                }
            },
            error : function(data) {
                alert("使用失败!");
            }
        });
    }
</script>

<c:forEach items="${ugs}" var="item">
    名称:${item.goods_name}  数量:<span id="gs_num_v"> ${item.goods_num}</span> <br/>
    <input type="hidden" value="${item.use_type}" id="use_type" />
    <input type="hidden" value="${item.use_num}" id="use_num" />
    <input type="text" value="输入使用数量" id="gs_num" name="gs_num" />
    <input type="button" onclick="useGoods();" value="确定" />
</c:forEach>
<br/>
<a href="/db2.jsp?_cmd=62+">返回</a><br/>
<a href="/db2.jsp?_cmd=63+">返回游戏</a><br/>
</body>
</html>
