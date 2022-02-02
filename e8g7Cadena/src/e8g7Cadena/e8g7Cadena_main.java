package e8g7Cadena;

import java.util.Locale;
import java.util.Scanner;

public class e8g7Cadena_main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena objeto1 = new Cadena();
        String frase;
        System.out.print("Ingrese palabra o frase:\n");
        frase = entrada.next();
        objeto1.setFrase(frase);
        objeto1.setLongitud(frase);
        objeto1.mostrarVocales();
        objeto1.invertirFrase();
        System.out.print("Ingrese letra para ver cuantas veces se repite: ");
        objeto1.vecesRepetido(entrada.next());
        System.out.print("Ingrese frase para concatenar: ");
        objeto1.unirFrases(entrada.next());
        System.out.print("Ingrese letra para reemplazar por las *a*: ");
        objeto1.reemplazar(entrada.next());
        System.out.print("Ingrese letra para ver si contiene: ");
        System.out.println(objeto1.contiene(entrada.next()));

    }

}
