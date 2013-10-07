<meta http-equiv="content-type" content="text/html" />
<meta name="author" content="Longka" />
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>
<script type="text/javascript" src="js/jquery.tablesorter.js"></script>
<script type="text/javascript" src="js/jquery.tablesorter.pager.js"></script>
<script>
$(document).ready(function(){
$('#menuitem > li > a').click(function(){
if ($(this).attr('class') != 'active'){
$('#menuitem li ul').slideUp();
$(this).next().slideToggle();
$('#menuitem li a').removeClass('active');
$(this).addClass('active');
}
});
});
</script>
