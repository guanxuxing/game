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

    <title>夺宝中华侠客行-修改密码</title>

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

<form name="chpwdform" action="index.jsp" method="post" onsubmit="return check_chpwd_input()">
    <img src="static/images/logo.jpg" alt="picture"/><br/>
    欢迎大家来到夺宝中华侠客行游戏世界！<br>
    用户名：<input type="text" name="name"><br>
    旧密码：<input type="text" name="oldpwd"><br>
    新密码：<input type="text" name="password1"><br>
    (6-16个小写字母或数字)<br>
    重复新密码：<input type="text" name="password2"><br><br>
    <input type="hidden" name="act" value="chpwd" />
    <input type="submit" value="确定"><br><br>
    <a href="index.jsp">返回</a><br>
</form>


</body>
</html>

