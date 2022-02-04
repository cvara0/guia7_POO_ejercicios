package e12PersonaPackage;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    /*Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set.*/
    private String nombre;
    private Date fechaNacimiento;

    //
    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaDeNacimiento;
    }
    // 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //
    public Date getFechaDeNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaNacimiento = fechaDeNacimiento;
    }

    //
    /*Agregar un método de creación del objeto que respete la siguiente firma:
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
    al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
    que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public void crearPersona() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int dia, mes, anio;
        Date fechaActual=new Date();
        System.out.print("¿Cuál es su nombre?: ");
        this.nombre = entrada.next();
        System.out.println("¿Cuál es su fecha de nacimiento?: ");
        do {
            System.out.print("Día: ");
            dia = entrada.nextInt();
            if (dia < 1 || dia > 31) {
                System.out.println("Error, ingrese día válido");
            }
        } while (dia < 1 || dia > 31);
        
        do {
            System.out.print("Mes: ");
            mes = entrada.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Error, ingrese mes válido");
            }
        } while (mes < 1 || mes > 12);
        
        do {
            System.out.print("Año: ");
            anio = entrada.nextInt();
            if (anio < (fechaActual.getYear()+1900-120) || anio > (fechaActual.getYear()+1900-18)) {
                System.out.printf("Error, ingrese año válido (entre %d y %d)\n",(fechaActual.getYear()+1900-120),(fechaActual.getYear()+1900-18));
            }
        } while (anio < (fechaActual.getYear()+1900-120) || anio > (fechaActual.getYear()+1900-18));
  
        this.fechaNacimiento = new Date(anio, mes-1, dia);
        System.out.println("Datos guardados");
        System.out.println(fechaNacimiento.getDate()+"/"+(fechaNacimiento.getMonth()+1)+"/"+fechaNacimiento.getYear());

    }
    
    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
    Tener en cuenta que para conocer la edad de la persona también se debe
    conocer la fecha actual.*/
    
    public void calcularEdad(){
    Date fechaActual=new Date();
     
    int edad=(int)(((fechaActual.getTime()-this.fechaNacimiento.getTime())/3.154E+10)+1900+1);
        System.out.println("Su edad es: "+edad);
    }
    
    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro
    otra edad y retorna true en caso de que el receptor tenga menor edad que la
    persona que se recibe como parámetro, o false en caso contrario.*/
    
    public boolean menorQue(int edad){
        Date fechaActual=new Date();
        return edad>(int)(((fechaActual.getTime()-this.fechaNacimiento.getTime())/3.154E+10)+1900+1);
    }
    
    /*Metodo mostrarPersona(): este método muestra la persona creada en el método
    anterior.*/
    
    public void mostrarPersona(){
        Date fechaActual=new Date();
        System.out.println("Nombre: "+this.nombre);
        System.out.printf("Fecha de nacimiento: %d/%d/%d\n",fechaNacimiento.getDate(),fechaNacimiento.getMonth()+1,fechaNacimiento.getYear());
        System.out.println("Edad: "+((int)(((fechaActual.getTime()-this.fechaNacimiento.getTime())/3.154E+10)+1900+1)));
    }
    

}

/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Ejemplo Date como atributo: DateAtributo
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
21
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
