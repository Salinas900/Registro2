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
public class InterfaceMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassTestInter TestInter = new ClassTestInter();
        System.out.println("La suma es: " + TestInter.suma(50, 100));
        System.out.println("La resta es: " + TestInter.resta(50, 10));
        System.out.println("La division es: " + TestInter.division(100,10));
        System.out.println("La multiplicacion es: " + TestInter.multiplicacion(10, 5));
    }
    
}
