package mainGuia7;

import java.util.Locale;
import java.util.Scanner;

public class E2Circunferencia {

    private double radio;
    
//constructor vacio
    public E2Circunferencia() {
    }
//a) constructor con parametro radio

    public E2Circunferencia(double radio) {
        this.radio = radio;
    }
//b) metodo getter

    public double getRadio() {
        return radio;
    }
//b) metodo setter
    public void setRadio(double radio) {
        this.radio = radio;

    }
//c) crear circunferencia
    public void crearCircunferencia(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese radio de la circunferencia: ");
        radio=entrada.nextDouble();  
    }
//d) metodo area
    public double area(){
        return (Math.PI*Math.pow(radio, 2)); 
    }
 //e) metodo area
    public double perimetro(){
        return (2*Math.PI*radio); 
    }
}

/*2. Declarar una clase llamada E2Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase E2Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
