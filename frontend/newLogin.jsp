<head>
<style>
.class1{
text-align: center;
}



}
</style>
</head>
<body bgcolor="red">

<div class="class1">
<form name="f1" action="/WebProject/newLoginServlet1" method="post" onSubmit="return validate()">
<h1>LOGIN PAGE</h1>
<h3>username:<input type="text" name="username"  text-align="center"/><br>
password:<input type="password" name="password"/><br>
</h3>
<h4><input type="submit" value="login"></h4>
New User<a href="newRegister.jsp">Register</a>
</form>
</div>
<script>
function validate(){
	var x1=document.f1.username.value;
	if(x1==null || x1==""){
		alert("Username should not be empty");
		return false;
	}
	var x2=document.f1.password.value;
	if(x2==null || x2==""){
		alert("password should not be empty");
		return false;
	}
return true;	
}
</script>

</body>