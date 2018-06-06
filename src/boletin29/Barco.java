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

public abstract class Barco {
    
    private String matricula;
    private double eslora;
    private int dias;
    
    public abstract double calculoPrecio();

    public double calculoModulo() {
        return eslora * 10;
    }

    public Barco(String matricula, double eslora, int dias) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.dias = dias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Barco{ " + "matricula: " + matricula + ", eslora: " + eslora + ", dias: " + dias + " }";
    }
    
}
