/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Libro;
import modelo.RegistroLibros;

/**
 *
 * @author usuario
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */ 
    
        //GuiEstudiante guiEstudiante = new GuiEstudiante();
        
    public static void main(String[] args) {
        
        Libro libro = new Libro("12", "Java", "Deitel");
        Libro libro1 = new Libro("132", "Don Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("20", "Ruby", "Rudo");
        
        RegistroLibros registroLibros = new RegistroLibros();
        
        registroLibros.setLibro(libro);
        registroLibros.setLibro(libro1);
        registroLibros.setLibro(libro2);
        
        //System.out.println(libro.toString()+"\n\n"+ libro1.toString()+"\n\n"+ libro2.toString());
       
        //System.out.println(registroLibros.buscarLibro("12"));
                // TODO code application logic here
        
       //GUILibro gUILibro = new GUILibro();  
         new GuiEstudiante().setVisible(true);
         new GUILibro();
    }
    
}
