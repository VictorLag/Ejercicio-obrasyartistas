import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MainObraArtista {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Play();
    }


public static void Play () {

    ArrayList<Artista> listaArtistas = new ArrayList<>();

    Artista artista1 = new Artista("Leonardo da Vinci", "italiano");
    Artista artista2 = new Artista("Pablo Picasso", "español");
    Artista artista3 = new Artista("Auguste Rodin", "francés");

    listaArtistas.add(artista1);
    listaArtistas.add(artista2);
    listaArtistas.add(artista3);

    LinkedList<Obra> ListaDeObras = new LinkedList<Obra>();
    artista1.addObra("Salvator Mundi", "óleo sobre madera", 450, 1500);
    artista1.addObra("La Gioconda", "óleo sobre madera", 870, 1503);
    artista2.addObra("El sueño", "óleo sobre lienzo", 155, 1932);
    artista2.addObra("El Guernica", "óleo sobre lienzo", 2000, 1937);
    artista3.addObra("El pensador", "escultura", 11, 1904);


    boolean continuar=true;
    int opcion;

    while (continuar){

        imprimirMenu();
        System.out.println("Elige una opcion.");
        opcion=sc.nextInt();

        if (opcion<1 || opcion>10){
            System.out.println("Esa ocion no es correcta, elige entre las siguientes opciones : ");
            imprimirMenu();
            opcion=sc.nextInt();
        }while (opcion<0 || opcion>10);

        switch (opcion){

            case 1:

                Artista artista=new Artista("","");
                String nombredeObra="";
                String tipoObra="";
                int precioMillones;
                int fecha;

                System.out.println("Escribe el nombre de la obra");
                nombredeObra=sc.next();
                System.out.println("Escribe que tipo de obra es");
                tipoObra=sc.next();
                System.out.println("Escribe su precio en millones");
                precioMillones=sc.nextInt();
                System.out.println("Escribe la fecha en la que fue creada");
                fecha=sc.nextInt();


                if (!artista.addObra(nombredeObra,tipoObra,precioMillones,fecha)){

                    artista.addObra(nombredeObra,tipoObra,precioMillones,fecha);

                    System.out.println("Se ha añadido la obra correctamente");

                }
                else {
                    System.out.println("La obra no se puede añadir por que ya esta en la lista");
                }

                break;

            case 2:



                break;

            case 3:


                break;


            case 4:


                break;

            case 5:


                break;


            case 6:


                break;

            case 7:


                break;

            case 8:
                System.out.println("Saliendo del programa");
                continuar=false;
                break;

            case 9: //print lista de obras

                for (int cont=0;cont<ListaDeObras.size();cont++){




                }



                break;

            case 10: // print lista artistas


                break;
        }
    }
}

    public static void imprimirMenu(){

        System.out.println("1 = Añadir obra");
        System.out.println("2 = Añadir artista");
        System.out.println("3 = Buscar obra por nombre de obra");
        System.out.println("4 = Buscar obra por nombre de artista");
        System.out.println("5 = Eliminar obra");
        System.out.println("6 = Encontrar obra mas barata");
        System.out.println("7 = Encontrar obra más moderna");
        System.out.println("8 = Salir");

    }

}