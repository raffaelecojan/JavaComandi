
<!DOCTYPE html>
<%@page import="org.eclipse.jdt.internal.compiler.ast.Annotation.AnnotationTargetAllowed"%>
<%@page import="controller.PokemonCtrl"%>
<html>
<head>
<meta charset="utf-8">
<title>List pokemon</title>
</head>
<body>
	<h1>lista pokemon</h1>
	<div>
		<a href="index.html">Home page</a>
	</div>
	<ul>
	
		<% PokemonCtrl controller = new PokemonCtrl();%>
		<% for(String nomePokemon : controller.getTipiPokemon()) {%>
		<li>
		<a target="blank" href="http://www.google.com/search?q=pokemon+<%=nomePokemon %>">
		<%= nomePokemon %></li></a>
		<% } %>
		
	</ul>
</body>
</html>