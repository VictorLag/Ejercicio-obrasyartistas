import java.util.ArrayList;

public class Artista {

    private String nombreArtista;
    private String nacionalidad;




    public String getNombreArtista() {
        return nombreArtista;
    }

    private Obra findObra (String nomObra){

        for (int cont=0;cont< listaObras.size();cont++){

            if (listaObras.get(cont).getNombreObra().equals(nomObra)){

                return listaObras.get(cont);  //devuelve la posicion de la obra en la lista
            }
        }
        return null;
    }

    private Artista findArtista (String NombreArtista){

        for (int cont=0; cont<listArtist.size();cont++ ){

            if (listArtist.get(cont).getNombreArtista().equals(NombreArtista)){

                return listArtist.get(cont); //devuelve la posicion del artista en la lista
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

    public boolean obraExiste (Obra obra){

        if (findObra(obra.getNombreObra())!=null){


            return true; //La obra existe en la lista
        }

        return false;
    }

    public boolean addtoListaObr (String nombreObra, ArrayList<Obra> obra ){

        if (listaObras.contains(findObra(nombreObra))){

            obra.add(findObra(nombreObra));
            return true;  //Si = true significa que la obra no esta en la lista y la añade
        }
        return false;
    }

    public boolean addtoListaArtista (String nombredelArtista, ArrayList<Artista> listaArtista ){

        if (listaArtista.contains(findArtista(nombreArtista))){

            listaArtista.add(findArtista(nombreArtista));
            return true;
        }
        return false;
    }

    public Artista (String nombreArtista, String nacionalidad){

    this.nombreArtista=nombreArtista;
    this.nacionalidad=nacionalidad;

    ArrayList ObradelArtista=new ArrayList<Obra>();
    this.listaObras=ObradelArtista;

    }
}
