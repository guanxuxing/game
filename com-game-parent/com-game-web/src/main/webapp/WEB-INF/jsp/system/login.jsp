<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"><!-- jsp文件头和头部 -->
    <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
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

    <title>夺宝中华侠客行-登录</title>

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

</script>
<body>

<script type="text/javascript">

    function loginServer(){
        if (check_login_input()) {
            var loginname = $("#username").val();
            var password = $("#password").val();
            var code =loginname+","+password ;
            $.ajax({
                type: "POST",
                url: 'login',
                data: {KEYDATA:code,tm:new Date().getTime()},
                dataType:'json',
                cache: false,
                success: function(data){
                    if("0000" == data.code){
                        alert("登录成功");
                        window.location.href="game/index";
                    }else{
                        alert("信息有误");
                        window.location.href="goloin";
                        $("#username").tips({
                            side : 1,
                            msg : data.result,
                            bg : '#FF5080',
                            time : 5
                        });
                    }
                },
                error : function(data) {
                    alert("登录失败");
                    window.location.href="goloin";
                }
            });

        }

    }

</script>

<form name="loginform"  >
    <img src="<%= basePath%>/static/images/logo.jpg" alt="picture"/><br/>
    用户名：<input type="text" name="name" id="username"><br>
    (6-16个小写字母或数字)<br>
    密&nbsp;&nbsp;码：<input type="password" name="password" id="password"><br>
    (6-16个小写字母或数字)<br>
    <input type="button" value="登录" onclick="loginServer()"><br><br>
    <a href="goreg">注册</a>   <a href="goupw">修改密码</a><br>
    <a href="http://db.xk007.cn/">夺宝中华官网首页</a><br>
</form>


</body>
</html>

