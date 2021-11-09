import java.util.ArrayList;

public class Controlador{
    public static void main(String[] args) {
        Vista vs = new Vista();
        PrepararCSV prep = new PrepararCSV();
        ArrayList<Producto> carrito = new ArrayList<Producto>();
        ArrayList<String[]> prodSucursal = new ArrayList<String[]>();
      
        vs.bienvenida();
        int w = 10;
        String sucursal = vs.elegirSucursal();
        int producto = 0;
        int op = 0;
        while(w!=0){
        int menu = vs.menu();
            if(menu == 1){
                if(sucursal.equals("1")){
                    prodSucursal = prep.leerSucursal1();
                    producto = vs.escogerProducto(prodSucursal);
                    op = vs.preCarrito();
                }else if(sucursal.equals("2")){
                    prodSucursal = prep.leerSucursal2();

                }else if(sucursal.equals("3")){
                    prodSucursal = prep.leerSucursal3();
                    
                }

                if(producto == 1){
                    Smartphone sp = new Smartphone(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(sp);
                    }else if(op == 2){
                        int h = 10;
                        while( h !=0 ){
                            int probar = vs.probarSmarPhone();
                            if(probar == 1){
                                String numero = vs.numeroAllamar();
                                vs.emitirMensaje(sp.hacerLlamada(numero));
                            }else if(probar == 2){
                                vs.emitirMensaje(sp.mostrarPortable());
                            }else if(probar == 3){
                                vs.emitirMensaje(sp.reproducirVideo());
                            }else if(probar == 4){
                                String sitio = vs.introducirSitio();
                                vs.emitirMensaje(sp.navegadorInternet(sitio));
                            }else if(probar == 5){
                                vs.emitirMensaje(sp.fotografiar());
                            }else if(probar == 6){
                                h = 0;
                            }
                        }

                        int agregar = vs.agregarAcarrito();
                        if(agregar == 1){
                            carrito.add(sp);
                        }else if(agregar==2){
                            vs.emitirMensaje("\nPuede seguir comprando.\n");
                        }
                    }
                }else if(producto == 2){

                }
            }else if(menu == 2){
                vs.mostrarCarrito(carrito);
            }else if(menu == 3){
                //Aqui se cierra el programa con un System.exit(0);
            }
        }
    }
    
}