<%-- 
    Document   : presentacion
    Created on : 4/07/2014, 08:23:56 PM
    Author     : T107
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado de Calificaciones</h1>
        
         <form action="presentacion.jsp" method="get">
             <output type="request" value="Obtener Registros">
          <%=Evaluacion.getnombre()%>
          <%=Evaluacion.getcalificacion()%>
        </form>
</html>
    </body>
</html>
