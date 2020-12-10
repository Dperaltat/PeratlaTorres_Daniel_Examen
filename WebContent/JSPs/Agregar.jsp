<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar número</title>
</head>
<body>

	<c:set var="p1" value="${ requestScope['usuario'] }" />
	<c:set var="p2" value="${ requestScope['idc'] }" />
	
	<form action="/PeraltaTorres_Daniel_Examen/AgregarNumero?ced=${p2 }"
		method="POST">

		<h1>Agregar telefono:</h1>

		<label for="numero" class="mb-2 mr-sm-2">Numero: </label> <input
			type="number" name="numero" placeholder="numero" maxlength="10">

		<label for="operadora">Operadora: </label> <input type="text"
			name="operadora" placeholder="operadora"> <label for="tipo">Tipo:</label>
		<input type="text" name="tipo" placeholder="tipo">

		<button type="submit" name="agregar" value="ingresar"
			class="btn btn-primary mb-2">ingresar</button>
	</form>
</body>
</html>