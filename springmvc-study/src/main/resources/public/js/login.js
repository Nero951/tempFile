$(function () {//html页面加载完执行方法
    $("#login_form").submit(function () {//绑定提交事件
        $.ajax({
            url:"../api/user/login",
            // url:"../data/login2.json",
            type:"post",
            //contentType:"x-www-form-urlencoded",
            data:$("#login_form").serialize(),
            dataType:"json",
            success: function (resp) {
                if(resp.success){
                    window.location.href = "main.html"
                }else{
                    alert("错误码:"+resp.code+" 错误信息:"+resp.message)
                }
                // alert(JSON.stringify(resp))
            },
            error:function (req, textStatus, err) {
                alert(req.status)
            }
        })
        // alert("submit")
        return false;//返回值决定是否使用表单的默认提交
    })
})