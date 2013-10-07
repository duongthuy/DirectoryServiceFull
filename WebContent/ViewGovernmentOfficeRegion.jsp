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

<h1>Govrnment Office Rigion Details</h1>
<div style = "float: right">
<input type = "button" value = "Back" onclick ="location.href='ListGovernmentOfficeRegion.jsp'"/>
</div>
<br/>
<div id="view_detail">

<ul>
<li>Details</li>

</ul>

</div>

<div id="content">
<table border = "0">

<tr>
<td>Government Office <br> Region Name</td>
<td> <input type = "text" value = "GOV 1" size = "26" readonly /></td>
</tr>
<tr>
<td >Description</td>
<td> <textarea readonly></textarea></td>
</tr>
<tr>
<td >County</td>
<td> <textarea readonly> </textarea></td>
</tr>
</table>
</div>

<!-- ket thuc -->
</div>
<!-- endshowContent-->
</div>
<!-- end main_content -->

<%@include file="footer.jsp" %>

</div><!--end wapper_page -->
</body>
</html>