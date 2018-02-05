<%@ page import="java.util.*" %>
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
        	la conexion esta de puta madre
        	<br>
        	${titulo}
        	
        	${libros.libros[0].nombre}
        	
        	
        	
        	<c:forEach var="libros" items="${libros.libros}">
        		<li>${nombre}<li>
        	</c:forEach>
        </ul>

        </p>
    </body>
</html>
