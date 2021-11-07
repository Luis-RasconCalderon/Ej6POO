//Interfaces
interface Reproductor{
    String[] reproducirVideo();
}
interface Navegador{
    String[] navegadorInternet();
}
interface Portable{
    String[] mostrarPortable();
}
interface TomarFoto{
    String[] fotografiar();
}
interface Jugar{
    String[] jugarGame();
}
interface HacerLlamada{
    String[] hacerLlamada();
}
public class Producto {
    private String precio;
    private String serie;
    private String marca;
    private String fechaFab;
    private String marcadorAR;

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

    

}
