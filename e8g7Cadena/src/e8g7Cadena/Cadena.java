package e8g7Cadena;

public class Cadena {

    private String frase;
    private int longitud;

    //
    public Cadena() {

    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    //

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(String frase) {
        longitud = frase.length();
    }

    /* Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    frase ingresada.*/
    public void mostrarVocales() {
        int vocales = 0;
        
        for (int i = 0; i < this.frase.length(); i++) {
            if (this.frase.substring(i, i + 1).matches(".*[aeiouAEIOU].*")) {
                vocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + vocales);
    }

    /* Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase() {
        String invertida = "";
        for (int i = -1; i < longitud-1; i++) {
            invertida += frase.substring(longitud -2- i,longitud - 1 - i);
        }
        System.out.println("Frase invertida: " + invertida);
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
    y contabilizar cuántas veces se repite el carácter en la frase*/
    public void vecesRepetido(String letra) {
        int repetido = 0;
            for (int i = 0; i < longitud; i++) {
                if (letra.substring(0,1).equalsIgnoreCase(frase.substring(i,i+1))) {
                    repetido++;
                }
            }
        
        System.out.printf("La letra %s se repite %d veces\n", letra, repetido);
    }

    /* Método compararLongitud(String frase), deberá comparar la longitud de la frase
    que compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(String frase) {

        System.out.printf("\nLa Diferencia de longitudes entre %s y %s : %d ", frase, this.frase, Math.abs(frase.length() - this.frase.length()));
    }
    
    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(String frase){
    //this.frase=this.frase.concat(" "+frase);
    this.frase=this.frase+" "+frase;
        System.out.println("La frase ahora es:\n"+this.frase);
    }
    
    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    mostrar la frase resultante.*/
    
    public void reemplazar(String letra) {

        this.frase = this.frase.replace("a", letra.substring(0,1));

        System.out.printf("La frase ahora es: %s\n", frase);

    }
    
   /* Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no*/
    
    public boolean contiene(String letra) {

        return this.frase.contains(letra.substring(0, 1));
    }

}
/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. 

En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no*/
