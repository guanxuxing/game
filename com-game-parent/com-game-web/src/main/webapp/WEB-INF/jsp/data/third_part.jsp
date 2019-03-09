<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
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
    ！
    <br/><img src="<%= basePath%>/static/images/logo2.jpg" alt="picture"/><br/><br/> 天下风云出我辈，一入江湖岁月催
    <br/>皇图霸业谈笑中，不胜人生一场醉<br/>

<c:choose>
<c:when test="${null!=mc}">
    <div>你来到了${mc.name}</div>
    <div>${mc.textDesc}</div>
    <c:if test="${mc.npcDesc!=null && ''!=mc.npcDesc}">
        <div>
        你遇到了<a href=""> ${mc.npcDesc}(npc) </a>
        </div>
     </c:if>
  <c:if test="${null != mc.codeUsers && mc.codeUsers.size()>0 }">
    <p>  你遇到了
      <c:forEach items="${mc.codeUsers}" var="item">
          <a href="">${item.nickName}、</a>
          </p>
      </c:forEach>
  </c:if>
    请选择你的行走方向：
    <div style="text-align:center;">
        <c:forEach items="${mc.directionAim}" var="item">
           <div style="text-align:${item.align}"> 【<a href="<%=basePath%>route/gtp?riskCode=${item.code}"> ${item.name} - ${item.aim} </a>】 </div>
        </c:forEach>
    </div>
</c:when>
<c:otherwise>
<div style="color: red;">该位置地图信息暂无</div>
</c:otherwise>
</c:choose>

<a href="/db0.jsp?_cmd=27+">任务</a>|
<a href="/db0.jsp?_cmd=28+">状态</a>|
<a href="/db0.jsp?_cmd=29+">个人</a>|
<a href="/db0.jsp?_cmd=30+">武功</a><br/>
<a href="/db0.jsp?_cmd=31+">心法</a>|
<a href="/db0.jsp?_cmd=32+">物品</a>|
<a href="route/gopchat">公聊</a>|
<a href="/db0.jsp?_cmd=34+">交流</a><br/>
<a href="/db0.jsp?_cmd=35+">关系</a>|
<a href="/db0.jsp?_cmd=36+">帮派</a>|
<a href="/db0.jsp?_cmd=37+">双倍</a>|
<a href="/db0.jsp?_cmd=38+">帮助</a><br/>
<a href="/db0.jsp?_cmd=39+">新手引导</a>|||
<a href="/db0.jsp?_cmd=40+">环顾四方</a><br/>
<a href="/db0.jsp?_cmd=41+">返回长安客栈</a><br/>
<a href="/db0.jsp?_cmd=42+">返回首页</a>|||
<a href="/db0.jsp?_cmd=43+">元宝商城</a>
<br/>
<br/>


<%--    <br/>【<a href="/db2.jsp?_cmd=7+">打怪</a>|
    <a href="/db2.jsp?_cmd=8+">捡钱</a>|<a href="/db2.jsp?_cmd=9+">挂机</a>|
    <a href="/db2.jsp?_cmd=10+">竞技</a>】<br/> <br/>【<a href="/db2.jsp?_cmd=11+">拜玩家为师</a>|
    <a href="/db2.jsp?_cmd=12+">群芳楼</a>】<br/> <br/>【<a href="/db2.jsp?_cmd=13+">商店</a>|
    <a href="/db2.jsp?_cmd=14+">钱庄</a>|<a href="/db2.jsp?_cmd=15+">当铺</a>|
    <a href="/db2.jsp?_cmd=16+">药铺</a>】<br/> <br/>【<a href="/db2.jsp?_cmd=17+">买心法</a>|
    <a href="/db2.jsp?_cmd=18+">黑市</a>|<a href="/db2.jsp?_cmd=19+">论坛</a>】
    <br/> <br/>【<a href="/db2.jsp?_cmd=20+">排行</a>|<a href="/db2.jsp?_cmd=21+">帮助</a>|
    <a href="/db2.jsp?_cmd=22+">公告</a>】<br/>--%>
 <%--   <br/>【<a href="/db2.jsp?_cmd=23+">我的推广链接</a>】
    <br/> <br/>本站网址：xk007.cn<br/>将本页存为书签，可以免登陆<br/>玩家交流QQ群：228462227 ，新手加群就送30两黄金
    <br/>本页包含你的账号和密码信息，请不要发送链接给别人<br/>苹果自带safari浏览器字体会忽大忽小，建议下载UC或QQ浏览器访问本站
    <br/><br/>--%>

</p>
</body>
</html>

