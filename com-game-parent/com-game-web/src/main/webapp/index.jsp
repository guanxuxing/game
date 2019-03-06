<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?5e6f610b7c6d85fdde3a9795242b61e5";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
    <title>首页</title>
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
    <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
</head>
<script>
    function check_login_input()//检查输入字符长度和是否只是数字和字母
    {
        if(document.loginform.name.value.length>16 || document.loginform.name.value.length<6)
        {
            alert("用户名长度必须是6-16个！");
            document.loginform.name.focus();
            return false;
        }
        if(document.loginform.password.value.length>16 || document.loginform.password.value.length<6)
        {
            alert("密码长度必须是6-16个！");
            document.loginform.password.focus();
            return false;
        }
        var reg=/[^A-Za-z0-9]/g;
        if(reg.test(document.loginform.name.value)){
            alert("用户名必须是字母或数字！");
            document.loginform.name.focus();
            return false;
        }
        if(reg.test(document.loginform.password.value)){
            alert("密码必须是字母或数字！");
            document.loginform.password.focus();
            return false;
        }
        return true;
    }
    function check_reg_input()//检查输入字符长度和是否只是数字和字母
    {
        if(document.regform.name.value.length>16 || document.regform.name.value.length<6)
        {
            alert("用户名长度必须是6-16个！");
            document.regform.name.focus();
            return false;
        }
        if(document.regform.password1.value.length>16 || document.regform.password1.value.length<6)
        {
            alert("密码长度必须是6-16个！");
            document.regform.password1.focus();
            return false;
        }
        var reg=/[^A-Za-z0-9]/g;
        if(reg.test(document.regform.name.value)){
            alert("用户名必须是字母或数字！");
            document.regform.name.focus();
            return false;
        }
        if(reg.test(document.regform.password1.value)){
            alert("密码必须是字母或数字！");
            document.regform.password.focus();
            return false;
        }
        if(document.regform.password1.value != document.regform.password2.value)
        {
            alert("您两次输入的密码不一样！");
            document.regform.password2.focus();
            return false;
        }
        return true;
    }
    function check_chpwd_input()//检查输入字符长度和是否只是数字和字母
    {
        if(document.chpwdform.name.value.length>16 || document.chpwdform.name.value.length<6)
        {
            alert("用户名长度必须是6-16个！");
            document.chpwdform.name.focus();
            return false;
        }
        if(document.chpwdform.oldpwd.value.length>16 || document.chpwdform.oldpwd.value.length<6)
        {
            alert("密码长度必须是6-16个！");
            document.chpwdform.oldpwd.focus();
            return false;
        }
        if(document.chpwdform.password1.value.length>16 || document.chpwdform.password1.value.length<6)
        {
            alert("密码长度必须是6-16个！");
            document.chpwdform.password1.focus();
            return false;
        }
        var reg=/[^A-Za-z0-9]/g;
        if(reg.test(document.chpwdform.name.value)){
            alert("用户名必须是字母或数字！");
            document.chpwdform.name.focus();
            return false;
        }
        if(reg.test(document.chpwdform.oldpwd.value)){
            alert("密码必须是字母或数字！");
            document.chpwdform.oldpwd.focus();
            return false;
        }
        if(reg.test(document.chpwdform.password1.value)){
            alert("密码必须是字母或数字！");
            document.chpwdform.password1.focus();
            return false;
        }
        if(document.chpwdform.oldpwd.value == document.chpwdform.password1.value)
        {
            alert("您的新密码和旧密码一样！");
            document.chpwdform.password1.focus();
            return false;
        }
        if(document.chpwdform.password1.value != document.chpwdform.password2.value)
        {
            alert("您两次输入的密码不一样！");
            document.chpwdform.password2.focus();
            return false;
        }
        return true;
    }
</script>
<body>
<div data-role="page">

    <div data-role="header">
        <h1>head</h1>
    </div>

    <div data-role="content">
        <img src="static/images/logo.jpg" alt="picture"/><br/>
        【夺宝中华侠客行】--可以玩的武侠小说，高自由度的江湖冒险游戏。<br/>
        你可以扮演侠客、杀手、富翁、美人、高手、魔头。<br/>
        这里是真正的武林，在刀光剑影中，谱写你自己的传奇。<br/>
        <a style="font-size:20px;" href="/goloin">登录</a>    <a style="font-size:20px;" href="/goreg">注册</a>    <a style="font-size:20px;" href="/goupw">修改密码</a><br/> <br/>
        <img src="static/images/logo2.jpg" alt="picture"/><br/>
        游戏简介：<br/>
        和乔帮主一起大闹聚贤庄，和大理段公子一起追神仙姐姐，和华山令狐少侠一起大战东方教主，浪迹江湖，纵横四海！通过奇遇得到独孤九剑，乾坤大挪移，蛤蟆功，辟邪剑法，神功在手，天下你有！<br/>
        <br/>
        游戏特色：<br/>
        1.六大门派：少林、丐帮、五岳、日月神教、唐门、魔教任你选择。<br/>
        2.史诗巨著：40种武功，200种武林心法，1200位武侠人物，1100个武林场景，50个大地图，构造了一个史上最丰富最庞大的江湖。<br/>
        3.交互极强：拜师、结义、结婚、切磋、组队、交易、帮派、聊天、PK，拥有最强大的交流功能。<br/>
        4.传奇剧情：60环主线任务，精彩纷呈，让你体验从菜鸟成为武林高手的小说般的传奇。<br/>
        5.打开即玩：支持所有电脑浏览器及所有手机浏览器，直接输入网址就可以访问。<br/>
        6.制作精良：中国第一款手机游戏-“夺宝中华”原创团队倾力打造。<br/>
        7.游戏网址：db.xk007.cn，QQ群：228462227，不删档内测火热开启中！<br/>
        <p>本站为夺宝中华官方唯一正版<br><a href="/goright">用户服务条款</a><br><!-- <a href="index.jsp?act=intro">公司简介</a> | <a href="index.jsp?act=product">产品介绍</a><br><a href="index.jsp?act=about">关于我们</a> | <a href="index.jsp?act=contract">联系方式</a><br> --><br>京ICP备17017840号-1</p>

    </div>

    <div data-role="footer">
        <h1>foot</h1>
    </div>

</div>
</body>
</html>
