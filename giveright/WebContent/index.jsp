<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			</ul>
				
		</div>
		
		<div>
			<img class="img-responsive" src="img/logo.png" id="mainimage">
		</div>
		
		<div>
			<p id="text1">Relief efforts done right</p>
		</div>
		
		<div>
			<p id="text2">Manage relief operations and volunteer work with transparency</p>
		</div>
		
		<div class="input_btn">
			<button type="button" data-toggle="modal" data-target="#modal-login" id="loginbtn">Log in</button>
			
			
		</div>		
		
		<img src="img/or-home.png" id="orImage">					
		
		<div class="input_btn">
			<button type="button" data-toggle="modal" data-target="#modal-step1" id="signupbtn">Sign up</button>
		</div>
		
		
		<!-- LOGIN MODAL -->
        <div class="modal fade" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="modal-login-label" aria-hidden="true">
        	<div class="login-modal-dialog">
        		<div class="modal-content">
        			
        			<div class="modal-header">
        				<img src="img/login-text.png">
        			</div>
        			
        			<div class="modal-body">
	                    <form action="login" method="POST" >
	                    	<div class="form-group">
	                    		<label class="sr-only" for="username">Username</label>
	                        	<input type="text" name="username" placeholder="username..." class="form-username form-control" id="username">
	                        </div>
	                        <div class="form-group">
	                        	<label class="sr-only" for="password">Password</label>
	                        	<input type="text" name="password" placeholder="password..." class="form-password form-control" id="password">
	                        </div>
	                        
	                        <input type="submit" class="btn login-submit" value="Done" id="login-button"/>
	                    </form>
	                    
						<img src="img/or.png" id="orImage">
        			</div>
        		</div>
        	</div>
        </div>
		<!-- END OF LOGIN MODAL -->
		
		<!-- REGISTER MODAL -->
        <div class="modal fade" id="modal-step1" tabindex="-1" role="dialog" aria-labelledby="modal-register-label" aria-hidden="true">
        	<div class="register-modal-dialog">
        		<div class="modal-content">
        		
		            <form role="form" action="register" method="post" class="registration-form">
        			<div id="step-1">	
        				<div class="modal-header">
        					<img src="img/step1.png">
        				</div>
        			
        				<div class="modal-body">
								<h5>Account Type</h5>
								<label class="radio-inline"><input type="radio" name="newAccountType" value="volunteer">Volunteer</label>
								<label class="radio-inline"><input type="radio" name="newAccountType" value="volunteer">Organizer</label>
								
								<br><br>
												
								<div class="row">
									<div class="first-column">
										<div class="form-group">
											<h5>Username</h5>
											<label class="sr-only" for="newUsername">Username</label>
											<input type="text" name="newUsername" placeholder="Your Username..." class="form-first-name form-control" id="form-first-name">
										</div>
											
										<div class="form-group">
											<h5>Email Address</h5>
											<label class="sr-only" for="newEmail">Email</label>
											<input type="text" name="newEmail" placeholder="Email Address..." class="form-last-name form-control" id="form-email">
										</div>
										<div class="form-group">
											<h5>Confirm Email address<h5>
											<label class="sr-only" for="newEmailConfirm">ConfirmEmail</label>
											<input type="text" name="newEmailConfirm" placeholder="Confirm Email..." class="form-email form-control" id="form-email">
										</div>
									</div>								
										
									<div class="second-column">
										<div class="form-group">
											<h5>Password<h5>
											<label class="sr-only" for="newPassword">Password</label>
											<input type="text" name="newPassword" placeholder="Password..." class="form-email form-control" id="form-email">
										</div>
										<div class="form-group">
											<h5>Confirm Password<h5>
											<label class="sr-only" for="newPasswordConfirm">ConfirmPassword</label>
											<input type="text" name="newPasswordConfirm" placeholder="Confirm Password..." class="form-email form-control" id="form-email">
										</div>
									</div>
								</div>
									
								<br><br>
									
			                    <button type="button" class="btn login-submit" id="step2-trigger">Proceed to Step 2</button>
			                </div>
			            </div>
			            
			            <div id="step-2">
			                
        					<div class="modal-header">
        						<img src="img/step2.png">
        					</div>
        			
        					<div class="modal-body">
			                	<h5>Volunteer Type</h5>
								<label class="radio-inline"><input id="vti" type="radio" name="newVolunteerType" value="individual">Individual</label>
								<label class="radio-inline"><input id="vto" type="radio" name="newVolunteerType" value="organization">Organization</label>
								
								<br><br>
										
								<div class="row">
								<div class="first-column">
									<div id="volunteer-type-1">
										<div class="form-group">
											<h5>Organization Name</h5>
											<label class="sr-only" for="newOrganizationName">Organization Name</label>
											<input type="text" name="newOrganizationName" placeholder="organization name" class="form-orgname form-control" id="form-orgname">
										</div>
									</div>
									<div id="volunteer-type-2">
										<div class="form-group">
											<h5>First Name</h5>
											<label class="sr-only" for="newFirstName">First Name</label>
											<input type="text" name="newFirstName" placeholder="First name" class="form-orgname form-control" id="form-orgname">
										</div>
										
										<div class="form-group">
											<h5>Last Name</h5>
											<label class="sr-only" for="newLastName">Last Name</label>
											<input type="text" name="newLastName" placeholder="Last name" class="form-orgname form-control" id="form-orgname">
										</div>
									</div>
									
									<div class="form-group">
										<h5>Contact Number 1</h5>
										<label class="sr-only" for="newContactNumber1">Contact number</label>
										<input type="text" name="newContactNumber1" placeholder="mobile number / telephone number" class="form-contact form-control" id="form-contact">
									</div>
									<div class="form-group">
										<h5>Contact Number 2</h5>
										<label class="sr-only" for="newContactNumber2">Contact number</label>
										<input type="text" name="newContactNumber2" placeholder="mobile number / telephone number" class="form-contact form-control" id="form-contact">
									</div>
								</div>								
								
								<div class="second-column">
								
									<div class="form-group">
										<h5>Region<h5>
										<label class="sr-only" for="newRegion">Region</label>
										<input type="text" name="newRegion" placeholder="Region I" class="form-region form-control" id="form-region">
									</div>
									<div class="form-group">
										<h5>Province<h5>
										<label class="sr-only" for="newProvince">Province</label>
										<input type="text" name="newProvince" placeholder="Ilocos Norte" class="form-province form-control" id="form-province">
									</div>
									<div class="form-group">
										<h5>City / Municipality<h5>
										<label class="sr-only" for="newCity">City</label>
										<input type="text" name="newCity" placeholder="Pagudpud" class="form-city form-control" id="form-city">
									</div>
								</div>
								
							</div>
							
							<br><br>
	                        <button type="submit" class="btn login-submit">Finish Registration</button>
			                </div>
        				</div>
		        	</form>	
        		</div>
        	</div>
        </div>
		<!-- END OF REGISTER MODAL -->
		
		<div class="section2">
            <div class="container">
                <div class="row">
        			<img src="img/1-about-1.jpg">
        			<img src="img/1-about-2.jpg">
                </div>
            </div>
        </div>

        <div class="section3"><center>Click <a href="http://unicornpanduh.tumblr.com">here</a> to get to know more about the developers!</center>

            <div class="container">
                <div class="row">
                    <h2>The developers</h2>
                    <div class="col-lg-3">
                        <!--   <center>Sign up if you are an organization official</center>
                        -->
                        <h3>Jeno Panganiban</h3>
                        <p>
                            A person taking up Bachelor of Science in Computer
                            Science with Specialization in Software Technology
                        </p>

                    </div>

                    <div class="col-lg-3">

                        <h3>Albert Dizon</h3>
                        <p>
                            A person taking up Bachelor of Science in Computer
                            Science with Specialization in Software Technology
                        </p>


                    </div>

                    <div class="col-lg-3">
                        <h3>Arneil Leonin</h3>
                        <p>
                            A person taking up Bachelor of Science in Computer
                            Science with Specialization in Software Technology
                        </p>
                    </div>
                    <div class="col-lg-3">
                        <h3>Jude Teves</h3>
                        <p>
                            A person taking up Bachelor of Science in Computer
                            Science Major in Computer Systems Engineering
                        </p>
                    </div>
                </div>
            </div>
		</div>
		
		<!-- Javascript -->
        <!--<script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        <script src="assets/js/index.js"></script>-->
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		<script src="js/register.js" type="text/javascript"></script>
    </body>
</html>
