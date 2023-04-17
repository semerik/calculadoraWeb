<%-- 
    Document   : calcjsp
    Created on : 17/04/2023, 01:19:35 PM
    Author     : inged
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>Calculadora</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			text-align: center;
		}

		h1 {
			margin-top: 40px;
			font-size: 36px;
		}

		form {
			margin-top: 50px;
			display: inline-block;
			text-align: left;
			background-color: #FFFFFF;
			padding: 20px;
			border-radius: 10px;
			box-shadow: 0px 0px 20px #CCCCCC;
		}

		label {
			display: block;
			margin-bottom: 10px;
			font-size: 24px;
		}

		input[type="number"] {
			padding: 10px;
			border-radius: 5px;
			border: 1px solid #CCCCCC;
			margin-bottom: 20px;
			font-size: 18px;
		}

		input[type="submit"] {
			background-color: #333333;
			color: #FFFFFF;
			border: none;
			padding: 10px 20px;
			border-radius: 5px;
			font-size: 24px;
			cursor: pointer;
		}

		input[type="submit"]:hover {
			background-color: #555555;
		}
	</style>
</head>
<body>
	<h1>Calculadora</h1>
	<form  action="calcservlet" method="post">
		<label for="t1">Número 1:</label>
		<input type="number" name="t1" id="t1">

		<label for="t2">Número 2:</label>
		<input type="number" name="t2" id="t2">
                <br>
		<input type="submit" name="suma" value="+">
		<input type="submit" name="resta" value="-">
		<input type="submit" name="multiplicacion" value="*">
		<input type="submit" name="division" value="/">
		<input type="submit" name="modulo" value="%">
		<input type="submit" name="cuadrado" value="x²">
	</form>
       
</body>
</html>

