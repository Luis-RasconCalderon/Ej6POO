public class CompPersonalDesk extends Producto implements Navegador, Reproductor, Jugar{

    public CompPersonalDesk(String pre, String ser, String mar, String fab, String ar){
        precio = pre;
        serie = ser;
        marca = mar;
        fechaFab = fab;
        marcadorAR = ar;
    }

    @Override
    public String jugarGame() {
        // TODO Auto-generated method stub
        return "*La computadora de escritorio esta ejecutando un VideoJuego*";
    }

    @Override
    public String reproducirVideo() {
        // TODO Auto-generated method stub
        return "*La computadora de escritorio esta reproduciendo un video*";
    }

    @Override
    public String navegadorInternet(String sitio) {
        // TODO Auto-generated method stub
        return "*Se esta navegando en el sitio: "+sitio +" *";
    }
    
}

