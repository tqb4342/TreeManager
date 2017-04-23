$(document).ready(function(){
	
	$("#reg_submit").click(function(){
		var account = $("#accountName").val();
		var password = $("#password").val();
		var comfrimPassword = $("#confirm_password").val();
		var username = $("#realname").val();
		var age = $("#age").val();
		var role;
        $("input[name='role']:checked").each(function(){
            role = $(this).val();
        });
    
        var flag;
        if(role=="teacher"){
        	flag = 1;  //如果是老师，flag==1
        }else{
        	flag = 0;  //如果是学生，flag==0
        }
        
        if(account==""||password==""||comfrimPassword=="") {
        	 $("#login_msg").html("用户名或密码不能为空！");
        	return;
        }
        
		if(password != comfrimPassword){
			 $("#login_msg").html("前后密码不一致！");
				$("#password").val("");
				$("#confirm_password").val("");
				return;
		}
		
		if(username == ""){
			 $("#login_msg").html("真实姓名不能为空！");
			 return;
		}
		
		if(age == ""){
			 $("#login_msg").html("年龄不能为空！");
			 return;
		}
		
		 $("#login_msg").html("");
		 
        var regData = {"account":account,
                        "password":password,
                        "username":username,
                        "age":parseInt(age),
                        "flag":flag};
		
		
        console.log(regData.account);
        
		UserManager.existUser(account,function(flag){
			if(flag){
				UserManager.insert(regData,function(){
					alert("您已经注册成功，请登录。")
					location.href="login.html";
				})
			}else{
				 $("#login_msg").html("该用户已存在，请重新输入！");
				 return;
			}
		});
		
	});
})