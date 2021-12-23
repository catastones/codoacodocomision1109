/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Alumnos;
import modelo.AlumnosDAO;

/**
 *
 * @author Cristian
 */
@WebServlet(name = "AlumnosControler", urlPatterns = {"/AlumnosControler"})
public class AlumnosControler extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

            AlumnosDAO alum = null;
        try {
            alum = new AlumnosDAO();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            String accion;
            RequestDispatcher dispatcher = null;
            accion = request.getParameter("accion");
            if(accion == null || accion.isEmpty()){
                dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
            
            }else if(accion.equals("modificar")){
                dispatcher = request.getRequestDispatcher("Vistas/modificar.jsp");
            } else if(accion.equals("actualizar")){
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");
              String id = request.getParameter("id");
                    int id_ = Integer.parseInt(id);
            Alumnos alumno = new Alumnos(id_,nombre,apellido,email,telefono);
                try {
                    alum.actualizarAlumno(alumno);
                } catch (SQLException ex) {
                    Logger.getLogger(AlumnosControler.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
        }
             else if(accion.equals("insert")){
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");
            
            Alumnos alumno = new Alumnos(0,nombre,apellido,email,telefono);
                try {
                    alum.insertarAlumno(alumno);
                } catch (SQLException ex) {
                    Logger.getLogger(AlumnosControler.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
        }


                else if(accion.equals("nuevo")){
                dispatcher = request.getRequestDispatcher("Vistas/nuevo.jsp");
            }
                else if(accion.equals("eliminar")){
                    
                   
                    int id_ = Integer.parseInt(request.getParameter("id"));
                try {
                    alum.eliminarAlumno(id_);
                } catch (SQLException ex) {
                    Logger.getLogger(AlumnosControler.class.getName()).log(Level.SEVERE, null, ex);
                }
                 dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
                }
                else if (accion.equals("ingresar")){
                String user = request.getParameter("user");
                String pass = request.getParameter("pass"); 
                
                boolean ingresa = alum.ingresarUsuario(user,pass);
                if (ingresa) {
                    dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
                }else{
                    dispatcher = request.getRequestDispatcher("index.jsp");
                }
           
           
                }
             dispatcher.forward(request,response);

     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
