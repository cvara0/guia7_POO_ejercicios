
package e11DatePackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class DateMain {

    
    public static void main(String[] args) {
        
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        SimpleDateFormat anioFormato=new SimpleDateFormat("yyyy");
        SimpleDateFormat fechaFormato=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat diaFormato=new SimpleDateFormat("dd");
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        /*System.out.print("Ingrese dia (1 a 31):");
        int dia=entrada.nextInt();
        System.out.print("Ingrese mes (1 a 12):");
        int mes=entrada.nextInt()-1;
        System.out.print("Ingrese año (1 a 12):");
        int anio=entrada.nextInt()-1900;
        Date fechaIngresada=new Date(anio,mes,dia);*/
    
        Date fechaActual=new Date();
        
        //int diferenciaAnio=Math.abs(Integer.parseInt(anioFormato.format(fechaIngresada))-Integer.parseInt(anioFormato.format(fechaActual)));
        //int diferenciaDia=Math.abs(Integer.parseInt(diaFormato.format(fechaIngresada))-Integer.parseInt(diaFormato.format(fechaActual)));
        //System.out.println("Fecha ingresada es: "+fechaIngresada);
        //System.out.println("Fecha ingresada formateada: "+fechaFormato.format(fechaIngresada));
        System.out.println("Fecha actual es: "+fechaActual);
        System.out.println("Fecha actual formateada1: "+fechaFormato.format(fechaActual));
        //System.out.println("Diferencia de años entre fecha ingresada y la actual: "+diferenciaAnio);
        System.out.println("");
        System.out.println("Año actual es: "+(fechaActual.getYear()+1900));
        System.out.println("Fecha actual formateada2: "+fechaActual.getDate()+" - "+(fechaActual.getMonth()+1)+" - "+(fechaActual.getYear()+1900));
        System.out.println("Hora actual: "+fechaActual.getHours()+" : "+fechaActual.getMinutes()+" : "+fechaActual.getSeconds());
        System.out.println("Milisegundos a partir del 1/1/70: "+fechaActual.getTime());
        System.out.println("Segundos a partir del 1/1/70: "+(fechaActual.getTime()/1000));
        System.out.println("Minutos a partir del 1/1/70: "+(fechaActual.getTime()/(60*1000)));
        System.out.println("Horas a partir del 1/1/70: "+(fechaActual.getTime()/(60*60*1000)));
        System.out.println("Dias a partir del 1/1/70: "+(fechaActual.getTime()/(24*60*60*1000)));
        System.out.println("Años a partir del 1/1/70: "+(fechaActual.getTime()/(365*24*60*60*1000)));
        
    }
    
}
/*Parameters:
year - the year minus 1900.
month - the month between 0-11.
date - the day of the month between 1-31.
hrs - the hours between 0-23.
min - the minutes between 0-59.
sec - the seconds between 0-59.*/

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