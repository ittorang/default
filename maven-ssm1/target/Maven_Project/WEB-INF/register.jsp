<%@ page language="java" contentType="text/html; charset=UFT-8"
    pageEncoding="UFT-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UFT-8">
<title>Insert title here</title>
</head>
<body>

<form action="/register" enctype="multipart/form-data">
	
	<label>账户
		<input name="userName" type="text">
	</label>
	
	<label>
		<input name="passWord" type="password">
	</label>
	<label >
		<input name="selfie" type="file">
	</label>
	
	<input value="提交" type="submit" >
</form>

</body>
</html>