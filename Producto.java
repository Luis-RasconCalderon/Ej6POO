//Interfaces
interface Reproductor{
    String reproducirVideo();
}
interface Navegador{
    String navegadorInternet(String sitio);
}
interface Portable{
    String mostrarPortable();
}
interface TomarFoto{
    String fotografiar();
}
interface Jugar{
    String jugarGame();
}
interface HacerLlamada{
    String hacerLlamada(String numero);
}
public class Producto {
    protected String nombre;
    protected String precio;
    protected String serie;
    protected String marca;
    protected String fechaFab;
    protected String marcadorAR;

    public String getPrecio() {
        return precio;
    }

    public String getSerie() {
        return serie;
    }

    public String getMarca() {
        return marca;
    }

    public String getFechaFab() {
        return fechaFab;
    }

    public String getMarcadorAR() {
        return marcadorAR;
    }
    public String getNombre() {
        return nombre;
    }

    

}
