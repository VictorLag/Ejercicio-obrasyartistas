import java.util.ArrayList;

public class Artista {

    private String nombreArtista;
    private String nacionalidad;

    public Artista (String nombreArtista, String nacionalidad){

        this.nombreArtista=nombreArtista;
        this.nacionalidad=nacionalidad;

    }


    public String getNombreArtista() {
        return nombreArtista;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }


    private Artista findArtista(ArrayList<Artista>listaArtistas){

        for (int cont=0;cont< listaArtistas.size();cont++){

            if (listaArtistas.get(cont).getNombreArtista().equals(this.nombreArtista)){

                return listaArtistas.get(cont);
            }
        }
        return null;

    }

    public boolean addArtista (ArrayList<Artista> listaArtista ){

        if (findArtista(listaArtista)==null){

            listaArtista.add(this);
            return true;
        }

        return false;
    }


}
