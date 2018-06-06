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

public class Boletin29 {

    private static ArrayList<Barco> listaBarcos = new ArrayList();
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Barco barco1 = new Velero(2, "123", 12.5, 4);
        listaBarcos.add(barco1);
        Barco barco2 = new Deportivas(15.5, "234", 6, 4);
        listaBarcos.add(barco2);

        Factura f = new Factura();

        f.calculo(listaBarcos);
        
    }
    
}
