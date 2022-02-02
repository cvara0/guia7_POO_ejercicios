package e12PersonaPackage;

public class E12PersonaMain {

    public static void main(String[] args) {
        Persona objeto = new Persona();
        objeto.crearPersona();
        objeto.calcularEdad();
        System.out.println("Menor de 29: " + objeto.menorQue(18));
        System.out.println("");
        objeto.mostrarPersona();

    }

}
