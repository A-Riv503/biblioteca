import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner scan=new Scanner(System.in);
    public void guardarLibro(ArrayList<Libros> informacionLibros){
        int cantidadLibros;
        String titulo,autor,fechaPublicacion;
        System.out.println("cuantos libros desea agregar");
        cantidadLibros=scan.nextInt();
        scan.nextLine();

        for(int i=0;i<cantidadLibros;i++){
            System.out.println("ingrese el titulo del libro");
            titulo=scan.nextLine();
            //scan.nextLine();
            System.out.print("ingrese el autor del libro\n");
            autor=scan.nextLine();
            //scan.nextLine();
            System.out.print("ingrese la fecha de publicacion del libro (formato: dia/mes/año)\n");
            fechaPublicacion=scan.nextLine();
            //scan.nextLine();
            informacionLibros.add(new Libros(titulo,autor,fechaPublicacion));
        }
    }

    public void buscarLibro(ArrayList<Libros> informacionLibros){
        int metodoBusqueda;
        System.out.println("ingrese su metodo de busqueda 1=titulo 2=nombre 3=fecha");
        metodoBusqueda=scan.nextInt();
        scan.nextLine();
        //agregar un get para poder comparar el texto agregado con el buscado, utilizar un for eage para optimizar codgio,mostrar sobre escritura en clase libro del
        //metodo to string y en vez de colocar 4 print invocar metodo to sting para dejar solo 1 linea de codigo
        switch (metodoBusqueda){
            case 1:
                String nombreBuscado;
                System.out.println("ingrese el nombre del libro que busca");
                nombreBuscado=scan.nextLine();
                for(int i=0;i<informacionLibros.size();i++){
                    Libros data= informacionLibros.get(i);
                    if(data.titulo.equals(nombreBuscado)){
                        System.out.println("este es el libro que busca");
                        System.out.println(data.titulo);
                        System.out.println(data.autor);
                        System.out.println(data.fechaPublicacion);
                        break;
                    }else{
                        System.out.println("el libro no se encuentra en los registros o fue eliminado");
                    }
                }
                break;
            case 2:
                String autorBuscado;
                System.out.println("ingrese el nombre del autor que busca");
                autorBuscado=scan.nextLine();
                for(int i=0;i<informacionLibros.size();i++){
                    Libros data=informacionLibros.get(i);
                    if(data.autor.equals(autorBuscado)){
                        System.out.println("estos son los libros del autor que busca");
                        System.out.println(data.titulo);
                        System.out.println(data.autor);
                        System.out.println(data.fechaPublicacion);
                        break;
                    }else{
                        System.out.println("no hay registros de ese autor o fue eliminado");
                    }
                }
                break;
            case 3:
                String fechaBuscada;
                System.out.println("ingrese la fecha que desea buscar");
                fechaBuscada=scan.nextLine();
                for(int i=0;i<informacionLibros.size();i++){
                    Libros data=informacionLibros.get(i);
                    if(data.fechaPublicacion.equals(fechaBuscada)){
                        System.out.println("las fechas que conciden son las siguientes");
                        System.out.println(data.titulo);
                        System.out.println(data.autor);
                        System.out.println(data.fechaPublicacion);
                        break;
                    }else{
                        System.out.println("no se ha registrado el libro o se a eliminado");
                    }
                }
                break;
        }


    }

    public void eliminarLibro(ArrayList<Libros> informacionLibros){
        int metodoEliminacion;
        boolean encontrado = false;
        System.out.println("ingrese el dato del libro que desea eliminar 1=titulo 2=nombre 3=fecha");
        metodoEliminacion=scan.nextInt();
        scan.nextLine();
        //agregar un get para poder comparar el texto agregado con el buscado, utilizar un for eage para optimizar codgio,mostrar sobre escritura en clase libro del
        //metodo to string y en vez de colocar 4 print invocar metodo to sting para dejar solo 1 linea de codigo
        int indice;
        switch (metodoEliminacion){
            case 1:
                String nombreBuscado;
                System.out.println("ingrese el nombre del libro que desea eliminar");
                nombreBuscado=scan.nextLine();
                for(indice=0;indice<informacionLibros.size();indice++){
                    if(informacionLibros.get(indice).equals(nombreBuscado)){
                        encontrado=true;
                        informacionLibros.remove(indice);
                        System.out.println("se a eliminado el libro");
                    }else{
                        System.out.println("no se ha encontrado un libro con ese nombre");
                    }
                }
                 /*indice=informacionLibros.indexOf(nombreBuscado);
                 if(indice!=-1){
                     informacionLibros.remove(indice);
                     System.out.println("Libro eliminado");
                 }else{
                     System.out.println("el libro no se encuentra en los registros");
                 }*/


                break;
            case 2:
                String autorBuscado;
                System.out.println("ingrese el nombre del autor que desea eliminar");
                autorBuscado=scan.nextLine();
                indice=informacionLibros.indexOf(autorBuscado);
                if(indice!=-1){
                    informacionLibros.remove(indice);
                    System.out.println("Libro eliminado");
                }else{
                    System.out.println("el libro no se encuentra en los registros");
                }

                break;
            case 3:
                String fechaBuscada;
                System.out.println("ingrese la fecha que desea eliminar");
                fechaBuscada=scan.nextLine();
                indice=informacionLibros.indexOf(fechaBuscada);
                if(indice!=-1){
                    informacionLibros.remove(indice);
                    System.out.println("Libro eliminado");
                }else{
                    System.out.println("el libro no se encuentra en los registros");
                }
                break;
        }
    }
}
