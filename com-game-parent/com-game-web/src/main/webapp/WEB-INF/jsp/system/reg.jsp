<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
    <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?5e6f610b7c6d85fdde3a9795242b61e5";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>

    <title>夺宝中华侠客行-注册</title>

</head>
<script>

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

</script>
<body>

<script type="text/javascript">
    function regServer(){
        if (check_reg_input()) {
            var loginname = $("#username").val();
            var password = $("#password").val();
            var code =loginname+","+password ;
            $.ajax({
                type: "POST",
                url: 'reg',
                data: {KEYDATA:code,tm:new Date().getTime()},
                dataType:'json',
                cache: false,
                success: function(data){
                    if("0000" == data.code){
                        alert("注册成功");
                        window.location.href="index.jsp";
                    }else if("0004" == data.code){
                        alert("玩家已存在");
                       // window.location.href="goreg";
                    }
                    else{
                        alert("注册失败");
                        window.location.href="goreg";
                        $("#username").tips({
                            side : 1,
                            msg : data.result,
                            bg : '#FF5080',
                            time : 5
                        });
                    }
                },
                error : function(data) {
                    alert("注册失败");
                    window.location.href="goreg";
                }
            });
        }
    }
</script>

<form name="regform" method="post" >
    <img src="static/images/logo.jpg" alt="picture"/><br/>
    欢迎大家来到夺宝中华侠客行游戏世界！<br>
    用户名：<input type="text" name="name" id="username"><br>
    (6-16个小写字母或数字)<br>
    密&nbsp;&nbsp;码：<input type="password" name="password1" id="password"><br>
    (6-16个小写字母或数字)<br>
    重复密码：<input type="password" name="password2"><br><br>
    <input type="button" value="确定" onclick="regServer();"><br><br>
    <a href="index.jsp">返回</a><br>
</form>
<p>本站为夺宝中华官方唯一正版<br>本站网址：db.xk007.cn<br><br>京ICP备17017840号-1</p>


</body>
</html>

