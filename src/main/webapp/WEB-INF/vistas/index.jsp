<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
		<script src="/postRequest.js"></script>
		<script src="/getRequest.js"></script>
		<title>Testing</title>
	</head>
	<body>
		<div id="postResultDiv" align="center"></div>
		<div class="container">
			<h2>Agregar Libro</h2>
			<form id="bookForm">
				<div class="form-group">
					<label for="nombre">Nombre:</label> 
					<input type="text"
						class="form-control" id="nombre" name="nombre">
				</div>
				<div class="form-group">
					<label for="autor">Autor:</label> 
					<input type="text"
						class="form-control" id="autor" name="autor">
				</div>
				<div class="form-group">
					<label for="anio">A&ntilde;o:</label> 
					<input type="text"
						class="form-control" id="anio" name="anio">
				</div>
				<div class="form-group">
					<label for="editorial">Editorial:</label> 
					<input type="text"
						class="form-control" id="editorial" name="editorial">
				</div>
				<div class="form-group">
					<label for="precio">Precio:</label> 
					<input type="text"
						class="form-control" id="precio" name="precio">
				</div>
				<div class="form-group form-check">
					<label class="form-check-label"> 
					<input
						class="form-check-input" type="checkbox" name="remember">
						Recordar
					</label>
				</div>
				<button type="submit" class="btn btn-primary">Guardar</button>
			</form>
			<br />
			<div class="col-sm-7" style="margin: 20px 0px 20px 0px">
				<button id="getALlBooks" type="button" class="btn btn-primary">Mostrar Libros</button>
				<div id="getResultDiv" style="padding: 20px 10px 20px 50px">
					<ul class="list-group">
					</ul>
				</div>
			</div>
		</div>
	</body>
</html>