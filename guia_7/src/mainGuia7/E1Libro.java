package mainGuia7;

import java.util.Locale;
import java.util.Scanner;

public class E1Libro {
    ////atributos

    public int isbn;
    public String titulo;
    public String autor;
    public int nro_de_paginas;

    ////cosntructor vacio
    public void LibroE1G7() {

    }

    ////cosntructor con parametros
    public void LibroE1G7(int isbn, String titulo, String autor, int nro_de_paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nro_de_paginas = nro_de_paginas;
    }

    ////metodo cargar libro
    public void cargarLibro() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese nro. de isbn: ");
        this.isbn = entrada.nextInt();
        System.out.print("Ingrese título: ");
        this.titulo = entrada.next();
        System.out.print("Ingrese autor: ");
        this.autor = entrada.next();
        System.out.print("Ingrese nro. de páginas: ");
        this.nro_de_paginas = entrada.nextInt();

    }

    ////metodo mostrar libro
    public void mostrarLibro() {
        System.out.println("Mostrando datos del libro:");
        System.out.println("Nro. de isbn: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Nro. de páginas: " + this.nro_de_paginas);

    }
}

/* 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor
, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas*/
