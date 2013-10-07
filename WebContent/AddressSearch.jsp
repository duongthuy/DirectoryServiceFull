<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
    <title>Search Postcode</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" />
	<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>
	<script type="text/javascript" src="js/jquery.tablesorter.js"></script>
	<script type="text/javascript" src="js/jquery.tablesorter.pager.js"></script>
</head>
<body>
<form id="address">
<h3>Address Search</h3>
<div class="inputSearch">
&nbsp;Postcode<input type="text" size="20" name="postcode" style="margin-left:10px" />
&nbsp;Street <input type="text" size="20" name="street" style="margin-left:10px" />
&nbsp;Town<input type="text" size="20" name="town" style="margin-left:10px" />
</div>


<div class="search" >
<input type="button" name="searchAddress" value="Search Address" />
<input type="button" name="none" value="None" />
<input type="button" name="clear" value="Clear" />
</div>


<div class="layout" style="height:300px">
<table id="insured_list" class="tablesorter" >
<thead> 
    <tr>
        <th></th>
        <th>Address</th>
        <th>Post code</th>
        <th>Town</th>
        <th>County</th>
        <th>Country</th>
    </tr>
</thead>
<tbody> 
    <tr>
        <td><input type="radio" name="radio" /></td>
        <td>Address 1</td>
        <td>Postcode 1</td>
        <td>Town 1</td>
        <td>County 1</td>
        <td>Country 1</td>
    </tr>

</tbody> 
</table>
</div>


<div id="pager" class="pager">
		<img src="images/first.png" class="first"/>
		<img src="images/prev.png" class="prev"/>
		<input type="text" class="pagedisplay"/>
		<img src="images/next.png" class="next"/>
		<img src="images/last.png" class="last"/>
		
</div>

<div class="end">
    <input type="button" name="select" value="Select" />
    <input type="button" name="close" value="Close" />
</div>
</form>
<script defer="defer">
	$(document).ready(function() 
    { 
        $("#insured_list")
		.tablesorter({widthFixed: true, widgets: ['zebra']})
		.tablesorterPager({container: $("#pager")}); 
    } 
	); 
</script>
</body>
</html>
