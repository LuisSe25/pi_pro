
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>Login de BCP</title>

<!-- Normalize V8.0.1 -->
	<link rel="stylesheet" href="css/normalize.css">

	<!-- Bootstrap V4.3 -->
	<link rel="stylesheet" href="css/bootstrap.min.css">

	<!-- Bootstrap Material Design V4.0 -->
	<link rel="stylesheet" href="css/bootstrap-material-design.min.css">

	<!-- Font Awesome V5.9.0 -->
	<link rel="stylesheet" href="css/all.css">

	<!-- Sweet Alerts V8.13.0 CSS file -->
	<link rel="stylesheet" href="css/sweetalert2.min.css">

	<!-- Sweet Alert V8.13.0 JS file -->
	<script src="js/sweetalert2.min.js" ></script>

	<!-- jQuery Custom Content Scroller V3.1.5 -->
	<link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
	
	<!-- General Styles -->
	<link rel="stylesheet" href="css/style.css">


</head>   
<body>    
	<div class="login-container" >
		<div class="login-content"  style="width: 700px" >
		      <div class="top-content"  >
            <div class="inner-bg">
                <div class="container"   >
			<c:if test="${requestScope.mensaje != null}">
               		<div class="alert alert-danger fade in" id="success-alert">
				        <a href="#" class="close" data-dismiss="alert">&times;</a>
				        <strong>${requestScope.mensaje}</strong>
				    </div>
				    </c:if>
                    <div class="row">
                        <div class="col-sm-12 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        		
                        		
                        			<p class="text-center">
				<i class="fas fa-user-circle fa-5x"></i>
			</p>	<h3>Ingreso al Portal BCP</h3>
                            		<p>Ingrese su usuario y contraseña:</p>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form id="id_form"  action="login" method="post" class="login-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username" >Usuario</label>
			                        	<input type="text" name="login"  placeholder="Usuario..." class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Contraseña</label>
			                        	<input type="password" name="password" placeholder="Contraseña..." class="form-password form-control" id="form-password">
			                        </div>
			                       <button type="submit" class="btn"> Ingresar</button> 
			                    </form>
		                    </div>
                        </div>
                    </div>  
                </div>
            </div>
        </div>
</div>
</div>
<script type="text/javascript">
$("#success-alert").fadeTo(1000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});
</script>


<script type="text/javascript">


$(document).ready(function() {
    $('#id_form').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	login: {
                validators: {
                    notEmpty: {
                        message: 'El usuario es un campo obligatorio'
                    }
                }
            },
            password: {
                validators: {
                    notEmpty: {
                        message: 'La contraseña es un campo obligatorio'
                    }
                }
            }
        }   
    });

    // Validate the form manually
    $('#validateBtn').click(function() {
        $('#id_form').bootstrapValidator('validate');
    });
});
</script>
	<!--=============================================
	=            Include JavaScript files           =
	==============================================-->
	<!-- jQuery V3.4.1 -->
	<script src="js/jquery-3.4.1.min.js" ></script>

	<!-- popper -->
	<script src="js/popper.min.js" ></script>

	<!-- Bootstrap V4.3 -->
	<script src="js/bootstrap.min.js" ></script>

	<!-- jQuery Custom Content Scroller V3.1.5 -->
	<script src="js/jquery.mCustomScrollbar.concat.min.js" ></script>

	<!-- Bootstrap Material Design V4.0 -->
	<script src="js/bootstrap-material-design.min.js" ></script>
	<script>$(document).ready(function() { $('body').bootstrapMaterialDesign(); });</script>

	<script src="js/main.js" ></script>
</body>
</html>
