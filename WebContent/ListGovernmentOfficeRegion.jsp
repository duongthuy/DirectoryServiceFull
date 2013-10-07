<%@ taglib prefix="s" uri="/struts-tags" %>
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

<h1 class = "styleTitle">List Government Office Region</h1>
<table border = "0">
<tr>
<td>
<a href = "">All</a>|
<a href = "">0 - 9</a>|
<a href=""> A </a>|
<a href=""> B </a>
<a href=""> C </a>
<a href=""> D </a>
<a href=""> E </a>|
<a href=""> F </a>
<a href=""> G </a>
<a href=""> H </a>
<a href=""> I </a>
<a href=""> J </a>|
<a href=""> K </a>
<a href=""> L </a>
<a href=""> M </a>
<a href=""> N </a>|
<a href=""> O </a>
<a href=""> P </a>
<a href=""> Q </a>
<a href=""> R </a>|
<a href=""> W </a>
<a href=""> X </a>
<a href=""> Y </a>
<a href=""> Z </a>
</td>
<td class="style1"></td>
<td>
<div style = "float:right">
<input type = "checkbox" />Include In-active
</div>
</td>
</tr>
</table>
<div style = "margin: 20px" auto>
<table id="insured_list" class="tablesorter">
<thead>
<tr>
<th>Govt Office Region Name</th>
<th>Description</th>
<th>County </th>
<th>Is Active?</th>
</tr>
</thead>
<tr>
<td><a href ="ViewGovernmentOfficeRegion.jsp">Government Name 1</a></td>
<td>Description 1</td>
<td> German </td>
<td>Yes</td>
</tr>
<tr>
<td><a href ="ViewGovernmentOfficeRegion.jsp">Government Name 2</a></td>
<td >Description 2</td>
<td> </td>
<td>Yes</td>
</tr>

</table>
</div>
<br />

<div id="pager" class="pager">
<form>
<img src="images/first.png" class="first"/>
<img src="images/prev.png" class="prev"/>
Page
<input type="text" class="pagedisplay" size="5"/>
<img src="images/next.png" class="next"/>
<img src="images/last.png" class="last"/>
</form>
</div>

<script defer="defer">
$(document).ready(function () {
$("#insured_list")
.tablesorter({ widthFixed: true, widgets: ['zebra'] })
.tablesorterPager({ container: $("#pager") });
}
);
</script>

<!-- ket thuc -->
</div>
<!-- endshowContent-->
</div>
<!-- end main_content -->

<%@include file="footer.jsp" %>

</div><!--end wapper_page -->
</body>
</html>