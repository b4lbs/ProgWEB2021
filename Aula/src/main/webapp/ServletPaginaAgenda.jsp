<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ServletPaginaAgenda</title>
</head>
<body>
	<h3>Digite seu Nome, Telefone, Data de Nascimento e envie.</h3>
	<form action="ServletAgenda">
		<input type='text'name='nome'/>
		<input type='text'name='datanasc'/>
		<input type='text'name='tel'/>
		<input type='submit' value='Enviar'>	
		</form>
</body>
</html>