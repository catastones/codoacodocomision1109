<%-- 
    Document   : index
    Created on : 7 dic. 2021, 11:12:13
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
         <h1 class="m-5">Escuela digital</h1>
        <div class="container">
            <div class="row d-flex justify-content-center">
               
                <form class="p-5 w-50"
                      action="AlumnosControler?accion=ingresar" method="POST">
                           <div class="mb-3">
                        <label for="user" class="form-label">Usuario</label>
                        <input type="text" class="form-control" id="user" name="user" placeholder="Usuario">
                        
                    </div>
                    
                       <div class="mb-3">
                        <label for="pass" class="form-label">Clave</label>
                        <input type="password" class="form-control" id="pass" name="pass" placeholder="Clave">
                        
                    </div>
                    <button type="submit" class="btn btn-primary"> Ingresar </button>
                </form>
                
                
            </div>
            
        </div>
    </body>
</html>
