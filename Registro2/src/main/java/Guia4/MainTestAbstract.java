/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

/**
 *
 * @author luife
 */
public class MainTestAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExtendsAbstract TestCC = new ExtendsAbstract();
        System.out.println("El Area es: " + TestCC.ACuadrado(4));
        System.out.println("El Perimetro es: " + TestCC.PCuadrado(6));
        System.out.println("El Area es: " + TestCC.ACubo(8));
        System.out.println("El Volumen es: " + TestCC.VCubo(5));
    }
}
