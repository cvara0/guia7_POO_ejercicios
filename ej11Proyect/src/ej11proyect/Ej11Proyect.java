
package ej11proyect;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Ej11Proyect {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        System.out.print("Ingrese día: ");
        byte dia=entrada.nextByte();
        System.out.print("Ingrese mes: ");
        byte mes=entrada.nextByte();
        System.out.print("Ingrese año: ");
        int anio=entrada.nextInt();
        
        //recordar que para Date los milisegundos empiezan el 1 de enero de 1970 a las 00:00 hs
        //recordar que para Date los meses van de 0 a 11
        //recordar que para Date los años de se cuentan desde 1900
        
        Date fechaIngresada = new Date(anio-1900, mes-1, dia);
        
        System.out.println("La fecha es: "+fechaIngresada.toString());
        System.out.println("El año es: "+(fechaIngresada.getYear()+1900));
        System.out.println("El mes es: "+(fechaIngresada.getMonth()+1));
        System.out.println("El día es: "+fechaIngresada.getDate());
        
        //guardo la fecha ingresada en una variable de tipo string
        String fechaIngresadaString=fechaIngresada.getDate()+"/"+(fechaIngresada.getMonth()+1)+"/"+(fechaIngresada.getYear()+1900);
        
        Date fechaActual = new Date();
        System.out.println("El año actual es: "+(fechaActual.getYear()+1900));
        System.out.println("El mes actual es: "+(fechaActual.getMonth()+1));
        System.out.println("El día actual es: "+fechaActual.getDate());
        
        //guardo la fecha actual en una variable de tipo string
        String fechaActualString=fechaActual.getDate()+"/"+(fechaActual.getMonth()+1)+"/"+(fechaActual.getYear()+1900);
        
        //hallo el valor absoluto de la diferencia de milisegundos entre la fecha actual y la ingresada,
        //luego convierto de milisegundos a años dividiendo por 3.154E+10, por ultimo extraigo la parte 
        // entera casteando con (int)
        int diferenciaDeFechas=(int)(Math.abs(fechaActual.getTime()-fechaIngresada.getTime())/3.154E+10);
        
        System.out.printf("\nDiferencia de años entre %s y %s: %d \n",fechaActualString,fechaIngresadaString,diferenciaDeFechas );
    }
    
}

/*11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle*/