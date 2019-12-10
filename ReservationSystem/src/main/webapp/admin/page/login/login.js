layui.config({
	base : "js/"
}).use(['form','layer'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		$ = layui.jquery;
	
	//登录按钮事件
	form.on("submit(login)",function(){
		vm.login(userLogin.username.value , userLogin.password.value);
		return false;
	});


});


var vm = new Vue({
    el:'#rrapp',
    data:{
    },
    methods: {
    	login: function (username , password) {
    		var date = {
    				username: username,
    				password: password
    		}
    		
            $.ajax({
                type: "POST" ,
                url:  "../../../admin/adminLogin" ,
                contentType: "application/json" ,
                data: JSON.stringify(date) ,
                success: function(r) {
                    if(r.code == 1) {
                        alert('操作成功')
                        layer.closeAll();
                        window.location.href = '../../../admin/Admin';
                    }else{
                        alert(r.msg);
                    }
                }
            }) ; 
        }
    } 
});
	

		/*function login () {
			var data = "username" + userLogin.username.val() + "password" + userLogin.password.val() ;
			console.log(data);
			  $.ajax({
	                type: "POST" ,
	                url:  "../../Login/adminLogin" ,
	                contentType: "application/json" ,
	                data: JSON.stringify(data) ,
	                success: function(data) {
	                    if(data.code == 1) {
	                        alert('操作成功', function(index) {
	                            layer.closeAll();
	                            window.location.href = '../../index.html';
	                        });
	                    }else{
	                        alert(r.msg);
	                    }
	                }
	            }) ;
		}*/