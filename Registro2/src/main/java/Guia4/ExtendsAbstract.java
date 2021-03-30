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
public class ExtendsAbstract extends AbstractEj1 {
        @Override
        public int ACuadrado(int a){
            return a * a;
        }
        @Override
        public int PCuadrado(int a){
            return 4 * a;
        }
        @Override
        public int ACubo(int a){
            return (a * a) * 6;
        }
        @Override
        public int VCubo(int a){
            return a * a * a;
        }
}