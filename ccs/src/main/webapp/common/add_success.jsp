<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加/更新记录成功</title>
<script type="text/javascript">
function closewindow(){
	if(window.opener){
		window.opener.location.reload(true);
		window.close();
	}
}

function clock(){
	i=i-1;
	if(document.getElementById("info")){
		document.getElementById("info").innerHTML="本窗口将在"+i+"秒后自动关闭!";
	}
	if(i>0)
		setTimeout("clock();",1000);
	else 
		closewindow();
}
	var i=4;
	clock();
</script>

</head>
<body>
<center>
	添加/更新记录成功！ <p>
	<div id="info">本窗口将在3秒后自动关闭!</div>
	<input type="button" value="关闭窗口" onclick="closewindow();">
</center>

</body>
</html>