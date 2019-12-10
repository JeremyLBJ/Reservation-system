layui.config({
	base : "js/"
}).use(['form','layer'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		$ = layui.jquery;
	
	//登录按钮事件
	form.on("submit(register)",function(){
		vm.register(userRegister.username.value , userRegister.password.value , userRegister.tel.value ,
				      userRegister.orderno.value , userRegister.code.value);
		return false;
	});


});
/*$.ajax({
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
    }*/

var vm = new Vue({
    el:'#rrapp',
    data:{
    },
    updated: function(){
        layui.form.render();
    },
    methods: {
    	register: function (username , password , tel  , orderno , code) {
    		var date = {
    				username: username ,
    				password: password ,
    				tel: tel ,
    				orderno: orderno ,
    				code: code
    		}
            $.ajax({
                type: "POST" ,
                url:  "../../../admin/adminRegister" ,
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