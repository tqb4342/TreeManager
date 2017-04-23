$(document).ready(function(){


	$("#login_submit").click(function(){

		var accountName = $("#accountName").val().trim();
		var password = $("#password").val().trim();

		$("#login_msg").html("");
		if(accountName ==""){
		    $("#login_msg").html("用户名不能为空！");
		}

		if(password ==""){
		    $("#login_msg").html("密码不能为空！");
		}

		

		UserManager.login(accountName,password,function(flag){
			if(flag){
				location.href="index.html";
			}else{
			    $("#login_msg").html("用户名或密码不正确！");
			}
		});
		

	});

});


