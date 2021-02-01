function logout(){
    alert("跳转成功")
}
$(function () {
    $.ajax({
        url: "/api/article/query",
        success: function (r) {//r={success:true, data:{user:xxx, articles:xx}}
            if(r.success){
                let data = r.data;
                if(data.user){//表示已经登录
                    $("#index_logined").show();//显示登录的div
                    $("#index_unlogin").hide();//隐藏未登录的div
                }else{//表示未登录
                    $("#index_logined").hide();//隐藏登录的div
                    $("#index_unlogin").show();//显示未登录的div
                }
                let content = "";
                for(let a of data.articles){
                    content += '<li>';
                    content +=      '<a href="javascript:void(0)">';
                    content +=          a.title;
                    content +=      '</a>';
                    content += '</li>';
                }
                $("#index_articles").html(content);
            }else{
                alert("错误码："+r.code+"\n错误信息："+r.message)
            }
        },
        error: function (err, textStatus, thr) {
            alert("状态码："+err.status)
        }
    })
})