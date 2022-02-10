package ahorcadoPackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ahorcado {

    /* Crear una clase Ahorcado (como el juego), la cual deberá contener
    como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
    la cantidad jugadas máximas que puede realizar el usuario.*/
    private char[] palabraABuscar;
    private int letrasEncontradas;
    private int jugadasMax;
    private char[] palabraIncompleta;// solo para ver la palabra incompleta
    private int dificultad;
    //private String[] muniequito={"    O  ","  __|__","  | | |","  o | o","  __|__","  |   |"," _|   |_"};

    /*Constructores, tanto el vacío como el parametrizado.*/
    public Ahorcado() {
    }

    public Ahorcado(char[] palabraABuscar, int letrasEncontradas, int jugadasMax) {
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    //
    public char[] getVector() {
        return palabraABuscar;
    }

    public void setVector(char[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    //
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    //

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    // 
    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
    el valor que ingresó el usuario y encontradas en 0.*/
    public void crearJuego() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        this.dificultad = 1;
        String palabra;
        do {
            System.out.print("Ingrese palabra (mayor de 3 letras): ");
            palabra = entrada.next();
            if (palabra.length() < 4) {
                System.out.println("Error, ingrese palabra con mas de 3 letras");
            }
        } while (palabra.length() < 4);
        this.palabraABuscar = palabra.toCharArray();
        this.palabraIncompleta = new char[this.palabraABuscar.length];
        Arrays.fill(this.palabraIncompleta, '_');
        System.out.print("Ingrese cantidad de jugadas máxima: ");
        this.jugadasMax = entrada.nextInt();
        
        do {
            System.out.print("Ingrese nivel de dificultad (1-3): ");
            this.dificultad = entrada.nextInt();
            if (this.dificultad < 1 || this.dificultad > 3) {
                System.out.println("Error, ingrese dificultad entre 1 y 3");
            }
        } while (this.dificultad < 1 || this.dificultad > 3);

    }

    /*Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.*/
    public void longitud() {
        System.out.println("La longitud de la palabara a encontrar es " + this.palabraABuscar.length);
    }

    /*Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    public void buscar(String letra) {
        char[] palabra = Arrays.copyOf(this.palabraABuscar, this.palabraABuscar.length);
        Arrays.sort(palabra);
        if (Arrays.binarySearch(palabra, letra.charAt(0)) < 0) {
            System.out.println("NO pertenece a la palabra!");
        } else {
            System.out.println("SI pertenece a la palabra!");
        }
    }

    /*Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public boolean encontradas(String letra) {

        char[] palabra = Arrays.copyOf(this.palabraABuscar, this.palabraABuscar.length);
        Arrays.sort(palabra);
        if (Arrays.binarySearch(palabra, letra.charAt(0)) < 0) {
            this.jugadasMax--;
            return false;
        } else {
            char[] repetidas = Arrays.copyOf(this.palabraIncompleta, this.palabraIncompleta.length);
            Arrays.sort(repetidas);
            if (Arrays.equals(this.palabraIncompleta, this.palabraABuscar)) {
                System.out.println("Felicidades!! ha ganado!!");
                System.out.println("La palabra es: *" + Arrays.toString(this.palabraABuscar) + "*\n");
                return true;
            } 
            return false;
        }
    }

    /*Método intentos(): para mostrar cuantas oportunidades le queda al jugador.*/
    public void intentos() {
        System.out.printf("Le quedan %d oportunidades\n", this.jugadasMax);
    }

    //metodo frase incompleta, lo cree para mostrar la frase incompleta
    public void palabraIncompleta(String letra) {

        for (int i = 0; i < this.palabraABuscar.length; i++) {
            if (this.palabraABuscar[i] == letra.charAt(0)) {
                this.palabraIncompleta[i] = letra.charAt(0);
            }
        }
    }

    /*Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.
  
    Ingrese una letra:
    Longitud de la palabra: 6
    Mensaje: La letra pertenece a la palabra
    Número de letras (encontradas, faltantes): (3,4)
    Número de oportunidades restantes: 4
     */
    public void juego() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String letra;
        boolean encontro;
    
        switch (this.dificultad) {

            case 1:
                this.palabraIncompleta[0] = this.palabraABuscar[0];
                this.palabraIncompleta[this.palabraABuscar.length - 1] = this.palabraABuscar[this.palabraABuscar.length - 1];
                this.palabraIncompleta[this.palabraIncompleta.length / 2] = this.palabraABuscar[this.palabraABuscar.length / 2];
                break;
            case 2:
                this.palabraIncompleta[0] = this.palabraABuscar[0];
                this.palabraIncompleta[this.palabraABuscar.length - 1] = this.palabraABuscar[this.palabraABuscar.length - 1];
                break;
            case 3:
                this.palabraIncompleta[0] = this.palabraABuscar[0];
                break;
        }

        do {

            System.out.println("------------------------------");
            //
            System.out.println(Arrays.toString(this.palabraIncompleta));
            System.out.println("");
            System.out.print("Ingrese una letra: ");
            letra = entrada.next();
            System.out.println("");
            System.out.print("Mensaje: ");
            buscar(letra);
            System.out.println("");

            palabraIncompleta(letra);
            encontro = encontradas(letra);
            int encontradas=0;
            for (int i = 0; i < this.palabraABuscar.length; i++) {
                if(this.palabraABuscar[i]==this.palabraIncompleta[i])
                    encontradas++;
            }
            System.out.printf("Letras (encontradas, faltantes): (%d,%d)\n", encontradas, this.palabraABuscar.length - encontradas);
            
            if (this.jugadasMax == 0) {
                System.out.println("No posee más intentos, mejor suerte la próxima!");
            } else {
                System.out.println("Intentos restantes: " + this.jugadasMax);
            }
            System.out.println("------------------------------");
        } while (!encontro && this.jugadasMax != 0);
    }
}

/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Ejemplo vector como atributo: VectorAtributo
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4*/
