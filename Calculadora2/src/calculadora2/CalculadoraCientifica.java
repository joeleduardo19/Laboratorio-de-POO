/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora2;

/**
 *
 * @author Dell
 */
public class CalculadoraCientifica extends DisOperacionesBasicas implements IDisOperacionesAvanzadas {

    @Override
    public double raiz(double b) {
        return Math.sqrt(b); 
    }

    @Override
    public double cuadrado(double a) {
        return a * a;
    }   
}
