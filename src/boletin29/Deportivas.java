/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin29;

/**
 *
 * @author Gonzalo
 */

public class Deportivas extends Barco {
    
    private double cv;

    @Override
    public double calculoPrecio() {
        return (super.calculoModulo() + cv * 3) * super.getDias();
    }

    public Deportivas(double cv, String matricula, double eslora, int dias) {
        super(matricula, eslora, dias);
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Deportivas{ " + "cv:" + cv + " }";
    }
}
