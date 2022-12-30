<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

<h1>EDITAR LOS INSCRIPTOS</h1>

<form class="row g-3 needs-validation" novalidate
						action="corredores"
						method="post"
						>
						<c:set var="corredor" value="${corredor}"></c:set>
						<input type="hidden" name="opcion" value="editar">
						
						<input type="hidden" name="id" value="${corredor.id}">
						
						
						
						
					  <div class="col-md-4">
					    <label for="validationCustom01" class="form-label">
					    	Nombre:
					    </label>
					    <input type="text"
					    	name="nombre" 
					    	class="form-control" 
					    	id="validationCustom01" 
					    	value="${corredor.nombre}" 
					    	required
					    	>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom02" class="form-label">Apellido:</label>
					    <input type="text"
					    	name="apellido" 
					    	class="form-control" 
					    	id="validationCustom02"
					    	value="${corredor.apellido}" 
					    	required>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom02" class="form-label">Numero de DNI:</label>
					    <input type="text"
					    	name="dni" 
					    	class="form-control" 
					    	id="validationCustom02"
					    	value="${corredor.dni}" 
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
					    <button class="btn btn-success" type="submit" value="inscribirme">ACTUALIZAR</button>
					  </div>
					</form>


</body>
</html>