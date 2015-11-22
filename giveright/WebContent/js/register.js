
$(document).ready(function() {
	$("#step-2").hide();
});

$("#signupbtn").click(function(){
	$("#step-1").show();
	$("#step-2").hide();
	$("#volunteer-type-1").hide();
	$("#volunteer-type-2").show();
});

$("#vto").click(function() {
	$("#volunteer-type-1").show();
	$("#volunteer-type-2").hide();
});

$("#vti").click(function() {
	$("#volunteer-type-1").hide();
	$("#volunteer-type-2").show();
});

$("#step2-trigger").click(function(){
	$('#step-1').hide();
	$('#step-2').show();
	
	
  $('#modal-register').modal('hide');
  $('#modal-step2').modal('show');
});

$("close-modals").click(function(){
  $('#modal-step2').modal('hide');
});


$("#step-2").hide();
