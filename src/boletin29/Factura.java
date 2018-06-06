/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */

public class Factura {
    
    public void calculo(ArrayList<Barco> listaBarcos) {

        for (Barco b : listaBarcos) {
            System.out.println("Precio Total: " + b.calculoPrecio() + ", Matricula: " + b.getMatricula() + ", Días: " + b.getDias());
        }
    }

    public void calculo(Barco b) {

        System.out.println("Precio Total: " + b.calculoPrecio() + ", Matricula: " + b.getMatricula() + ", Días: " + b.getDias());
    }
}
