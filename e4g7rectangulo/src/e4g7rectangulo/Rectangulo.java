package e4g7rectangulo;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    //
    private double altura;
    private double base;

    //
    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    //
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    //
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //
    public void crearRectangulo() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese base: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese altura: ");
        altura = entrada.nextDouble();
    }
//
    public double calcularSuperficie() {

        if (base > 0 && altura > 0) {
            return base * altura;
        } else {
            return 0;
        }
    }
//
    public double calcularPerimetro() {
        if (base > 0 && altura > 0) {
            return 2 *( base + altura);
        } else {
            return 0;
        }
    }
//
    public void dibujar() {
        System.out.println("Dibujando rectangulo:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}

/*4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
