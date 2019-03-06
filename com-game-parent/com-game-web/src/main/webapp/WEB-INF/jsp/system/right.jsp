<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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

<p>
    用户服务条款<br><br>
    一、玩家的权利<br>
    1、本公司(以下简称“我们”)保证游戏平台的可访问性，并提高其稳定性。但是对于外部力量如网络本身等造成网速缓慢以及不能进入游戏，本公司不承担责任。<br>
    2、我们为用户保密其联系方式；但是用户彼此间互相透露，造成任何影响我们概不负责。<br>
    3、用户在游戏时，是自动存盘的，同时我们还提供了手动存盘功能（请点击：个人-个人数据存盘），用户可以随时保存自己的数据。用户在游戏中正常被杀，或者被其他玩家欺骗，导致武功、修行降低或者装备丢失我们不承担责任，同时因各种意外故障或者不可控因素造成的数据丢失，我们不保证修复。<br>
    4、我们努力为所有参与游戏的用户提供一个公平的游戏环境，所以我们拒绝为任何用户修改武功、金钱、装备及其他数据。<br><br>
    二、玩家应该遵守的规则<br>
    1、游戏中的所有时间以服务器时间为准，所有与时间有关的游戏问题以服务器时间作出判断。<br>
    2、为了保持游戏平衡性，我们有一个惩罚系统：监狱；这个系统在游戏中（化生寺）有完整的说明。<br>
    3、对于游戏中所有的资料、设定及活动规则，全部权利属于我们，欢迎玩家提出建议，但是无权要求我们对游戏资料、设定或活动规则进行修改。用各种手段，如煽动退游等强制要求我们修改的，我们保留封禁账号的权利，因此给游戏造成相应损失的，我们保留追究其责任的权利。<br>
    4、用户不能对游戏管理员及本公司其他员工进行人身攻击，违者我们将视情节轻重对用户账号采取惩罚措施，情节严重者，我们保留追究其相应责任的权利。<br>
    5、因为服务器不能保存过多的日志信息，保存太多日志信息会影响用户进行游戏。我们定期会对日志进行整理和更新。所以我们建议用户有问题能在问题发生后3天内及时联系我们。如果用户当前反映的问题为3天前发生的，恕我们不能保证为用户解决问题。<br>
    6、用户在游戏里产生的恩怨，应在游戏内解决，不要带到现实中。禁止在公聊、论坛、QQ群里对骂。用户应保护好自己的个人隐私，包括账号、密码、手机号、姓名、住址、银行卡号等等。用户在现实中产生的一切纠纷、损失，与本公司无关。<br>
    7、为提高游戏运行效率，以下情况本公司保留删除用户账号的权利：用户连续90天未登录且从未充值<br><br>
    三、账号惩罚规则<br>
    1、用户无理取闹，干扰我司正常工作，一经查实，该用户投诉不受理，并给予封号3到30天处罚。<br>
    2、用户使用恶意脚本、宝宝等非法脚本访问游戏，造成大量用户投诉，一经查实给予永久封禁处罚。<br>
    3、用户通过我司客服谎报丢失，骗取数据、装备或黄金，一经查实给予永久封禁处罚。<br>
    4、用户在论坛中冒充游戏管理员进行诈骗活动，给予永久封禁处罚，并将其相关号码或登陆ip移交公安机关做进一步处理。<br>
    5、用户在官方QQ群或游戏中任一地点发表侮辱、诽谤我司或我司工作人员的言辞，给予永久封禁其全部账号的处罚。<br>
    6、用户利用游戏bug，以各种方式攻击其他用户，使他人不能正常游戏的。一经查实给予封号3到30天处罚。在用户中造成极坏影响并产生恶性投诉的，给予永久封禁处罚。<br>
    7、用户利用游戏bug，提高任何游戏参数包括个人状态参数、身体参数、装备、黄金，一经查实给予该参数归零处罚，并酌情封号3到30天。<br>
    8、高级用户开小号，恶意大量杀新手（累计达到30次）者，永久封号（包括大号和小号）。<br>
    9、不得故意取名冒充GM或其他重要的用户管理员，违者封号。<br><br>
    四、物品恢复管理规则<br>
    由于用户错误造成的虚拟财产丢失，若证实造成虚拟物品丢失的直接原因是： <br>
    1、意外删除（人物、物品或游戏中的钱币） <br>
    2、意外出售<br>
    3、用户受骗<br>
    4、意外扔弃<br>
    5、用户网络故障<br>
    6、用户脚本故障<br>
    7、其他用户错误 <br>
    若您遇到的情况符合上述任何一条标准，我们将不予受理。<br><br>
    五、关于论坛和聊天室<br>
    论坛和聊天室是给用户提供一个交流的平台，是一个公共的版面。请用户遵守以下规定：<br>
    1、 我们对于下列文章予以删除<br>
    A、 人身攻击性的文章<br>
    B、 攻击政府、党和国家的文章<br>
    C、 用语粗俗的文章<br>
    D、 内容相同重复发表的文章<br>
    E、 宗教、政治、色情相关内容；各种广告<br>
    F、 其他违反国家政策的内容<br>
    2、 对于发表以上文章的用户，我们有权利封禁用户<br>
    3、 对于屡次触犯，不听劝告的用户我们保留删除其帐号资料的权利<br>
    4、 在第1条的基础上我们把握删贴尺度，没有义务向用户解释每次删贴行为<br>
    所有用户必须遵守以上游戏规则，对于不遵守以上规则的用户我们保留封禁账号、降低武功、删除账号、阻止进入及其他一切可能的权利。<br><br>
    六、关于充值<br>
    本游戏目前不删档内测，无道具收费，完全免费，纯绿色，纯公益，但不排除未来可能开放充值。我们致力于提供稳定的游戏服务，但是如果遭遇不可抗力（包括但不限于黑客攻击、国家政策、版权冲突、服务器意外损坏等等）造成用户游戏数据丢失或游戏停止运营，我们不承担责任，也不退还用户技术咨询费、捐赠额或充值金额。元宝商城的物品定价，官方有权根据情况随时调整，尤其是黄金的价格。用户注册本游戏，即意味着认可并接受本条款。<br><br>
    七、宝箱概率<br>
    1。镖局黄金宝箱：开箱子前请务必保证身上心法少于5本！否则开出的心法无法获得！必出10两黄金，一定概率赠送如下物品：5888元宝--0.2%，100到1000两黄金之间等概率随机一个黄金数--30%，170到300级装备--5%，140到169级装备--10%，110到139级装备--15%，80到109级装备--15%，216年心法--1%，64年心法--4%，8年心法--20%。上述装备均不含不掉装。<br><br>
    八、对战说明<br>
    本游戏为文字类冒险游戏，分为和平区与非和平区，用户进入非和平区，即意味着可能发生各种冒险，包括但不限于：被系统人物攻击，被其他用户攻击，捡到宝物等。不希望发生此类冒险境遇的用户，可以选择呆在和平区，和平区会有明确提示“这里不能打架”。用户离开和平区，主动进入非和平区，即意味着用户认可前述各种冒险事件的可能发生。<br><br>
    九、防沉迷说明<br>
    本游戏禁止未满18周岁的未成年人进入。如果您是未成年人，请马上退出本游戏。<br><br>
    十、其他说明<br>
    1。青龙会令牌，用户称之为“终身卡”，需要花费1980元宝购买，购买后，令牌持有人可立刻获得2160元宝，并且可以每天免费领取15元宝。可以说是必买之物。注意：因服务器维护导致当天15元宝没有领取，不予补发；领取期限可一直持续到游戏结束运营之时。<br>
    2。不支持转区服务，用户的元宝、武功、修行、心法、黄金等等所有游戏数据都无法在不同的区之间转移。<br>
    3。账号和密码请用户自己妥善保管，丢失了本公司不负责找回。账号和密码不要告诉他人，不要使用过于简单的密码，被盗号了本公司不负责找回，也不会封号。<br>
    4。GM不负责解答关于游戏的疑问，也解答不过来。有关于游戏的疑问，可以查阅帮助，帮助写得很详细，也可以加QQ群，在群里向其他用户求助，或者小窗QQ群里的新手指导或玩家管理员（也是用户）来求助。<br>
    5。用户不得向本公司（官方）提出一些不合理的要求，如：查询其他用户的资料、行为，查询自己的历史心法交易记录，退回所购买的物品重新购买其他物品，退回所购买的物品返回元宝等。<br>
    6。官方不鼓励、不支持、不参与任何玩家间的交易。玩家之间的任何交易，请风险自负，防止受骗，出现被骗的情况，官方一概不会受理，不会介入。<br><br>
    十一、解释说明<br>
    本公司对“用户服务条款”中的所有条例拥有修改权与解释权。注册本游戏即意味着同意“用户服务条款”中的所有条例，包括本条。<br><br>
    <a href="index.jsp">返回</a><br></p>


</body>
</html>

