public class TeleFijo extends Producto implements HacerLlamada{

    public TeleFijo(String nom, String pre, String ser, String mar, String fab, String ar){
        precio = pre;
        serie = ser;
        marca = mar;
        fechaFab = fab;
        marcadorAR = ar;
    }

    @Override
    public String hacerLlamada(String numero) {
        // TODO Auto-generated method stub
        return "Se esta llamando al numero: " + numero;
    }
    
}
