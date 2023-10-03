import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*crea un sistema de gestion de libros en java. debes de tener una clase libros con atributos como titulo autor y año de publicacion. luego crear una clase
    * biblioteca que agrege, busque y elimine libros,implementa adicionalmente los metodos para mostrar todos los libros de la biblioteca, comentariar todo */

    public static void main(String[] args) {
         menu();
    }


    public static void menu(){
        int opcion,continuar;
        Biblioteca estanteria=new Biblioteca();
        Scanner scan=new Scanner(System.in);
        ArrayList<Libros> informacionLibros = new ArrayList<>();

    do{
        System.out.println("que opcion desea realizar 1-agregar 2-buscar 3-eliminar");
        opcion=scan.nextInt();

        switch (opcion){
            case 1:
                estanteria.guardarLibro(informacionLibros);
                break;
            case 2:
                estanteria.buscarLibro(informacionLibros);
                break;
            case 3:
                estanteria.eliminarLibro(informacionLibros);

        }

        System.out.println("Desea realizar otra accion 1=Si 2=No");
        continuar=scan.nextInt();

    }while (continuar==1);

    }


}