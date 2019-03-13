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
<%--    【<a href="/db2.jsp?_cmd=0+">公共频道</a>】<a href="/db2.jsp?_cmd=1+">行云流水</a>
    说:今天有人出216没？？？？<br/>【<a href="/db2.jsp?_cmd=2+">公共频道</a>】
    <a href="/db2.jsp?_cmd=3+">朱朱侠</a>说:同一种心法也有基5基6两种的！
    <br/>系统消息:七袋弟子打败了天下无敌获赏金九十两白银！
    <br/>吾主沉浮身形一转，「银刀」刀光不定，斩向青烟如梦的右腿，结果「嗤」地一声划出一道血淋淋的伤口！
    <br/>吾主沉浮一式「天女散花」，自水袖中散出一片花雨，青烟如梦被花影迷蒙了双眼，与吾主沉浮擦肩而过--%>
    <br/><img src="<%= basePath%>/static/images/logo2.jpg" alt="picture"/><br/><br/> 天下风云出我辈，一入江湖岁月催
    <br/>皇图霸业谈笑中，不胜人生一场醉<br/>

<c:choose>
<c:when test="${null!=mc}">
    <div>你来到了${mc.name}</div>
    <div>${mc.textDesc}</div>
    <c:if test="${mc.planCodeName!=null && ''!=mc.planCodeName}">
        <div>
        你遇到了<%--<a href="<%=basePath%>route/gnl?a_c_id=${pd.a_c_id}"> ${mc.npcName}(npc) </a>--%>
            <c:forEach items="${mc.planCodeName}" var="item">
                【 <a href="<%=basePath%>route/gnl?a_c_id=${pd.a_c_id}">${item.npcName}</a> 】
            </c:forEach>
            [npc]
        </div>
     </c:if>
  <c:if test="${null != mc.codeUsers && mc.codeUsers.size()>0 }">
    <p>  你遇到了
      <c:forEach items="${mc.codeUsers}" var="item">
          <a href="<%=basePath%>route/gudl?a_c=${pd.riskCode}">${item.nickName}、</a>
      </c:forEach>
        (玩家)
    </p>
  </c:if>
    请选择你的行走方向：
    <div style="text-align:center;">
        <c:forEach items="${mc.directionAim}" var="item">
           <div style="text-align:${item.align}"> 【<a href="<%=basePath%>route/gtp?riskCode=${item.code}"> ${item.aim} </a>】 </div>
        </c:forEach>
    </div>
</c:when>
<c:otherwise>
<div style="color: red;">该位置地图信息暂无</div>
</c:otherwise>
</c:choose>

<a href="<%=basePath%>route/spi">状态/信息</a><br/>
<a href="<%=basePath%>route/gs">商店</a><br/>
<a href="<%=basePath%>route/gds">药铺</a><br/>
<a href="<%=basePath%>route/si">帮派</a><br/>
<a href="">新手指引</a><br/>
<a href="">环顾四方</a><br/>
<a href="">返回首页</a><br/>
<a href="">元宝商城</a><br/>
<a href="">夺宝中华官网</a><br/>
<%--
状态/信息
<a href="">身体状态</a><br/>
<a href="">个人信息</a><br/>
<a href="">随身物品</a><br/>
<a href="">双倍修行</a><br/>
<a href="">交流信息</a><br/>--%>

<br/>
<br/>

</p>
</body>
</html>

