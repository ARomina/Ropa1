<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="ar.edu.grupoesfera.cursospring.modelo.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Ropa's - Tu tienda online</title>
	<link rel="shortcut icon" href="images/favicon.png">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
</head>
<body>
	<header id="header">
		<%@include file="header.jsp" %>
		<%@include file="combo.jsp" %>
	
		<div class="header-bottom">
			<div class="container">
				<div class="row">
					<div class="col-sm-12">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu">
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="/ropa">INICIO</a></li>
								<li class="dropdown"><a href="">PRODUCTOS<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="/ropa/productosMu">Mujeres</a></li>
										<li><a href="/ropa/productosHo">Hombres</a></li> 
										<li><a href="/ropa/productosNi">Niños</a></li>  
                                    </ul>
                                </li> 								
								<li><a href="/ropa/registro">REGISTRO</a></li> 
								<li><a href="/ropa/contacto">CONTACTO</a></li>
								<li><a href="/ropa1/administrar"  class="active">ADMINISTRACION</a></li>
							</ul>
						</div>
						</div>
					</div>
					</div>

				</div>
			</div>
				
	</header>
	 
	<div id="contact-page" class="container">
    	<div class="bg">
	    	<div class="row">  		
	    		<div class="col-sm-12 padding-right"> 
	    		<h1 class="title text-center">${info}</h1>
	    		<h1 class="title text-center">${info2}</h1>      			   			
				</div>			 		
			</div>    	
    		<div class="row">  	
	    		<div class="col-sm-12">
	    			<div class="contact-form">
	    
	    				<!--<form:form action="" modelAttribute="producto" id="main-contact-form" class="contact-form row" role="form" method="GET" name="verStock">	
							<div class="col-md-12">
								<table class="table table-bordered sortable-theme-bootstrap col-md-12" data-sortable>
									<tr>
										<th>CODIGO</th>
										<th>CATEGORIA</th>
										<th>NOMBRE</th>
										<th>COLOR</th>
										<th>TALLE</th>
										<th>PRECIO</th>
										<th>CANTIDAD</th>									
									</tr>
									<!--<c:forEach items="${productosStock}" var="producto">
									<tr>
										<td>${producto.key.id}</td>
										<td>${producto.key.categoria}</td>
										<td>${producto.key.nombreProducto}</td>
										<td>${producto.key.color}</td>	
										<td>${producto.key.talle}</td>
										<td>${producto.key.precio}</td>
										<td>${producto.value}</td>
									</tr>
									</c:forEach>-->
									<!--<tr>
										<td>${producto.id}</td>
										<td>${producto.categoria}</td>
										<td>${producto.nombreProducto}</td>
										<td>${producto.color}</td>	
										<td>${producto.talle}</td>
										<td>${producto.precio}</td>
										
									</tr>
								</table>							
							</div>
						</form:form>-->
						<form:form action="" modelAttribute="producto" id="main-contact-form" class="contact-form row"  method="GET" name="verStock">
			<table class="table table-bordered sortable-theme-bootstrap" data-sortable>
					<tr>
						<th>CODIGO</th>
						<th>CATEGORIA</th>
						<th>NOMBRE</th>
						<th>COLOR</th>
						<th>TALLE</th>
						<th>PRECIO</th>
						<th>CANTIDAD</th>
					</tr>

					<tr>
						<td>${producto.id}</td>
						<td>${producto.categoria}</td>
						<td>${producto.nombreProducto}</td>
						<td>${producto.color}</td>	
						<td>${producto.talle}</td>
						<td>${producto.precio}</td>	
						<th>${productoCantidad}</th>										
					</tr>

			</table>
			</form:form>
	    			</div>
	    		</div>  				
	    	</div>  
    	</div>
		
		<br/><br/>
    	<div class="bg">   	
    		<div class="row">  	
	    		<div class="col-sm-12">
	    			<div class="contact-form">
				    	<form id="main-contact-form" class="contact-form row" name="cantidad" method="post">
				            <div class="form-group col-md-4">
				                <input name="fecha" required="required" placeholder="Ingrese Fecha dd/mm/aaaa" id="fecha" type="datetime" class="form-control">
				            </div>	
							<div class="form-group col-md-4">
								<input type="text" name="cantidad" class="form-control" required="required" placeholder="Ingrese Cantidad">
							</div>
				            <div class="form-group col-md-4">
				              
				            </div>																										
				        </form>
	    			</div>
	    		</div>			
	    	</div>  
    	</div>	
</div>	
	<%@include file="footer.jsp" %>
  
    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>