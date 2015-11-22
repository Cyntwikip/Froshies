

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Give Right!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
		<!--
        <link rel="stylesheet" href="css/bootstrap.css">
		-->		
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">		
        <link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/orgdashboard.css">
		
		
    </head>

    <body id="bg-image">

		<div class="nav">
				
			<ul class="pull-left">
			  <li><img class="img-responsive" src="img/logo.png" id="mainlogo"></li>
			</ul>
			<ul class="pull-right">
			  <li><a href="#">About</a></li>
			  <li><a href="#">Features</a></li>
			  <li><a href="#">Partners</a></li>
			  <li><a href="#">Contact Us</a></li>
			  <li><a href="#">Log Out</a></li>
			</ul>
				
		</div>
		
		<div class="container">
			
			<div class="col-lg-3" id="list">
				<div>
					<img src="img/jeno.png" class="img-circle" id="avatar">
				</div>
				<h4>Jeno Panganiban,</h4>
				<h4>Organizer</h4>
				<br>
				
				<div class="list-group">
					<a href="#" class="list-group-item active">MAIN</a>
					<a href="#" class="list-group-item">RELIEF GOOD TRACKER</a>
					<a href="#" class="list-group-item">VOLUNTEER TRACKER</a>
				</div>
			</div>
			
			<div class="col-lg-9" id="details">
							
				
				<div class="panel panel-default col-lg-3">
					<div class="panel-heading"><img src="img/releffo.jpg" data-toggle="modal" data-target="#modal-login"></div>
					<div class="panel-body">
					  <h4>De La Salle University</h4>
					  <h4>Relief goods: 40</h4>
					  <h4>Volunteers: 82</h4>
					</div>
				</div>
				
				<div class="panel panel-default col-lg-3">
					<div class="panel-heading"><img src="img/releffo.jpg" data-toggle="modal" data-target="#modal-login"></div>
					<div class="panel-body">
					  <h4>Meadows</h4>
					  <h4>Relief goods: 70</h4>
					  <h4>Volunteers: 32</h4>
					</div>
				</div>
				
				<div class="panel panel-default col-lg-3">
					<div class="panel-heading"><img src="img/releffo.jpg" data-toggle="modal" data-target="#modal-login"></div>
					<div class="panel-body">
					  <h4>California</h4>
					  <h4>Relief goods: 20</h4>
					  <h4>Volunteers: 2</h4>
					</div>
				</div>
				
				<div class="panel panel-default col-lg-3">
					<div class="panel-heading"><img src="img/plus.png"></div>
					<div class="panel-body">
					</div>
				</div>
				
								
			</div>
			
			
			
			
			
		</div>
		
		<!-- LOGIN MODAL -->
        <div class="modal fade" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="modal-login-label" aria-hidden="true">
        	<div class="login-modal-dialog">
        		<div class="modal-content">
        			
        			<div class="modal-header">
        				<h3>Edit Operation Information</h3>
        			</div>
        			
        			<div class="modal-body">
        				
	                    <form role="form" action="" method="post" class="login-form">
	                    	<div class="form-group">
	                    		<label class="sr-only" for="form-username">Relief Goods</label>
	                        	<input type="text" name="form-username" placeholder="goods..." class="form-username form-control" id="form-username">
	                        </div>
	                        <div class="form-group">
	                        	<label class="sr-only" for="form-password">Volunteers</label>
	                        	<input type="text" name="form-password" placeholder="updated volunteers..." class="form-password form-control" id="form-password">
	                        </div>
	                        
	                        <button type="submit" class="btn login-submit" data-dismiss="modal">Save</button>
	                    </form>
	              						
        			</div>
        			
        		</div>
        	</div>
        </div>
		<!-- END OF LOGIN MODAL -->
		
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		<script src="js/register.js" type="text/javascript"></script>
		
	</body>
	
</html>