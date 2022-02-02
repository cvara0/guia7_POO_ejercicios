/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9MatematicaPackage;

/**
 *
 * @author cvara
 */
public class E9MatematicaMain {

    //Math.random()*(-10)+20
    public static void main(String[] args) {
        Matematica objeto=new Matematica();
        objeto.setNro1(2);
        objeto.setNro2(3);
        System.out.println("nro1: "+objeto.getNro1());
        System.out.println("nro2: "+objeto.getNro2());
        System.out.println("El mayor: "+objeto.devolverMayor());
        System.out.println("Mayor elevado al menor: "+objeto.calcularPotencia());
        System.out.printf("Raiz cuadrada del menor: %.2f\n",objeto.calculaRaiz());
        
    }
    
}
