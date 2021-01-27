$(function () {//html页面加载完执行方法
    $("#login_form").submit(function () {//绑定提交事件
        $.ajax({
            url:"data/login.json",
            type:"get",
            dataType:"x-www-form-urlencoded",
            data:$("#login_form").serialize(),
            contentType:"json",
            success:(function (resp) {
                alert(JSON.stringify(resp))
            })
        })
        // alert("submit")
        return false;//返回值决定是否使用表单的默认提交
    })
})