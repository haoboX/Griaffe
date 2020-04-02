function selectAll(){
	var control = document.getElementById("control");
	var control_staus = control.checked;
	console.log(control_staus);
	var array1 = document.getElementsByName("chk");
	for(var i=0;i<array1.length;i++){
		array1[i].checked = control_staus;
	}
}
function deleteProduct(url){
	if(confirm("确定购物车移除该商品吗？")){
		//delete
		window.location.href=url;
	}
}
function CheckSubmit(url){
	if(checkAll()){
		document.myformBag.submit();
	}
	if(!checkAll()){
		alert("请选择商品!!");
		window.location.href=url;
	}
}
function checkAll(){
	var array1 = document.getElementsByName("chk");
	var p=0;
	for(var i=0;i<array1.length;i++){
		if(!array1[i].checked){
			p++;
		}
		else {
			
		}
	}
	if(p == array1.length){
		return false;
	}
	else if(p !=array1.length) return true;
}

