<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="p1" value="${requestScope['telefono']}" />

	<h1>Busquedas</h1>

	<form action="/Practica2/Buscar?id=2" method="POST">
		<a><input type="text" class="form-control" name="cedula"
			placeholder="Buscar por cedula....."></a> <a><button
				class="input-group-text" name="buscarCed" value="cedulaB"
				type="submit">Buscar</button></a>
	</form>



	<table>
		<thead>
			<tr>
				<th>Email</th>
				<th>Tipo</th>
				<th>Operadora</th>
				<th>Numero</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach var="telf" items="${p1}">
				<tr>

					<td>${telf.correo}</td>
					<td>${telf.tipo}</td>
					<td>${telf.operadora}</td>
					<td>${telf.numero}</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>

</body>
</html>