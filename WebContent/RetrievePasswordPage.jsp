<html>
<head>
<title></title>
<%@include file="headtag.jsp"%>
</head>
<body>

<body>
<div id="wapper_page">
<%@include file="header.jsp" %>
<div id="main_content">

<!--retrieveform-->
<div id="retrieveform">
<form action ="LoginPage.htm"  method ="post">
<!-- Top -->
<div id="top">
<h1>Retrieve Password</h1>
<table class="userpass">
<tr>
<td>User Name</td>
<td></td>
<td><input type="text" size="30"/></td>
</tr>
<tr>
<td>Email</td>
<td></td>
<td><input type="text" size="30"/></td>
</tr>
</table>
<div class="sendbutton">
<input type="submit" value="Send" />
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
<!-- end retrieveform-->

</div>
<!-- end main_content -->

<%@include file="footer.jsp" %>

</div><!--end wapper_page -->
</body>
</html>