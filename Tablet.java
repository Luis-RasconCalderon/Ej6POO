public class Tablet extends Producto implements TomarFoto, Navegador, Reproductor, Portable{

    public Tablet(String pre, String ser, String mar, String fab, String ar){
        precio = pre;
        serie = ser;
        marca = mar;
        fechaFab = fab;
        marcadorAR = ar;
    }

    @Override
    public String mostrarPortable() {
        // TODO Auto-generated method stub
        return "Es portable.";
    }

    @Override
    public String reproducirVideo() {
        // TODO Auto-generated method stub
        return "La tablet esta reproduciendo un video.";
    }

    @Override
    public String navegadorInternet(String sitio) {
        // TODO Auto-generated method stub
        return "*Se esta navegando en el sitio: "+sitio +" *";
    }

    @Override
    public String fotografiar() {
        // TODO Auto-generated method stub
        return "La tablet está tomando una foto";
    }
    
}
