import java.util.ArrayList;

public class Controlador{
    public static void main(String[] args) {
        Vista vs = new Vista();
        PrepararCSV prep = new PrepararCSV();
        ArrayList<String[]> carrito = new ArrayList<String[]>();
        vs.bienvenida();

        String sucursal = vs.elegirSucursal();

        if(sucursal.equals("1")){
            ArrayList<String[]> prodSucursal1 = prep.leerSucursal1();
            int producto = vs.escogerProducto(prodSucursal1);
            
            

        }else if(sucursal.equals("2")){
            ArrayList<String[]> prodSucursal2 = prep.leerSucursal2();
        }else if(sucursal.equals("3")){
            ArrayList<String[]> prodSucursal3 = prep.leerSucursal3();
        }
    }
    
}