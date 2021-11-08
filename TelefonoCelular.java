public class TelefonoCelular extends Producto implements HacerLlamada, Portable{

    public TelefonoCelular(String nom, String pre, String ser, String mar, String fab, String ar){
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
        return "Es portable";
    }

    @Override
    public String hacerLlamada(String numero) {
        // TODO Auto-generated method stub
        return "Se esta llamando al numero: "+ numero;
    }
    
}

