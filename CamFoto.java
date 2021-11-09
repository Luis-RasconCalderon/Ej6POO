import java.lang.reflect.Method;

public class CamFoto extends Producto implements TomarFoto, Reproductor, Portable{

    public CamFoto(String nom, String pre, String ser, String mar, String fab, String ar){
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
        return "*La camara esta reproduciendo un video*";
    }

    @Override
    public String fotografiar() {
        // TODO Auto-generated method stub
        return "*La camara ha tomado una foto*";
    }
    
}
