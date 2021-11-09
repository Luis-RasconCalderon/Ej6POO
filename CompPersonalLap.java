public class CompPersonalLap extends Producto implements Navegador, Jugar, Reproductor, Portable{


    public CompPersonalLap(String nom, String pre, String ser, String mar, String fab, String ar){
        nombre = nom;
        precio = pre;
        serie = ser;
        marca = mar;
        fechaFab = fab;
        marcadorAR = ar;
    }

    @Override
    public String mostrarPortable() {
        // TODO Auto-generated method stub
        return "*Es portable*";
    }

    @Override
    public String reproducirVideo() {
        // TODO Auto-generated method stub
        return "*La computadora personal laptop esta reproduciendo un video*";
    }

    @Override
    public String jugarGame() {
        // TODO Auto-generated method stub
        return "La computadora personal laptop esta ejecutando un VideoJuego";
    }

    @Override
    public String navegadorInternet(String sitio) {
        // TODO Auto-generated method stub
        return "*Se esta navegando en el sitio: "+sitio +" *";
    }
    
}

