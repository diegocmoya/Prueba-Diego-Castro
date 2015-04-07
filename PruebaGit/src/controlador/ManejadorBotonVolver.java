/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GuiReporteLibro;

/**
 *
 * @author Luis
 */

public class ManejadorBotonVolver implements ActionListener{
    GuiReporteLibro guiReporteLibro;

    public ManejadorBotonVolver(GuiReporteLibro guiReporteLibro) {
        this.guiReporteLibro = guiReporteLibro;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
    if(evento.getActionCommand().equalsIgnoreCase("Volver")){
        guiReporteLibro.setVisible(false);
    }
    }
    
}
