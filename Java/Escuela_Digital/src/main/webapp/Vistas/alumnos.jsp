<%-- 
    Document   : alumnos
    Created on : 23 nov. 2021, 10:57:10
    Author     : Cristian
--%>

<%@page import="modelo.AlumnosDAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Alumnos</title>
    </head>
    <body>
        <h1 class="text-center">Listado de Alumnos</h1>
        <div class="container">
            <div class="row">
                <a class="btn btn-primary col-md-4 m-4" href="AlumnosControler?accion=nuevo" > Agregar Alumno</a>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Nombres</th>
                            <th scope="col">Apellidos</th>
                            <th scope="col">Email</th>
                            <th scope="col">Telefono</th>
                            <th scope="col">Modificar</th>
                            <th scope="col">Eliminar</th>
                        </tr>
                    </thead>

                    <tbody>
                        <%
                            List<Alumnos> resultado = null;
                            AlumnosDAO alumno = new AlumnosDAO();
                            resultado = alumno.listarAlumnos();
                            for(int i= 0;i<resultado.size();i++){
                            String ruta = "AlumnosControler?accion=modificar&id="+resultado.get(i).getId();
                            String rutaE = "AlumnosControler?accion=eliminar&id="+resultado.get(i).getId();
                            
                           
                            
                           %> 
                           <tr>
                               <td><%=resultado.get(i).getId()%></td>
                               <td><%=resultado.get(i).getNombres()%></td><!-- comment -->
                               <td><%=resultado.get(i).getApellidos()%></td>
                               <td><%=resultado.get(i).getEmail()%></td>
                               <td><%=resultado.get(i).getTelefono()%></td><!-- comment -->
                               <td><a class="btn btn-success" href="<%=ruta%>" >Mod</a></td>
                                <td><a class="btn btn-danger" href="<%=rutaE%>" >x</a></td>
                               </tr>
                           
                           <%  
                            }
                    
                        %>

                    </tbody>
                </table>
            </div>

        </div>
    </body>
</html>
