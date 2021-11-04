/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_unidad_2;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class BackEnd_Unidad_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código preferido, 
        //sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.
        Scanner Data_in = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        String nombre = Data_in.nextLine();
        System.out.println("Ingrese Apellido");
        String apellido = Data_in.nextLine();
        System.out.println("Ingrese Edad");
        String edad = Data_in.nextLine();
         System.out.println("Ingrese Hobbie");
        String hobbie = Data_in.nextLine();
        System.out.println("Ingrese editor de código preferido");
        String edit_cod = Data_in.nextLine();
        System.out.println("Ingrese sistema operativo que utiliza");
        String so = Data_in.nextLine();
        Ingreso user = new Ingreso(nombre,apellido,edad,hobbie,edit_cod,so);
        System.out.println(user.Print_data());
        
         
        
    }
    
}
