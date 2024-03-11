import java.util.ArrayList;
import java.util.LinkedList;

public class Obra {

    private String nombreObra;
    private String tipoDeObra;
    private Artista artista;
    private int precioEnMillones;
    private int fecha;

    public Obra (String nombreObra,String tipoDeObra, int precioEnMillones, int fechaCreacion, Artista artista){



        this.nombreObra=nombreObra;
        this.tipoDeObra=tipoDeObra;
        this.precioEnMillones=precioEnMillones;
        this.fecha=fechaCreacion;
        this.artista=artista;



    }


    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public int getPrecio() {
        return precioEnMillones;
    }

    public void setPrecio(int precio) {
        this.precioEnMillones = precio;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public boolean addObra (LinkedList<Obra>listaObras){


        if (findObra(listaObras)!=null){

            listaObras.add(this);
            return true; //Se añade a la lista de obras por que no encuentra ninguna obra con el mismo nombre
        }

        return false;
    }


    private Obra findObra (LinkedList<Obra> listaObras){

        for (int cont=0;cont< listaObras.size();cont++){

            if (listaObras.get(cont).getNombreObra().equals(this.nombreObra)){

                return listaObras.get(cont);
            }
        }
        return null;
    }



    @Override
    public String toString() {
        return "Obra{" +
                "nombreObra='" + nombreObra + '\'' +
                ", tipoDeObra='" + tipoDeObra + '\'' +
                ", precioEnMillones=" + precioEnMillones +
                ", fecha=" + fecha +
                '}';
    }
}
