import java.util.ArrayList;

public class Artista {

    private String nombreArtista;
    private String nacionalidad;
    public ArrayList<Obra> listaObras=new ArrayList<Obra>();



    private Obra findObra (String nomObra){

        for (int cont=0;cont< listaObras.size();cont++){

            if (listaObras.get(cont).getNombreObra().equals(nomObra)){

                return listaObras.get(cont);  //devuelve la posicion de la obra en la lista
            }
        }
        return null;
    }




    public boolean addObra (String nomObra, String tipoObra, int precioMillones, int fechaCreada ){


        if (findObra(nomObra)!=null){

            addtoListaObr(nomObra,listaObras);
            return true; //Se añade a la lista de obras por que no encuentra ninguna obra con el mismo nombre
        }

        return false;
    }


    public boolean addtoListaObr (String nombreObra, ArrayList<Obra> obra ){
        boolean existe=true;

        if (listaObras.contains(findObra(nombreObra))){

            obra.add(findObra(nombreObra));
            return false;  //Si = false significa que la obra no esta en la lista y la añade
        }
        return true;
    }

    public Artista (String nombreArtista, String nacionalidad){

    this.nombreArtista=nombreArtista;
    this.nacionalidad=nacionalidad;

    ArrayList ObradelArtista=new ArrayList<Obra>();
    this.listaObras=ObradelArtista;

    }

}
