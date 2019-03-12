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
    <title>t</title>
</head>
<body>
<script type="text/javascript">

    var goodsName ;
    $(function(){
        goodsName = '${ggs.name}';
    })

    function buy_goods(){
        var buyNum = $("#num").val();
        var ggsId = $("#ggs_id").val();
        if (''==buyNum || buyNum<=0){
            alert("购买数量不能为空");
            return false;
        }
        $.ajax({
            type: "POST",
            url: '<%=basePath%>route/bg',
            data: {num:buyNum,ggs_id:ggsId},
            dataType:'json',
            cache: false,
            success: function(data){
                if("0000" == data.code){
                    alert("购买成功 【 名称: "+goodsName+", 数量: "+buyNum+" 】");
                   // window.location.href="index.jsp";
                }
                else{
                    alert(data.msg);
                }
            },
            error : function(data) {
                alert("购买失败, 请重新购买!");
            }
        });
    }
</script>

<p>
   <%-- 冷板凳来到了这里。<br/>--%>
    请输入你想一次购买【${ggs.name}】 的数目（范围 1-${ggs.maxBuy}）
<form>
    <input type='hidden' name='ggs_id' id="ggs_id" value='${ggs.id} '/>
    <input type="input" name='num' id="num"/>
    <input type='button' onclick="buy_goods();" value='确定'/>
</form><br/>
<a href="/db2.jsp?_cmd=84+">返回</a><br/>
<a href="/db2.jsp?_cmd=85+">返回游戏</a><br/>
</p>
</body>
</html>
