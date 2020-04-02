var showError = document.getElementById("showError");

function checkLogin(){
	if(checkusername() && checkpassword()){
		//验证通过，通过JavaScript让表单提交
		document.myform.submit();
	}
	else{
		document.myform.action="login.jsp";
		document.myform.submit();
	}
}

function setError(str){
	showError.innerHTML = str;
	showError.style.color = "black";
}

function checkusername(){
	var username1 = document.getElementsByName("username")[0].value;
	var reg1 =  /^[1][3][0-9]{9}$/;
	var reg2 =  /^[_a-z0-9]+@([_a-z0-9]+\.)+[a-z0-9]{2,3}$/;
	if(username1 == null || username1 == ""){
		setError("手机号或邮箱不能为空");
		return false;
	}
	else if(!(reg1.test(username1) || reg2.test(username1))) {
		setError("手机号或邮箱格式不正确，请重新输入");
		return false;
	}
	else{
		return true;
	}
}

function checkpassword(){
    password = document.getElementsByName("pwd")[0].value;
	var reg = /^\w{6,}$/
	if(password == null ||password == ""){
		setError("密码不能为空");
		return false;
	}
	else if(!reg.test(password)){
		setError("密码不能少于6位！");
		return false;
	}
	else{
		return true;
	}
}