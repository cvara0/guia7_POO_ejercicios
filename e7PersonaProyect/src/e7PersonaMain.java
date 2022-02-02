
import java.util.Locale;
import java.util.Scanner;


public class e7PersonaMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese cantidad de personas a evaluar: ");
        
        Persona[] objeto = new Persona[entrada.nextInt()];

        double debajo = 0;
        double ideal = 0;
        double sobre = 0;
        double mayores = 0;
        double menores = 0;
        System.out.printf("Ingrese datos de %d personas:\n", objeto.length);
        for (int i = 0; i < objeto.length; i++) {
            System.out.printf("\nPersona [%d]: \n", i + 1);
            objeto[i] = new Persona();
            objeto[i].crearPersona();

            System.out.printf("IMC[%d]: %d\n", i + 1, objeto[i].calcularIMC());

            switch (objeto[i].calcularIMC()) {
                case -1:
                    debajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    sobre++;
                    break;
            }
            if (objeto[i].esMayorDeEdad()) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("");
        System.out.println("Porcentaje de excedidos: " + ((sobre / objeto.length) * 100)+"%");
        System.out.println("Porcentaje de ideales: " + ((ideal / objeto.length) * 100)+"%");
        System.out.println("Porcentaje de debajo: " + ((debajo / objeto.length) * 100)+"%");
        System.out.println("");
        System.out.println("Porcentaje de mayores: " + ((mayores / objeto.length) * 100)+"%");
        System.out.println("Porcentaje de menores: " + ((menores / objeto.length) * 100)+"%");
        System.out.println("");
    }

}
