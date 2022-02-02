/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5exMesSecretoPackage;

import java.util.Locale;
import java.util.Scanner;

public class MesSecreto {

    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public MesSecreto() {
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void adivinarMes() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String mesSecreto = this.meses[(int) (Math.random() * 12)];
        //comentada, la forma 1 de resolver        
        //String mesIngresado;
        System.out.println("Adivine el mes secreto:\n");
        //do{
        //System.out.print("Ingrese mes: ");
        //mesIngresado=entrada.next();
        //if(!mesIngresado.equalsIgnoreCase(mesSecreto))
        //  System.out.println("No ha acertado!");
        //}while(!entrada.next().equalsIgnoreCase(mesSecreto));
        System.out.print("Ingrese mes: ");
        while (!entrada.next().equalsIgnoreCase(mesSecreto)) {
            System.out.println("No ha acertado!");
            System.out.print("Ingrese mes: ");
        }
        System.out.println("Acertado!");

    }

}

/*5. Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!*/
