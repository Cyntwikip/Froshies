


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
		<link rel="stylesheet" href="css/voldashboard.css">
		
		
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
			
			<div class="col-lg-3 left-part">			
				<div>
					<img src="img/jeno.png" class="img-circle" id="avatar">
				</div>
				<h4>Jude Michael,</h4>
				<h4>Volunteer</h4>
				<br>
				
				<div class="list-group">
					<a href="#" class="active">MAIN</a><br>
					<a href="#" >PERSONAL TRACKING</a><br>
					<a href="#" >ACCOUNT SETTING</a><br>
				</div>
			</div>
			
			<div class="col-lg-5 mid-part">
				<p class="text1">SITES NEAR YOUR AREA</p>
				
				<div class="container"><img src="img/map.png" id="gmaps"></div>
				
				<!--
				<div id="gmaps"></div>
				-->
				<br>
				<p class="text1">SITES IN NEED OF RELIEF GOODS</p>
				<br>
				
				<div class="row"> 
				
					<div class="first-column">
						<button type="button" data-toggle="modal" data-target="#modal-donation" class="btn1">
							NCR, Makati<br>
							Globe Circuit Event Grounds<br>
							Goods needed: Rice
						</button>
						<button type="button" class="btn1">
							Lorem ipsum<br>
							solor sit amet, consectetur<br>
							Goods needed: Water
						</button>
					</div>
					
					<div class="second-column">
						<button type="button" class="btn1">
							NCR, Makati<br>
							Globe Circuit Event Grounds<br>
							Goods needed: Rice
						</button>
						<button type="button" class="btn1">
							Lorem ipsum<br>
							solor sit amet, consectetur<br>
							Goods needed: Water
						</button>
					</div>
				
				</div>
				
			</div>
			
			<div class="col-lg-4 right-part">
				<p class="text1">SITES IN NEED OF VOLUNTEERS</p>	
				<br><br>
				
				<button type="button" data-toggle="modal" data-target="#modal-volunteer" class="btn2">
					NCR, Makati<br>
					Globe Circuit Event Grounds<br>
					Goods needed: Rice
				</button>
				
				<button type="button" class="btn2">
					NCR, Makati<br>
					Globe Circuit Event Grounds<br>
					Goods needed: Rice
				</button>
				
				<button type="button" class="btn2">
					Lorem ipsum<br>
					solor sit amet, consectetur<br>
					Goods needed: Water
				</button>
				
				<button type="button" class="btn2">
					Lorem ipsum<br>
					solor sit amet, consectetur<br>
					Goods needed: Water
				</button>
				
			</div>
						
		</div>
		
		<!-- DONATION MODAL -->
        <div class="modal fade" id="modal-donation" tabindex="-1" role="dialog" aria-labelledby="modal-login-label" aria-hidden="true">
        	<div class="login-modal-dialog">
        		<div class="modal-content">
        			
        			<div class="modal-header">
        				<h3>Donate</h3>
        			</div>
        			
        			<div class="modal-body">
        				
	                    <form role="form" action="" method="post" class="login-form">
	                    	<div class="form-group">
	                    		<label class="sr-only" for="form-username">Destination</label>
	                        	<input type="text" name="form-username" placeholder="destination..." class="form-username form-control" id="form-username">
	                        </div>
	                        <div class="form-group">
	                        	<label class="sr-only" for="form-password">Name</label>
	                        	<input type="text" name="form-password" placeholder="your full name..." class="form-password form-control" id="form-password">
	                        </div>
							<div class="form-group">
	                    		<label class="sr-only" for="form-username">Quantity</label>
	                        	<input type="text" name="form-username" placeholder="how many..." class="form-username form-control" id="form-username">
	                        </div>
	                        
	                        <button type="submit" class="btn login-submit" data-dismiss="modal">Done</button>
	                    </form>
	                    
						
        			</div>
        			
        		</div>
        	</div>
        </div>
		<!-- END OF DONATION MODAL -->
		
		<!-- VOLUNTEER MODAL -->
        <div class="modal fade" id="modal-volunteer" tabindex="-1" role="dialog" aria-labelledby="modal-login-label" aria-hidden="true">
        	<div class="login-modal-dialog">
        		<div class="modal-content">
        			
        			<div class="modal-header">
        				<h3>Volunteer</h3>
        			</div>
        			
        			<div class="modal-body">
        				
	                    <form role="form" action="" method="post" class="login-form">
	                    	<div class="form-group">
	                    		<label class="sr-only" for="form-username">Destination</label>
	                        	<input type="text" name="form-username" placeholder="destination..." class="form-username form-control" id="form-username">
	                        </div>
	                        <div class="form-group">
	                        	<label class="sr-only" for="form-password">Role</label>
	                        	<input type="text" name="form-password" placeholder="your role..." class="form-password form-control" id="form-password">
	                        </div>
							
	                        <button type="submit" class="btn login-submit" data-dismiss="modal">Volunteer</button>
	                    </form>
	                    
						
        			</div>
        			
        		</div>
        	</div>
        </div>
		<!-- END OF VOLUNTEER MODAL -->
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		<script src="js/register.js" type="text/javascript"></script>
		
		
	</body>
	
</html>