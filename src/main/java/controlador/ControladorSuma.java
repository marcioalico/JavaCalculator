/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.ModeloCalculadora;
import static modelo.ModeloCalculadora.getInstanciaModeloCalculadora;
import vista.VistaSuma;

/**
 *
 * @author malico
 */
public class ControladorSuma {
    VistaSuma vistaSuma = null;
    public ControladorSuma(VistaSuma vistaSuma) {
       	this.vistaSuma = vistaSuma;
	accionesVistaSuma();
    }
    private void accionesVistaSuma() {
        vistaSuma.botonSumar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumarActionPerformed(evt);
            }
        }); 
        vistaSuma.botonRetornar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        }); 
    }
    private void btSumarActionPerformed(java.awt.event.ActionEvent evt) {
        int primerNumero = Integer.parseInt(vistaSuma.getCampoPrimerNumero());
    	int segundoNumero = Integer.parseInt(vistaSuma.getCampoSegundoNumero());
        ModeloCalculadora calculadora = getInstanciaModeloCalculadora();
	int resultado = calculadora.sumar(primerNumero, segundoNumero);
        vistaSuma.setCampoResultado("" + resultado);
    }
    private void btRetornarActionPerformed(java.awt.event.ActionEvent evt) {
	vistaSuma.dispose();
    }
    
}
