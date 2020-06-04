<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tic Tac Toe</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<style type="text/css">
body{
	background-color: orange;
	color: white;
}
table.table-board tr td {
	height: 6rem;
	width: 6rem;
	font-size: 6rem;
	text-align: center;
}

table.table-board tr td a {
	text-decoration: none;
}
</style>
</head>
<body>
<div class="container">
	<h1 class="display-1 text-center">Tic-Tac-Toe</h1>

	<c:if test="${ game.gamestate == 0}">
		<h3 class="text-center">O has won!</h3>
		<div class="text-center">
			<a class="btn btn-warning btn-center" href="NewGameController">New Game</a>
		</div><br>
	</c:if>
	<c:if test="${ game.gamestate == 1}">
		<h3 class="text-center">X has won!</h3>
		<div class="text-center">
			<a class="btn btn-warning btn-center" href="NewGameController">New Game</a>
		</div><br>
	</c:if>
	<c:if test="${ game.gamestate == 2}">
		<h3 class="text-center">it's  a draw!</h3>
		<div class="text-center">
			<a class="btn btn-warning btn-center" href="NewGameController">New Game</a>
		</div><br>
	</c:if>
	<c:if test="${ game.gamestate == 3}">
			<h3 class="text-center">Player ${game.current_player}'s Turn.</h3>
	</c:if>


	
	<div class="row">
	<div class="col-sm-6 offset-sm-3">
		<table class="table table-bordered table-board">
		
			<tr>
				<c:set var="count" value="0" scope="page"/>
				<c:forEach begin="0" end="2" step="1"  var="i">
				<tr>
					<c:forEach begin="0" end="2" step="1"  var="i">
						<td>
							<c:set var="count" value="${count + 1}" scope="page"/>
							<c:if test="${ game.board[count - 1] == 1 }">
								<c:set var="mark" value="X" scope="page"/>	
							</c:if>
							<c:if test="${ game.board[count - 1] == 0 }">
								<c:set var="mark" value="O" scope="page"/>	
							</c:if>
							<c:if test="${ game.board[count - 1] == -1 }">
								<c:set var="mark" value="□" scope="page"/>	
							</c:if>							
							<a class="text-success" href="PlayController?location=${count - 1}">${mark}</a>
						</td>
					</c:forEach>
				</tr>
				</c:forEach>
			</tr>	
			
		</table>
	</div>
		
</div>

</div>
</body>
</html>