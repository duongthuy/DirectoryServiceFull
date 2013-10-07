<h1>Programme List</h1>
<div class="toolbarhead">
<div id = "link_filter">
<a href = "">All</a>|
<a href = "">0 - 9</a>|
<a href=""> A </a>
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
</div>

<div id = "creat_program">
<input type = "button" value = "Create"  class="" onclick = "location.href = 'ProgrammeDetails.htm'"/>
<input type = "checkbox" />Include In-active
</div>
</div>

<div class="tablecontain" >
<table id="insured_list" class="tablesorter">
<thead>
<tr>
<th >Programme Name</th>
<th >Contact</th>
<th >Description</th>
<th >Is Active?</th>
</tr>
</thead>

<tr>
<td ><a href ="ProgrammeDetails.htm" onclick="">Thao Tran Thi Huong</a></td>
<td >Kim Lien - Ha Noi</td>
<td >Developer</td>
<td >Yes</td>
</tr>

<tr>
<td ><a href ="ProgrammeDetails.htm">Long Le Van</a></td>
<td >Ha Dong - Ha Noi</td>
<td >Developer</td>
<td >Yes</td>
</tr>

<tr>
<td ><a href ="ProgrammeDetails.htm">Van Vuong Thi Thuy</a></td>
<td >Trieu Khuc - Ha Noi</td>
<td >Developer</td>
<td >Yes</td>
</tr>

<tr>
<td ><a href ="ProgrammeDetails.htm">Anh Duong Hoang</a></td>
<td >Phung Khoang - Ha Noi</td>
<td >Developer</td>
<td >Yes</td>
</tr>

<tr>
<td><a href ="ProgrammeDetails.htm">Thanh Pham Van</a></td>
<td>Ha Noi</td>
<td >Developer</td>
<td >Yes</td>
</tr>
</table>
</div>

<br />

<div id="pager" class="pager">
<form style="float:right; margin-right:30px">
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