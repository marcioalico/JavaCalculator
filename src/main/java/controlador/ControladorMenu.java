/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaMenu;
import vista.VistaResta;
import vista.VistaSuma;

/**
 *
 * @author malico
 */
public class ControladorMenu {
    private VistaMenu vistaMenu = null;
    
    public ControladorMenu(VistaMenu vistaMenu) {
       	this.vistaMenu = vistaMenu;
	accionesVistaMenu();
    }
    private void accionesVistaMenu() {
        vistaMenu.elementoSumar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSumarActionPerformed(evt);
            }
        });  
        vistaMenu.elementoRestar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emRestarActionPerformed(evt);
            }
        });  
        vistaMenu.elementoSalir.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSalirActionPerformed(evt);
            }
        });  
    }
        
    private void emSumarActionPerformed (java.awt.event.ActionEvent evt) {
        VistaSuma vistaSuma = new VistaSuma(null, true);
        ControladorSuma controladorSuma = new ControladorSuma(vistaSuma);
        vistaSuma.setVisible(true);
    }
    private void emRestarActionPerformed (java.awt.event.ActionEvent evt) {
        VistaResta vistaResta = new VistaResta(null, true);
	ControladorResta controladorResta = new ControladorResta(vistaResta);
        vistaResta.setVisible(true);
    }
    private void emSalirActionPerformed(java.awt.event.ActionEvent evt) {
	System.exit(0);
    }
}
