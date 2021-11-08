public class TelefonoCelular extends Producto implements HacerLlamada, Portable{

    public TelefonoCelular(String pre, String ser, String mar, String fab, String ar){
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

