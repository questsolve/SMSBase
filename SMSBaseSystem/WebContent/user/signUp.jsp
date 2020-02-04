<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<script type="text/javascript">
/*
$( function() {

	function submitSignUp(){
		//$("form").attr("method","POST").attr("action","../user/signup").submit();
		var userId  = $("input[name='userId']").val();
		alert(userId);
		$("form").attr("method","POST").attr("action","/user/signup");
		$("form").submit();
	}
	
	$("input[type='button']").on("click" , function() {
		var userId  = $("input[name='userId']").val();
		alert(userId);
		$("form").attr("method","POST").attr("action","/user/signup");
		$("form").submit();
	});
});
*/
</script>
</head>
<body>
	<form name="signUp" method="post" action="/user/signup">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name ="userId" value="${user.userId }"></td>
			</tr>
			<tr>
				<td>name:</td>
				<td><input type="text" name ="userName" value="${user.userName }"></td>
			</tr>
			<tr>
				<td>password :</td>
				<td><input type="text" name ="userPassword" value="${user.userPassword }"></td>
			</tr>
			<tr>
				<td>email : </td>
				<td><input type="text" name ="userEmail" value="${user.userEmail }"></td>
			</tr>
			<tr>
				<td>job : </td>
				<td><input type="text" name ="userJob" value="${user.userJob }"></td>
			</tr>
			<tr>
				<td>roll : </td>
				<td><input type="text" name ="userRoll" value="${user.userRoll }"></td>
			</tr>
			<tr>
				<td>regdate : </td>
				<!-- <td><input type="text" name ="userRegDate" value=""></td> -->
			</tr>
			<tr>
				<td>payOption : </td>
				<td><input type="text" name ="userPayOption" value="${user.userPayOption}"></td>
			</tr>
			<tr>
				<td>exEmail : </td>
				<td><input type="text" name ="userExternalAccount" value="${user.userExternalAccount}"></td>
			</tr>

			<tr>
				<td><input type="submit" name ="submit" value="submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>