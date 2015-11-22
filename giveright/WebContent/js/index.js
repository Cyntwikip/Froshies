$("#join-trigger").click(function(){
	alert("test");
  $('#modal-login').modal('hide');
  $('#modal-join').modal('show');
});

$("#forgot-trigger").click(function(){
  $('#modal-login').modal('hide');
  $('#modal-forgot').modal('show');
});

$("#login-trigger").click(function(){
  $('#modal-join').modal('hide');
  $('#modal-login').modal('show');
});

$("#back-login").click(function(){
  $('#modal-forgot').modal('hide');
  $('#modal-login').modal('show');
});

$("#back-join").click(function(){
  $('#modal-forgot').modal('hide');
  $('#modal-join').modal('show');
});

$("#step2-trigger").click(function(){
  alert("Inside step2-trigger!!");
  $('#modal-register').modal('hide');
  $('#modal-step2').modal('show');
});

$("#test").click(function(){
  $('#modal-login').modal('hide');
  $('#modal-step2').modal('show');
});

$(function(){
    $('#login-form').on('submit', function(e){
    	alert(1);
    	
        e.preventDefault();
        $.ajax({
            url: "/login",
            type: 'POST', //or POST
            data: $('#login-form').serialize(),
            success: function(data){
                 alert('successfully submitted');
            }
        });
    });
});
