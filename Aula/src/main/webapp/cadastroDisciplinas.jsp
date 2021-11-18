<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript" src="script.js"></script>
		<title>Cadastro Disciplina</title>
		<style>
		.container {
  		font-family: arial;
  		font-size: 24px;
  		margin: auto;
  		width: 50%;
  		height: 200px;
  		padding: 10px;
  		padding-bottom: 550px;
  		border: 2px solid black;
		}
		p {
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
			<br><br>
			<form action="ServletControlador" method="post">
			<input type="hidden" name="resposta" value="addDisciplina">
			<p><label for="nome">Disciplina: </label><p>
			<p><input type="text" name="nome" id="nome"></p>
			<br>
			<p><label for="nota">Nota: </label></p>
			<p><input type="text" onkeyup="verificaNumero(this.value)" name="nota" id="nota"></p>
			<br><br>
			<p><input type="submit" value="Cadastrar"></p>
			</form>
			<br>
			<p><a href="menu.jsp">Retorno.</a></p>
			<br><br>
			<%} %>
			</div>
	</body>
</html>