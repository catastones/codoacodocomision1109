<%-- 
    Document   : modificar
    Created on : 23 nov. 2021, 10:57:26
    Author     : Cristian
--%>
<%@page import="modelo.AlumnosDAO"%>
<%@page import="modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Modificar Alumnos</title>
    </head>
    <body>
        <%-- 
    Document   : modificar
    Created on : 23 nov. 2021, 10:57:26
    Author     : Cristian
--%>
      <%
            String id = request.getParameter("id");
            int mid;
            mid = Integer.parseInt(id);
            Alumnos resultado=null;
            AlumnosDAO alumnosDao = new AlumnosDAO();
            resultado = alumnosDao.mostrarAlumno(mid);
        %>
        <h1 class="text-center">Modificar Alumnos</h1>
            <div class="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosControler?accion=actualizar" method="POST">
                     <div class="mb-3">
                       
                        <input type="hidden" class="form-control" id="id" name="id"  value="<%=resultado.getId()%>">
                        
                    </div>
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre</label>
                        <input type="text" class="form-control" id="nombre" name="nombre" value="<%=resultado.getNombres()%>">
                        
                    </div>
                    <div class="mb-3">
                        <label for="apellido" class="form-label">Apellido</label>
                        <input type="text" class="form-control" id="apellido" name="apellido" value="<%=resultado.getApellidos()%>" >
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="email" value="<%=resultado.getEmail()%>">
                    </div>
                    <div class="mb-3">
                        <label for="telefono" class="form-label">Telefono</label>
                        <input type="text" class="form-control" id="telefono" name="telefono" value="<%=resultado.getTelefono()%>" >
                        
                    </div>
                    <button type="submit" class="btn btn-success"> Modificar </button>
                </form>
                
            </div>
        </div>
    </body>
</html>
