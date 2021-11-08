public class Smartphone extends Producto implements HacerLlamada, TomarFoto, Navegador, Reproductor, Portable{



    public Smartphone(String nom, String pre, String ser, String mar, String fab, String ar){
        nombre = nom;
        precio = pre;
        serie = ser;
        marca = mar;
        fechaFab = fab;
        marcadorAR = ar;
    }

    @Override
    public String hacerLlamada(String numero) {
        // TODO Auto-generated method stub
        return "Se esta llamando al numero: "+ numero;
    }

    @Override
    public String mostrarPortable() {
        // TODO Auto-generated method stub
        return "Es portable";
    }

    @Override
    public String reproducirVideo() {
        // TODO Auto-generated method stub
        return "El smartphone esta reproduciendo un video.";
    }

    @Override
    public String navegadorInternet(String sitio) {
        // TODO Auto-generated method stub
        return "*Se esta navegando en el sitio: "+sitio +" *";
    }

    @Override
    public String fotografiar() {
        // TODO Auto-generated method stub
        return "*El Smartphone ha tomado una foto.";
    }
    
}

