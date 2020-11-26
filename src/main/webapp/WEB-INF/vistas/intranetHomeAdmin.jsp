
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="intranetValida.jsp" />
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>

<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/dataTables.bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>


<title>Sistemas - Jorge Jacinto Gutarra</title>
</head>
       
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<title>Buscar clientes</title>

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

	<!-- Sweet Alert V8.13.0 JS file-->
	<script src="js/sweetalert2.min.js" ></script>

	<!-- jQuery Custom Content Scroller V3.1.5 -->
	<link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
	<!-- General Styles -->
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	
	<!-- Main container -->
	<main class="full-box main-container">
		<!-- Nav lateral -->
		<section class="full-box nav-lateral">
			<div class="full-box nav-lateral-bg show-nav-lateral"></div>
			<div class="full-box nav-lateral-content">
				<figure class="full-box nav-lateral-avatar">
					<i class="far fa-times-circle show-nav-lateral"></i>
					<img src="assets/avatar/Avatar.png" class="img-fluid" alt="Avatar">
					<figcaption class="roboto-medium text-center">
					<h6>Bienvenido Sr(a):        </h6>
					<h6> ${sessionScope.objCliente.nombreCompleto}</h6>   
                    <h6>Roles: <c:forEach var="x" items="${sessionScope.objRoles}">${x.nombre}</c:forEach></h6>
					</figcaption>
				</figure>
				<div class="full-box nav-lateral-bar"></div>
				<nav class="full-box nav-lateral-menu">
					<ul>
						<li>
							<a href="home.html"><i class="fab fa-dashcube fa-fw"></i> &nbsp; Menu</a>
						</li>

						<li>
							<a href="#" class="nav-btn-submenu"><i class="fas fa-users fa-fw"></i> &nbsp; Clientes <i class="fas fa-chevron-down"></i></a>
							<ul>
								<li>
									<a href="intranetHome.jsp"><i class="fas fa-clipboard-list fa-fw"></i> &nbsp; Lista de clientes</a>
								</li>
								<li>
									<a href="http://localhost:8090/login#"><i class="fas fa-search fa-fw"></i> &nbsp; Buscar cliente</a>
								</li>
							</ul>
						</li>


						<li>
							<a href="#" class="nav-btn-submenu"><i class="fas fa-file-invoice-dollar fa-fw"></i> &nbsp;Historial<i class="fas fa-chevron-down"></i></a>
							<ul>
								<li>
									<a href="http://localhost:8090/verIntranetHistorial"><i class="fas fa-clipboard-list fa-fw"></i> &nbsp; Historial Clientes</a>
								</li>
								<li>
									<a href="reservation-list.html"><i class="fas fa-clipboard-list fa-fw"></i> &nbsp; Lista de prestamos</a>
								</li>
							</ul>
						</li>
							<li>
							<a href="#" class="nav-btn-submenu"><i class="fas fa-file-invoice-dollar fa-fw"></i> &nbsp; Prestamos <i class="fas fa-chevron-down"></i></a>
							<ul>
								<li>
									<a href="reservation-new.html"><i class="fas fa-plus fa-fw"></i> &nbsp; Nuevo prestamo</a>
								</li>
								<li>
									<a href="reservation-list.html"><i class="fas fa-clipboard-list fa-fw"></i> &nbsp; Lista de prestamos</a>
								</li>
								<li>
									<a href="reservation-search.html"><i class="fas fa-search-dollar fa-fw"></i> &nbsp; Buscar prestamos</a>
								</li>
								<li>
									<a href="reservation-pending.html"><i class="fas fa-hand-holding-usd fa-fw"></i> &nbsp; Prestamos pendientes</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="company.html"><i class="fas fa-store-alt fa-fw"></i> &nbsp; Empresa</a>
						</li>
</ul>
				</nav>
			</div>
		</section>
		
		
		
		
		
		
		<!-- Page content -->
		<section class="full-box page-content">
			<nav class="full-box navbar-info">
				<a href="#" class="float-left show-nav-lateral">
					<i class="fas fa-exchange-alt"></i>
				</a>
				<a href="#">
					<i class="fas fa-user-cog"></i>
				</a>
				<a href="#" class="btn-exit-system">
					<i class="fas fa-power-off"></i>
				</a>
			</nav>
			<!-- Page header -->
			
			
			
			
			
			<div class="full-box page-header">
				<h3 class="text-left">
				<i class="far fa-inbox-out"></i> &nbsp; Enviar Notificaciones a Cliente					
					
				</h3>
			</div>
			<!-- Content here-->
			<div class="container-fluid"  >
				<form class="form-neon" action="">
						<div class="row justify-content-md"  >
							<div class="col-12 col-md-6">
						
							<table>
							<tr>
							<td>
								<div class="form-group" style="width:400px; margin-left: 70px">
									<label for="inputSearch" class="bmd-label-floating"    style="margin-left: 10px; ">Escribe el Nombre del Cliente que buscas</label>
			<input type="text" class="form-control" name="busqueda-" id="inputSearch" maxlength="30">
							</div>
								</td>
							
								<td>
							<div class="form-group" >
							<p class="text-right" style="margin-right: 270px; margin-left: 20px ; margin-top: 25px ">
									<button type="submit" class="btn btn-raised btn-info"><i class="fas fa-search"></i> &nbsp; BUSCAR</button>
								</p>
							</div>
								</td>
								</tr>
							</table>
								</div>
							</div>
								</form>
						</div>
					
					
					
					
			<div class="container-fluid">
				 <form accept-charset="UTF-8"  action="consultaCrudUsuario" class="simple_form" id="defaultForm2"  method="post">

					<div class="row" style="height: 70px">
						<div class="col-md-2" >
								<input class="form-control" id="id_nonbre_filtro"  name="filtro" placeholder="Ingrese el nombre" type="text" maxlength="30"/>
						</div>
						<div class="col-md-2" >
							<button type="submit" class="btn btn-primary" style="width: 150px">FILTRA</button>
						</div>
						<div class="col-md-2">
							<button type="button" data-toggle='modal' onclick="registrar();"  class='btn btn-success' id="validateBtnw2" style="width: 150px">REGISTRA</button>
						</div>
						<div class="col-md-4">
							<c:if test="${sessionScope.MENSAJE != null }">
									<div class="alert alert-success" id="success-alert">
							 		   <button type="button" class="close" data-dismiss="alert">x</button>
										${sessionScope.MENSAJE}				
									</div>
							</c:if>
							<c:remove var="MENSAJE"/>
						</div>
					</div>
					
					<div class="row" > 
						<div class="col-md-12">
								<div class="content" >
						<!--        <table id="tablePaginacion" class="table table-striped table-bordered" >    -->
												<div class="table-responsive">
				
									<table class="table table-dark table-sm">
										<thead>
											<tr>
								<th>ID</th>
								<th>NOMBRE</th>
								<th>APELLIDO</th>
								<th>N CUENTA</th>
						
											</tr>
										</thead>
										<tbody>
												   
												<c:forEach items="${sessionScope.usuarios}" var="x">
													<tr>
														<td>${x.idCliente}</td>
														<td>${x.nombre}</td>
														<td>${x.apellido}</td>
																											<td>
														<!--  	<a href="#" class="btn btn-success">  -->
							  							<i class="far fa-envelope"></i>	
							  							<input type="checkbox"   value="sdf" /></a>
														</td>
													</tr>
												</c:forEach>
										</tbody>
										</table>	
										
										</div>
									
								</div>	
						</div>
					</div>
		 		</form>
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			<!-- Mensaje de Abajo-->
			<div class="container-fluid"  >
				<form class="form-neon" action="">
						<div class="row justify-content-md"  >
							<div class="col-12 col-md-6">
						
							<table>
							<tr>
							<td>
								<div class="form-group" style="width:800px; margin-left: 5px">
								<label for="inputSearch" class="bmd-label-floating"    style="margin-left: 10px; ">Mensaje</label>	
			<input type="text" class="form-control" name="busqueda-" id="inputSearch" maxlength="90">
							</div>
								</td>
							<td>
							<div class="form-group" >
							<p class="text-right" style="margin-right: 270px; margin-left: 20px ; margin-top: 25px ">
									<button type="submit" class="btn btn-raised btn-info"><i class="far fa-envelope"></i> &nbsp; ENVIAR</button>
								</p>
							</div>
								</td>
								</tr>
							</table>
							</div>
							</div>
							</form>
						</div>
				<nav aria-label="Page navigation example">
					<ul class="pagination justify-content-center">
						<li class="page-item disabled">
							<a class="page-link" href="#" tabindex="-1">Previous</a>
						</li>
						<li class="page-item"><a class="page-link" href="#">1</a></li>
						<li class="page-item"><a class="page-link" href="#">2</a></li>
						<li class="page-item"><a class="page-link" href="#">3</a></li>
						<li class="page-item">
							<a class="page-link" href="#">Next</a>
						</li>
					</ul>
				</nav>
			</div>

		</section>
	</main>
	
	
	<!--=============================================
	=            Include JavaScript files           =
	==============================================-->
	<!-- jQuery V3.4.1                   <script src="js/jquery-3.4.1.min.js" ></script> -->
	

	<!-- popper                    -->
	
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