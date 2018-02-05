<%@ page import="java.util.*" %>
<%@ page import ="modelo.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>RESULTADO DE BUSQUEDA</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
       <h1>RESULTADOS LIBROS</h1>
       <p>Titulo seleccionado: </p>
        <p>
        
        <ul>
        	<br>
        	<%
        	ColLibros busquedaLibros = (ColLibros) request.getAttribute("libros");
        	for ( Libro libro : busquedaLibros.getLibros() ){
        		out.print("<br>"+libro.getTitulo());
        	}
        	 %>
        	
        	<!--   <c:forEach items="${list}" var="libros">
        	<li>$libros.titulo</li>
        	</c:forEach> -->
        	<!--  ${libros.libros[0].titulo}  -->
        	
        	
        	
        	<!--   <c:forEach var="libros" items="${libros.libros}"> 
        		<li>${titulo}<li>
        	</c:forEach> -->
        </ul>

        </p>
    </body>
</html>