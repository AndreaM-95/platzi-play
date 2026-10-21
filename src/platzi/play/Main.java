package platzi.play;

import platzi.play.contenido.Pelicula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PLATZI PLAY");

        Pelicula pelicula = new Pelicula(); // Instancia del objeto
        pelicula.titulo = "Harry Potter";
        pelicula.anioEstreno = 2001;
        pelicula.genero = "Fantasía";
        pelicula.calificar(4.5);
        System.out.println(pelicula.obtenerFichaTecnica());

    }
}
