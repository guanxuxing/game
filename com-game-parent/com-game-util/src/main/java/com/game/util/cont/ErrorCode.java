package com.game.util.cont;

/**
 * Created by Administrator on 2019-03-06.
 *
 * //服务器校验
 function severCheck(){
 if(check()){

 var loginname = $("#loginname").val();
 var password = $("#password").val();
 var code = "qq313596790fh"+loginname+",fh,"+password+"QQ978336446fh"+",fh,"+$("#code").val();
 $.ajax({
 type: "POST",
 url: 'login_login',
 data: {KEYDATA:code,tm:new Date().getTime()},
 dataType:'json',
 cache: false,
 success: function(data){
 if("success" == data.result){
 saveCookie();
 saveLocal();
 window.location.href="main/index";
 }else if("usererror" == data.result){
 $("#loginname").tips({
 side : 1,
 msg : "用户名或密码有误",
 bg : '#FF5080',
 time : 2
 });
 changeCode();
 $("#code").val("");
 $("#loginname").focus();
 }else if("corpIpFail" == data.result){
 $("#loginname").tips({
 side : 1,
 msg : "IP未加入白名单",
 bg : '#FF5080',
 time : 2
 });
 changeCode();
 $("#code").val("");
 $("#loginname").focus();
 }
 else if("codeerror" == data.result){
 $("#code").tips({
 side : 1,
 msg : "验证码输入有误",
 bg : '#FF5080',
 time : 2
 });
 changeCode();
 $("#code").val("");
 $("#code").focus();
 }else{
 $("#loginname").tips({
 side : 1,
 msg : data.result,
 bg : '#FF5080',
 time : 5
 });
 changeCode();
 $("#code").val("");
 $("#loginname").focus();
 }
 }
 });
 }
 }
 */
public enum  ErrorCode {

    E0000("0000", "成功"),
    E0001("0001", "失败"),
    E0002("0002", "参数不完整"),
    E0003("0003", "信息不存在"),
    E0004("0004", "添加信息已存在"),
    E9999("9999", "请稍后再试");  // 异常(Exception)提示

    private String code;
    private String value;

    private ErrorCode(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static ErrorCode resolve(String code) {
        ErrorCode errorCode = null;
        for (ErrorCode object : ErrorCode.values()) {
            if (object.getCode().equals(code)) {
                return object;
            }
        }
        return errorCode;
    }
}
