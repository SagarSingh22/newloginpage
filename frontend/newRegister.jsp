<body bgcolor="grey">
<h1>Registration Page</h1>
<form name ="f2" action="/WebProject/newRegisterServlet1" method="post" onSubmit="return validate1()">
 name:<input type="text" name="name"/><br>
 username:<input type="text" name="username"/><br>
 password:<input type="password" name="password"/><br>
 repassword:<input type="password" name="repassword"/><br>
<input type="submit" value="Register"/>
 </form>
 <script>
 function validate1(){
	 var x1=document.f2.name.value;
	 var x2=document.f2.username.value;
	 var x3=document.f2.password.value;
	 var x4=document.f2.repassword.value;
	 if(x1==null || x1==""){
		 alert("name should not be empty");
		 return false;
	 }
	 if(x2==null || x2==""){
		 alert("username should not be empty");
		 return false;
	 }
	 if(x3==null || x3==""){
		 alert("password should not be empty");
		 return false;
	 }
	 if(x3!=x4){
		 alert("password and repassword should be match");
		 return false;
	 }
	 return true;
 }
 
 </script>


</body>