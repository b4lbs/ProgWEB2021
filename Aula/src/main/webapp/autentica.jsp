<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript" src="script.js"></script>
		<title>Login de Sistema</title>
		<style>
		.container {
  		font-family: arial;
  		font-size: 24px;
  		margin: auto;
  		width: 50%;
  		height: 200px;
  		padding: 10px;
  		padding-bottom: 100px;
  		border: 2px solid black;
		}
		p {
  		text-align: center;
		}
		</style>
	</head>
	<body>
		<div class='container'>
		<form action="ServletAutentica" method="post">
			<p><label>Usuário:</label></p>
			<p><input type="text" onkeyup="verificaLetra(this.value)" name="usuario"></p>
			<p><label>Senha:</label></p>
			<p><input type="password" name="senha"></p>
			<p><input type="submit" value="Enviar"></p>
		</form>
		</div>
	</body>
</html>