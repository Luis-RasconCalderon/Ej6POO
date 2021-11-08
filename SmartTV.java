public class SmartTV extends Producto implements Navegador, Reproductor{


    public SmartTV(String pre, String ser, String mar, String fab, String ar){
        precio = pre;
        serie = ser;
        marca = mar;
        fechaFab = fab;
        marcadorAR = ar;
    }

    @Override
    public String reproducirVideo() {
        // TODO Auto-generated method stub
        return "La SmartTV esta reproduciendo un video";
    }

    @Override
    public String navegadorInternet(String sitio) {
        // TODO Auto-generated method stub
        return "*Se esta navegando en el sitio: "+sitio +" *";
    }
    
}