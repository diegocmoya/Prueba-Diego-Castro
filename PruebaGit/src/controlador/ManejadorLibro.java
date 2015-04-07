/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroLibros;
import vista.GUILibro;
import vista.PanelBotonesAccion;
import vista.PanelDatosLibro;

/**
 *
 * @author usuario
 */
public class ManejadorLibro implements ActionListener{

    private PanelDatosLibro panelDatosLibro;
    private RegistroLibros registroLibros;
     GUILibro gUILibro ;
    public ManejadorLibro(RegistroLibros registroLibro,PanelDatosLibro panelDatosLibr, GUILibro gUILibro ) {
        panelDatosLibro=panelDatosLibr;
        registroLibros=registroLibro;
        this.gUILibro=gUILibro;
    }

    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        //To change body of generated methods, choose Tools | Templates.
       
        if(evento.getActionCommand().equalsIgnoreCase(PanelBotonesAccion.BOTON_ACEPTAR)){
         
            if(panelDatosLibro.verificarDatos()==true){
                if(registroLibros.buscarLibro(panelDatosLibro.getISBN())==null){
                    registroLibros.setLibro(panelDatosLibro.getLibro());
                    panelDatosLibro.libroExitosoAgregado();
                    panelDatosLibro.borrarEspacios();
                }else{
                    panelDatosLibro.ErrorLibroExistente();
                    panelDatosLibro.borrarEspacios();
                }
            }
        }
        
        if(evento.getActionCommand().equalsIgnoreCase("Cancelar")){
            gUILibro.setVisible(false);
            panelDatosLibro.borrarEspacios();
        }
        
    }
    
}
