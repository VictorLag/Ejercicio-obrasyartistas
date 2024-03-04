import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class MainObrasyArtistas {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Artista> listaArtistas=new ArrayList<>();

        Artista artista1 = new Artista("Leonardo da Vinci","italiano");
        Artista artista2 = new Artista("Pablo Picasso","español");
        Artista artista3 = new Artista("Auguste Rodin","francés");

        listaArtistas.add(artista1);
        listaArtistas.add(artista2);
        listaArtistas.add(artista3);

        LinkedList<Obra> ListaDeObras =new LinkedList<Obra>();
        artista1.addObra("Salvator Mundi","óleo sobre madera",450,1500);
        artista1.addObra("La Gioconda","óleo sobre madera",870,1503);
        artista2.addObra("El sueño","óleo sobre lienzo",155,1932);
        artista2.addObra("El Guernica","óleo sobre lienzo",2000,1937);
        artista3.addObra("El pensador","escultura",11,1904);


        boolean continuar=true;
        int opcion;

        while (continuar){

            System.out.println("Elige una opcion.");
            opcion=sc.nextInt();

            if (opcion<1 || opcion>8){
                System.out.println("Esa ocion no es correcta, elige entre las siguientes opciones : ");
                imprimirMenu();
                opcion=sc.nextInt();
            }while (opcion<0 || opcion>6);

            switch (opcion){

                case 1:


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

public static void anadirObra (){





    }










}
