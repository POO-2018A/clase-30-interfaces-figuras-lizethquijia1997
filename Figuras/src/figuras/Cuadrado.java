/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;


public class Cuadrado implements Calculos{
double lado;
    @Override
    public double CalcularArea() {
      return lado*lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularPerimetro() {
       return lado*4;
    }
    
}
