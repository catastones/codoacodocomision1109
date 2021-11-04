/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_unidad_2;

/**
 *
 * @author Cristian
 */
public class Ingreso {
    public String nombre,apellido,edad,hobbie,edit_cod,so;

    public Ingreso(String nombre, String apellido, String edad, String hobbie, String edit_cod, String so) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.edit_cod = edit_cod;
        this.so = so;
    }
    
    public String Print_data(){
        return 
                "Mi nombre es " + this.nombre + "\n"+
                "Mi apellido es "+ this.apellido+ "\n"+
                "Mi edad es "+ this.edad+ "\n"+
                "Mi Hobbie es "+this.hobbie+ "\n"+
                "Mi editor de código preferido "+this.edit_cod+"\n"+
                "utilizo el sistema operativo "+this.so;
    }
}
