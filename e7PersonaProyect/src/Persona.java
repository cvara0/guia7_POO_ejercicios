
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    //
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    //
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    //

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //

    public void crearPersona() {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese nombre: ");
        this.nombre = entrada.next();
        System.out.print("Ingrese edad: ");
        this.edad = entrada.nextInt();
        do {
            System.out.print("Sexo: ");
            this.sexo = entrada.next().toUpperCase().charAt(0);
            if (this.sexo != 'H' && this.sexo != 'M' && this.sexo != 'O') {
                System.out.println("Error, ingrese solo h,m,o ");
            }
        } while (this.sexo != 'H' && this.sexo != 'M' && this.sexo != 'O');
        System.out.print("Ingrese peso: ");
        this.peso = entrada.nextInt();
        System.out.print("Ingrese altura: ");
        this.altura = entrada.nextDouble();

    }

    //
    public int calcularIMC() {
         

        double imc = this.peso / (Math.pow(this.altura, 2));

        if (imc < 20) {
            return -1;
        }
        if (imc > 25) {
            return 1;
        }
        return 0;
    }

    //
    public boolean esMayorDeEdad() {
        return this.edad >= 18;

    }

}
