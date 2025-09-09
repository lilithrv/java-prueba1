/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;

/**
 *
 * @author Santo Tomas
 */
public class Prueba1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String mensaje = "Este es un mensaje";
        System.out.println(mensaje);
        
        //instancias e invocar
        Usuario user1 = new Usuario("Leslie", "Reyes", (byte)30, false, "Chilena");
        Usuario user2 = new Usuario("Gustavo", "Gallegos", (byte)30, false, "Chilena");
        Usuario user3 = new Usuario("Jonathan", "Fuentealba", (byte)35, true, "Chilena");
        
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
   
        //Alumno alumno1 = new Alumno(2, 3, 1, "mensaje", "mensaje", byte(33), true, "mensaje");
        //Alumno alumno1 = new Alumno(2, 3, 1, "Mateo", "Pizarro", byte(22), true, "chileno");
        //alumno1.saludar();
    }
}
