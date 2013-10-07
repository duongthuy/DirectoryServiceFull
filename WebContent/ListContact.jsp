<div>
<h1>Search Contacts</h1>
</div>
<div class="first_sur">
<p>Firstname: <input type="text" /></p>
<p>Surname: <input type="text" /></p>
</div>
<div class="buttonlist">
<input type="button" value="Search Contacts" />
<input type="button" value="None" />
<input type="button" value="Clear" />
<input type="button" value="Create" onclick="Popup=window.open('../popup/AddContact.htm','Popup','toolbar=no,location=no,status=no,menubar=no,scrollbars=yes,resizable=no, width=650px,height=550px,left=230,top=23');"/>
<p>
<input type="checkbox" /> Include in-active contact?
</p>
</div>
<div class=" tablecontain">

<table id="insured_list" class="tablesorter">
<thead>
<tr>
<td></td>
<th>Contact Name</th>
<th>Mobile Phone</th>
<th>Email</th>
<th>Contact Type</th>
<th>Is Active?</th>
</tr>
</thead>
<tr>
<td><input type="radio"/></td>
<td>Contact</td>
<td>1234</td>
<td>vanvtt006@fsoft.com.vn</td>
<td>Operational</td>
<td>Yes</td>
</tr>
<tr>
<td><input type="radio"/></td>
<td>Contact</td>
<td>1234</td>
<td>vanvtt006@fsoft.com.vn</td>
<td>Operational</td>
<td>Yes</td>
</tr>
<tr>
<td><input type="radio"/></td>
<td>Contact</td>
<td>1234</td>
<td>vanvtt006@fsoft.com.vn</td>
<td>Operational</td>
<td>Yes</td>
</tr>
<tr>
<td><input type="radio"/></td>
<td>Contact</td>
<td>1234</td>
<td>vanvtt006@fsoft.com.vn</td>
<td>Operational</td>
<td>Yes</td>
</tr>
<tr>
<td><input type="radio"/></td>
<td>Contact</td>
<td>1234</td>
<td>vanvtt006@fsoft.com.vn</td>
<td>Operational</td>
<td>Yes</td>
</tr>
<tr>
<td><input type="radio"/></td>
<td>Contact</td>
<td>1234</td>
<td>vanvtt006@fsoft.com.vn</td>
<td>Operational</td>
<td>Yes</td>
</tr>
</table>
</div>

<div id="pager" class="pager">
<form>
<img src="images/first.png" class="first"/>
<img src="images/prev.png" class="prev"/>
<input type="text" class="pagedisplay" size="5"/>
<img src="images/next.png" class="next"/>
<img src="images/last.png" class="last"/>
</form>
</div>

<div class="endbutton">
<input type="button" value="Select" />
<input type="button" value="Edit" onclick="Popup=window.open('../popup/EditContact.htm','Popup','toolbar=no,location=no,status=no,menubar=no,scrollbars=yes,resizable=no, width=650px,height=550px,left=230,top=23');"/>
<input type="button" value="Close" />
</div>

<script defer="defer">
$(document).ready(function()
{
$("#insured_list")
.tablesorter({widthFixed: true, widgets: ['zebra']})
.tablesorterPager({container: $("#pager")});
}
);
</script>