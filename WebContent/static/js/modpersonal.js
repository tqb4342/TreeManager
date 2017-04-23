$(document).ready(function(){
	
	UserManager.checkSession(function(user){
		if(user != null){
			var uid = user.uid;
			$("#noLogin").html("");
			 var loginHtml = "<div  class='imglogo'>"+
			 user.username+
             "</div><ul class='logoin-div'>"+
             "<li><a href='personalInfo.html?userId="+ uid +"'>个人信息</a></li>"+
             "<li><a href='#' id='logout'>退出登录</a></li></ul>"
			$("#login-div").html(loginHtml);
			bindLogoutEvent();
			showMessage();
		}
	});

})

//绑定退出事件
function bindLogoutEvent(){
     $("#logout").click(function(){
    	UserManager.quit();	 
	    location.href="index.html";
     });
}

function showMessage(){
	var url = decodeURI(window.location.href);
	dwr.engine.setAsync(false);
	var wordname = url.split("?")[1];
	var uid = wordname.split("=")[1];
	UserManager.getById(uid,function(user){
	//	console.log(user);
		var account = user.account;
		var username = user.username;
		var pass = user.password;
		var age = user.age;
		var role = user.flag;
		$("#changeHeadPic").html(username);
		var manager = '<li><a href="personalInfo.html?userId='+uid+'" id="personalInfoBut">个人信息</a></li>'+
		   '<li><a href="discuss.html?userId='+uid+'" id="editPersonalInfoBut">我回答过的问题</a></li>'+
		   '<li><a href="modifyPersonalPassword.html?userId='+uid+'" id="modPasswordBut">修改密码</a></li>';
		$("#menu").html(manager);
		
		if(role==1){
			$("#editPersonalInfoBut").html("我提过的问题");
		}
		$("#modaccountName").val(account);
		
		
		$("#confirmModPassBut").click(function(){
			var oldpass = $("#oldPassword").val();
			var newpass = $("#newPassword").val();
			var connewpass = $("#confirmNewPassword").val();
			if(oldpass==""||oldpass!=pass){
				alert("密码不正确");
				return;
			}
			if(newpass==""||connewpass==""){
				alert("密码不能为空！");
				return;
			}
			if(newpass!=connewpass){
				alert("密码前后不一致！");
				return;
			}
			
			 var regData = {"account":account,
                     "password":newpass,
                     "username":username,
                     "age":parseInt(age),
                     "flag":role};
			
			UserManager.update(regData,function(){
				alert("修改密码成功！");
				location.href="login.html";
			});
			
		});
		
	});
}