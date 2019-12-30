/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.ModeloCalculadora;
import static modelo.ModeloCalculadora.getInstanciaModeloCalculadora;
import vista.VistaResta;

/**
 *
 * @author malico
 */
public class ControladorResta {
    VistaResta vistaResta = null;
    public ControladorResta(VistaResta vistaResta) {
       	this.vistaResta = vistaResta;
	accionesVistaResta();
    }
    private void accionesVistaResta() {
        vistaResta.botonRestar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestarActionPerformed(evt);
            }
        }); 
        vistaResta.botonRetornar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        }); 
    }
    private void btRestarActionPerformed(java.awt.event.ActionEvent evt) {
        int primerNumero = Integer.parseInt(vistaResta.getCampoPrimerNumero());
    	int segundoNumero = Integer.parseInt(vistaResta.getCampoSegundoNumero());
        ModeloCalculadora calculadora = getInstanciaModeloCalculadora();
	int resultado = calculadora.restar(primerNumero, segundoNumero);
        vistaResta.setCampoResultado("" + resultado);
    }
    private void btRetornarActionPerformed(java.awt.event.ActionEvent evt) {
	vistaResta.dispose();
    }
    
}
