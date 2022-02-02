package mainGuia7;

import java.util.Locale;
import java.util.Scanner;

public class E3Operacion {

    private double nro1;
    private double nro2;

    //a) Método constructor con todos los atributos pasados por parámetro.
    public E3Operacion(double nro1, double nro2) {

        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    //b) Metodo constructor sin los atributos pasados por parámetro.
    public E3Operacion() {
    }

    //
    public double getNro1() {
        return nro1;
    }

    public double getNro2() {
        return nro2;
    }

    //
    public void setNro1(double nro1) {
        this.nro1 = nro1;
    }

    public void setNro2(double nro2) {
        this.nro2 = nro2;
    }

    //
    public void crearOperacion() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese 1er número: ");
        nro1 = entrada.nextDouble();
        System.out.print("Ingrese 2do número: ");
        nro2 = entrada.nextDouble();
        System.out.println("Numeros guardados");
    }
    
    //
    public double sumar() {
        return nro1 + nro2;
    }

    //
    public double restar() {
        return nro1 - nro2;
    }

    //
    public double multiplicar() {
        if (nro1 == 0 || nro2 == 0) {
            System.out.println("Error, multiplicación por cero");
            return 0;
        } else {
            return nro1 * nro2;
        }
    }

    //
    public double dividir() {
        if (nro2 == 0) {
            System.out.println("Error, división por cero");
            return 0;
        } else {
            return nro1 / nro2;
        }
    }
    //

}

/*3. Crear una clase llamada E3Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
17
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.*/
