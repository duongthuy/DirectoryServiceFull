<html>
<head>
<title></title>
<%@include file="headtag.jsp"%>
</head>
<body>

<body>
<div id="wapper_page">
<%@include file="header.jsp" %>
<!-- main_content -->
<div id="main_content">

<!--Loginform-->
<div id="loginform">
<form action="Homepage.htm" method="post">
<!-- Top -->
<div id="toplogin">
<h1>Login</h1>
<table class="userpass">
<tr>
<td>User Name</td>
<td></td>
<td><input type="text" size="20"/></td>
</tr>
<tr>
<td>Password</td>
<td></td>
<td><input type="password" size="20"/></td>
</tr>
</table>
<div class="checkbox">
<input type="checkbox" />Save password<a href="RetrievePasswordPage.jsp">Forgot Password?</a>
</div>
<div class="logonbutton">
<input type="submit" value="Logon" />
</div>
</div>
<!-- End Top -->
</form>
<!-- Bottom -->
<div id="bottom">
<h1>Welcome you !</h1>
</div>
<!-- End Bottom-->
</div>
<!-- end Loginform-->

</div>
<!-- end main_content -->

<%@include file="footer.jsp" %>
</div><!--end wapper_page -->
</body>
</html>