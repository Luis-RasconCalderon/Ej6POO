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
                    TelefonoCelular tc = new TelefonoCelular(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(tc);
                    }else if(op == 2){
                        int i = 10;
                        while( i !=0 ){
                            int probar = vs.probarTelefonoCelular();
                            if(probar == 1){
                                String numero = vs.numeroAllamar();
                                vs.emitirMensaje(tc.hacerLlamada(numero));
                            }else if(probar == 2){
                                vs.emitirMensaje(tc.mostrarPortable());
                            }else if(probar == 3){
                                i = 0;
                        }
                    }       
                }else if(producto == 3){
                    TeleFijo tf = new TeleFijo(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(tf);
                    }else if(op == 2){
                        int j = 10;
                        while( j !=0 ){
                            int probar = vs.probarTelefonoFijo();
                            if(probar == 1){
                                String numero = vs.numeroAllamar();
                                vs.emitirMensaje(tc.hacerLlamada(numero));
                            }else if(probar == 2){
                                j = 0;
                            }
                        }
                    }
                }else if(producto == 4){
                    CamFoto ca = new CamFoto(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(ca);
                    }else if(op == 2){
                }int k = 10;
                while( k !=0 ){
                    int probar = vs.probarCamara();
                    if(probar == 1){
                                vs.emitirMensaje(ca.fotografiar());
                            }else if(probar == 2){
                                vs.emitirMensaje(ca.reproducirVideo());
                            }else if(probar == 3){
                                vs.emitirMensaje(ca.mostrarPortable());
                            }else if(probar == 4){
                                k = 0;
                            }
                        }
                }else if(producto == 5){
                    CompPersonalDesk desk = new CompPersonalDesk(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(desk);
                    }else if(op == 2){
                }int l = 10;
                while( l !=0 ){
                    int probar = vs.probarDesk();
                    if(probar == 1){
                        String sitio = vs.introducirSitio();
                                vs.emitirMensaje(desk.navegadorInternet(sitio));
                            }else if(probar == 2){
                                vs.emitirMensaje(desk.reproducirVideo());
                            }else if(probar == 3){
                                vs.emitirMensaje(desk.reproducirVideo());
                            }else if(probar == 4){
                                l = 0;
                            }
                        }
                }else if(producto == 6){
                    CompPersonalLap lap = new CompPersonalLap(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(lap);
                    }else if(op == 2){
                }int m = 10;
                while( m !=0 ){
                    int probar = vs.probarSmarPhone();
                    if(probar == 1){
                        String sitio = vs.introducirSitio();
                                vs.emitirMensaje(lap.navegadorInternet(sitio));
                            }else if(probar == 2){
                                vs.emitirMensaje(lap.mostrarPortable());
                            }else if(probar == 3){
                                vs.emitirMensaje(lap.reproducirVideo());
                            }else if(probar == 5){
                                m = 0;
                            }
                        }
                }else if(producto == 7){
                    SmartTV tv = new SmartTV(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(tv);
                    }else if(op == 2){
                }int n = 10;
                while( n !=0 ){
                    int probar = vs.probarSmartTV();
                    if(probar == 1){
                        String sitio = vs.introducirSitio();
                                vs.emitirMensaje(tv.navegadorInternet(sitio));
                            }else if(probar == 2){
                                vs.emitirMensaje(tv.reproducirVideo());
                            }else if(probar == 3){
                                n = 0;
                            }
                        }
                }else if(producto == 8){
                    Tablet t = new Tablet(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(t);
                    }else if(op == 2){
                }int o = 10;
                while( o !=0 ){
                    int probar = vs.probarTablet();
                    if(probar == 1){
                        String sitio = vs.introducirSitio();
                                vs.emitirMensaje(t.navegadorInternet(sitio));
                            }else if(probar == 2){
                                vs.emitirMensaje(t.reproducirVideo());
                            }else if(probar == 3){
                                vs.emitirMensaje(t.fotografiar());
                            }else if(probar == 4){
                                vs.emitirMensaje(t.mostrarPortable());
                            }else if(probar == 4){
                                o = 0;
                            }
                        }
                }else if(producto == 9){
                    SmartWatch sw = new SmartWatch(prodSucursal.get(producto)[0], prodSucursal.get(producto)[1], prodSucursal.get(producto)[2], prodSucursal.get(producto)[3], prodSucursal.get(producto)[4], prodSucursal.get(producto)[5]);
                    if(op == 1){
                        carrito.add(sw);
                    }else if(op == 2){
                }int p = 10;
                while( p !=0 ){
                    int probar = vs.probarTablet();
                    if(probar == 1){
                        vs.emitirMensaje(sw.fotografiar());
                            }else if(probar == 2){
                                vs.emitirMensaje(sw.mostrarPortable());
                            }else if(probar == 3){
                                String numero = vs.numeroAllamar();
                                vs.emitirMensaje(sw.hacerLlamada(numero));
                            }else if(probar == 4){    
                                p = 0;
                            }
                        }
                    
            }else if(menu == 2){
                vs.mostrarCarrito(carrito);
            }else if(menu == 3){
                //Aqui se cierra el programa con un System.exit(0);
            }
        }
    
