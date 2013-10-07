<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="headtag.jsp"%>
<body>
<div id="wapper_page">
<%@include file="header.jsp" %>
<div id="main_content">
<%@include file="menubar.jsp" %>
<!--showConent-->
<div id="showcontent">
<!-- Moi nguoi chen noi dung cua minh vao -->
<h1>TempPage</h1>
<table class="tablesorter">
<tr>
	<td><a href="#" onclick="Popup=window.open('AddressSearch.jsp','Popup','toolbar=no,location=no,status=no,menubar=no,scrollbars=yes,resizable=no, width=656px,height=550px,left=230,top=23');">Lookup Address</a></td>
	<td> <input type="text" name="address" /> </td>
</tr>
<tr>
	<td><a href="#" onclick="Popup=window.open('AddressSearch.jsp','Popup','toolbar=no,location=no,status=no,menubar=no,scrollbars=yes,resizable=no, width=656px,height=550px,left=230,top=23');">Lookup Business</a></td>
	<td> <input type="text" name="business" /></td>
</tr>
</table>



<!-- ket thuc -->
</div>
<!-- endshowContent-->
</div>
<!-- end main_content -->

<%@include file="footer.jsp" %>

</div><!--end wapper_page -->
</body>
</html>