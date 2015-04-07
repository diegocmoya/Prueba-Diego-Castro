/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class RegistroLibros {
    
    private ArrayList <Libro> libros;

    public RegistroLibros() {
    
        libros = new ArrayList<>();
    }
    
    public void setLibro(Libro libro) {
        libros.add(libro);
    }
    
    
   public  String getInformacion(){
     
       String datos="";
       for(Libro libro:libros)
           datos+=libro.toString();
       return datos;
   }
    
   public  Libro buscarLibro(String ISBN){
       for(Libro libro: libros){
           if(ISBN.equalsIgnoreCase(libro.getISBN())){
               return libro;
           }
       }
       return null;
   }
    public int retornarTamano(){
        int numero=0;
        for (Libro libro : libros) {
            numero++;
        }
        return numero;
    }
     public String retornarNombre(int numero){   
        return libros.get(numero).getTitulo() ;
    }
     public String retornarISBN(int numero){
          return libros.get(numero).getISBN();
    }
     public String retornarAutor(int numero){
           return libros.get(numero).getAutor();
    }
     
     
    public String [][] getInfoLibro(){
        String datos [][]= new String[libros.size()][3];
        
        for(int i=0;i<libros.size();i++){
            Libro get= libros.get(i);
            datos[i]=new String[]{get.getTitulo(),get.getISBN(),get.getAutor()};
        }
        return datos;
    }
    
} 

