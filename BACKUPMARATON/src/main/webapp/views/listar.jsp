<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<%@page import="com.ar.maraton2022.domain.Corredor"%>
<%@page import="java.util.List"%>
<html lang="es">
	<head>
		<jsp:include page="../styles.jsp"/>
		<link href="bootstrap.min.css" rel="stylesheet">
        <link href="style.css" rel="stylesheet">
	</head>
	
	
	<body>
		<jsp:include page="../navbar.jsp"/>
		<main class="container">
			<h1>LISTADO DE INSCRIPTOS</h1>
			<section>
				<table class="table bg-dark">
				    <tr>
				      <td>#</td>
				      <td>Nombre</td>
				      <td>Apellido</td>
				      <td>DNI</td>
				      <td>Carrera</td>
				      <td>Fecha de Inscripcion</td>
				      <td>Accion</td>
				      
				    </tr>
				    <c:forEach var="corredor" items="${lista}">
				    <tr>
 				     <td> <a href="corredores?opcion=editar&id=<c:out value="${corredor.id}"> </c:out>"> <c:out value="${corredor.id}"> </c:out> </a> </td>
				      <td><c:out value="${corredor.nombre}"></c:out></td>
				      <td><c:out value="${corredor.apellido}"></c:out></td>
				      <td><c:out value="${corredor.dni}"></c:out></td>
				      <td><c:out value="${corredor.carrera}"></c:out></td>
				      <td><c:out value="${corredor.fechaAlta}"></c:out></td>
				      <td> <a href="corredores?opcion=eliminar&id=<c:out value="${corredor.id}"> </c:out>"> Eliminar </a></td>
				      
                    </tr>
				    </c:forEach>

				</table>
			</section>
		</main>

	</body>
	
</html>