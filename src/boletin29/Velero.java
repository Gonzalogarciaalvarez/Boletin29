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

public class Velero extends Barco{
    
    private int mastiles;

    @Override
    public double calculoPrecio() {

        return (super.calculoModulo() + mastiles * 2) * super.getDias();
    }

    public Velero(int mastiles, String matricula, double eslora, int dias) {
        super(matricula, eslora, dias);
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{ " + "mastiles: " + mastiles + " }";
    }
}
