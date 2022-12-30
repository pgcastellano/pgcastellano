<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<jsp:include page="../styles.jsp"/>
		<link href="bootstrap.min.css" rel="stylesheet">
        <link href="style.css" rel="stylesheet">
	</head>
	<body class="text-center">
		<jsp:include page="../navbar.jsp"/>
		
		<main class="container bg-dark rounded">
			<h1>Datos para la inscripción:</h1>
			<div class="row">
				<div class="col-12">
					
					
					<form class="row g-3 needs-validation" novalidate
						action="corredores"
						method="post"
						>
						
						<input type="hidden" name="opcion" value="inscribirme">
						
						
					  <div class="col-md-4">
					    <label for="validationCustom01" class="form-label">
					    	Nombre:
					    </label>
					    <input type="text"
					    	name="nombre" 
					    	class="form-control" 
					    	id="validationCustom01" 
					    	value="" 
					    	required>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom02" class="form-label">Apellido:</label>
					    <input type="text"
					    	name="apellido" 
					    	class="form-control" 
					    	id="validationCustom02"
					    	value="" 
					    	required>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom02" class="form-label">Numero de DNI:</label>
					    <input type="text"
					    	name="dni" 
					    	class="form-control" 
					    	id="validationCustom02"
					    	value="" 
					    	required>
					  </div>
					  					  <div class="col-md-4">
					    <label for="validationCustom02" class="form-label">Elegir Carrera</label>
					    <select name="carrera" required>
        <option value="5k">5k</option>
        <option value="20k">20k</option>
					   </select>
					  </div>

					  <div class="col-12">
					    <button class="btn btn-success" type="submit" value="inscribirme">INSCRIBIRME</button>
					  </div>
					</form>
				</div>
			</div>
		</main>
	</body>
</html>