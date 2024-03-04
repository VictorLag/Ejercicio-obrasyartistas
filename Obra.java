public class Obra {

    private String nombreObra;
    private String tipoDeObra;
    private int precioEnMillones;
    private int fecha;


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


    public Obra (String nombreObra,String tipoDeObra, int precioEnMillones, int fechaCreacion){

        this.nombreObra=nombreObra;
        this.tipoDeObra=tipoDeObra;
        this.precioEnMillones=precioEnMillones;
        this.fecha=fechaCreacion;

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
