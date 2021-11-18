<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Menu</title>
		<style>
		.container {
  		font-family: arial;
  		font-size: 24px;
  		margin: auto;
  		width: 50%;
  		height: 200px;
  		padding: 10px;
  		padding-bottom: 200px;
  		border: 2px solid black;
		}
		p {
  		text-align: center;
		}
		h1{
		text-align: center;
		}
		</style>
	</head>
	<body>
		<%
		//Barreira de acesso, validação login
		String sessao=(String)session.getAttribute("usuario");
		if (sessao == null){%>
			ACESSO NEGADO
			<br>
			<a href="autentica.jsp">Realizar Login</a>
		<%}else{ %>
			<div class='container'>
			<%@ include file="header.jsp" %>
			<h1>Menu</h1>
				<p><a href="ServletControlador?resposta=cadastro">Cadastro de Disciplinas e Notas</a></p>
			<br>	
				<p><a href="ServletControlador?resposta=listar">Lista de Disciplinas e Notas</a></p>
			<%} %>
			</div>
	</body>
</html>