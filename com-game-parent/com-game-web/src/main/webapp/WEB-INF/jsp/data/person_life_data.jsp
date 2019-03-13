<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <title>夺宝中华侠客行-玩家数据</title>
</head>
<body>
<!-- 生命值是在数据显示的-->
【玩家数据】<br/>
生命:${gu.currentLifeNum}/${gu.maxLifeNum} <br/>
精神:${gu.currentMindNum}/${gu.maxMindNum}<br/>
内力:${gu.currentForceNum}/${gu.maxForceNum}<br/>
潜能:${gu.currentExperNum}/${gu.maxExperNum}<br/>
修行:一百二十天36个小时<br/>
兵器伤害力:<br/>
盔甲保护力:<br/>
<a href="">技能配置</a><br/>
<a href="">修炼内力</a><br/>

<a href="/db2.jsp?_cmd=62+">返回</a><br/>
<a href="/db2.jsp?_cmd=63+">返回游戏</a><br/>

</body>
</html>
