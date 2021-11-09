public class SmartWatch extends Producto implements TomarFoto, Portable, HacerLlamada{

    public SmartWatch(String nom, String pre, String ser, String mar, String fab, String ar){
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
        return "El SmartWatch esta llamando al numero: " + numero;
    }

    @Override
    public String mostrarPortable() {
        // TODO Auto-generated method stub
        return "Es portable";
    }

    @Override
    public String fotografiar() {
        // TODO Auto-generated method stub
        return "El SmartWatch ha tomado una foto.";
    }
    
}
