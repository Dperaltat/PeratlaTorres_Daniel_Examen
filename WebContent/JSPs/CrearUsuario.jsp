<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Usuario</title>
</head>
<body>
	<form action="/PeraltaTorres_Daniel_Examen/CrearUsuario" method="POST">

		<h1>Crear Usuario</h1>
		<br> 
		<input type="text" placeholder="Nombre" name="nombre" required>
		<br> 
		<input type="text" placeholder="Apellido" name="apellido" required>
		<br> 
		<input type="text" placeholder="Cedula" name="cdi" required>
		<br> 
		<input type="text" placeholder="E-mail" name="email" required>
		<br>
		<input type="password" placeholder="Password" name="password" required>
		<br>
		<button type="submit" name="resp" value="Registrarse">Registrarse</button>
	</form>
</body>
</html>