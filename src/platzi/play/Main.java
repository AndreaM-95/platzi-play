package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PLATZI PLAY");

        Pelicula pelicula = new Pelicula(); // Instancia del objeto
        pelicula.titulo = "Harry Potter";
        pelicula.fechaEstreno = LocalDate.of(2001,11,5);
        pelicula.genero = "Fantasía";
        pelicula.calificar(4.5);
        int calificacionInt = (int) pelicula.calificacion;
        //System.out.println(pelicula.obtenerFichaTecnica());
        System.out.println(calificacionInt);

        Usuario usuario = new Usuario();
        usuario.nombre = "Carlos";
        usuario.fechaRegistro = LocalDateTime.of(2026,10,22,17,33,14);
        usuario.ver(pelicula);
    }
}
