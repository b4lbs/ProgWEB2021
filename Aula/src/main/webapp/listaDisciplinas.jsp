<%@page import="java.util.List"%>
<%@page import="trab_final.Disciplina"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Listar Disciplinas</title>
		<style>
		.container {
  		font-family: arial;
  		font-size: 24px;
  		margin: auto;
  		width: 50%;
  		height: 200px;
  		padding: 10px;
  		padding-bottom: 300px;
  		border: 2px solid black;
		}
		p {
  		text-align: center;
		}
		.center {
  		margin-left: auto;
  		margin-right: auto;
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
	s
		<%}else{ %>
			<div class='container'>
			<%@ include file="header.jsp" %>
			<br><br>
			<table class='center' border='1px'>
				<tr>
					<td>Nome</td>
					<td>Nota</td> 
					<td>Resultado</td>
				</tr>
			<%
			List<Disciplina> lista = (List<Disciplina>) request.getAttribute("lista");
			for(Disciplina disciplina : lista){
			%>
			<tr>
				<td><%= disciplina.getNome() %></td>
				<td><%= disciplina.getNota() %></td>
				<td><%= disciplina.getSituacao() %></td>
			</tr>
			<%
				}
			%>

			</table>
			<br>
			<p><a href="menu.jsp">Menu.</a></p><br>
			<p><a href="ServletControlador?resposta=cadastro">Novo Cadastro.</a></p>
			<%} %>
			</div>
	</body>
</html>