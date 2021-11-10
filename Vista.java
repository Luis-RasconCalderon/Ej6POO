import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    Scanner sc = new Scanner(System.in);
//Mensaje de bienvenida al usuario
    public void bienvenida(){
        System.out.println("\n-----------------------------------------------");
        System.out.println("Bienvenido al Electronica Latinoamericana!");
        System.out.println("\n-----------------------------------------------n");
    }
//Mensaje de despedida al salir del programa
    public void despedida(){
        System.out.println("\n-----------------------------------------------");
        System.out.println("Nos vemos pronto!");
        System.out.println("\n-----------------------------------------------");
    }

//Preguntar a que numero decea llamar a la hora de probar llamadas
    public String numeroAllamar(){
        System.out.println("\nIngrese el numero de telefono a llamar: ");
        String nume = sc.nextLine();
        return nume;
    }

//Preguntar a que sitio desea ingresar el usuario al probar navegador
    public String introducirSitio(){
        System.out.println("\nIngrese el sitio a visitar: ");
        String sitio = sc.nextLine();
        return sitio;
    }
//Preguntar que sucursal desea usar el usuario para consultar productos o realizar sus compras
    public String elegirSucursal(){
        System.out.println("\n");
        System.out.println("Que sucursal desea utilizar?: (Sucursal 1, Sucursal 2, Sucursal 3)");   
        int i = 10;
        String suc = ""; 
        while(i != 0){
            suc = sc.nextLine();
            if(suc.equals("1")||suc.equals("2")||suc.equals("3")){
                i = 0;
            }else{
                System.out.println("Ingrese una sucursal valida (1-3)");
            }
        }
        return suc;
    }
//Preguntar que producto desea probar 
    public int escogerProducto(ArrayList<String[]> prodSucursal){
        System.out.println("\nQue producto dese utilizar?: ");
        for(int s = 0; s<prodSucursal.size();s++){
                System.out.println((s)+"-Nombre: "+ prodSucursal.get(s)[0]+" -Precio: "+ prodSucursal.get(s)[1]+" -Serie: "+ prodSucursal.get(s)[2]+" -Marca: "+ prodSucursal.get(s)[3]+" -Fecha: "+ prodSucursal.get(s)[4]+" -MarcadorAR: "+ prodSucursal.get(s)[5]);
        }

        int a = 10;
        int b = 0;
        String pro = "";
        String selec = "";

        while(a !=0 ){
            pro = sc.nextLine();

            if(pro.equals("1")||pro.equals("2")||pro.equals("3")||pro.equals("4")||pro.equals("5")||pro.equals("6")||pro.equals("7")||pro.equals("8")||pro.equals("9")){
                a = 0;
                selec = pro;
            }else{
                System.out.println("\n Ingrese un numero correcto");
            }
        }

        return Integer.parseInt(selec);
    } 
//Preguntar si se desea probar el producto o añadir directamente al carrito
    public int preCarrito(){
        System.out.println("\n Que desea hacer?: \n1) Agregar directamente al carrito.\n2) Probar");

        int a = 10;
        String pro = "";
        String selec = "";

        while(a !=0 ){
            pro = sc.nextLine();

            if(pro.equals("1")||pro.equals("2")||pro.equals("3")||pro.equals("4")||pro.equals("5")||pro.equals("6")||pro.equals("7")||pro.equals("8")){
                a = 0;
                selec = pro;
            }else{
                System.out.println("\n Ingrese un numero correcto");
            }
        }

        return Integer.parseInt(selec);
    }
//Menú principal
    public int menu(){
        System.out.println("\n");
        System.out.println("Que desea hacer?: \n1)Agregar producto\n2)Ver carrito\n3)Eliminar objeto del carrito\n4)Comprar todo en carrito y cerrar");
        int b = 10;
        String men = "";
        String selec = "";

        while(b !=0 ){
            men = sc.nextLine();
            System.out.println("\n");
            if(men.equals("1")||men.equals("2")||men.equals("3")){
                b = 0;
                selec = men;
            }else{
                System.out.println("\n");
                System.out.println("\n Ingrese una opcion correcta");
            }
        }

        return Integer.parseInt(selec);
    }

//Funciones del Smartphone para probarlo
    public int probarSmarPhone(){
        System.out.println("Que desea probar del Samrtphone?: \n1) Hacer llamada\n2) Verificar portabilidad\n3) Reproducir video\n4) Navegar por internet\n5) Tomar foto\n6) Terminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0 ){
            pr = sc.nextLine();

            if(pr.equals("1")||pr.equals("2")||pr.equals("3")||pr.equals("4")||pr.equals("5")||pr.equals("6")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }

        return Integer.parseInt(selec);
    }
//Funciones del Telefono Celular probarlo
    public int probarTelefonoCelular(){
        System.out.println("Que desea probar del Telefono Celular?: \n1) Hacer llamada\n2) Verificar portabilidad\nTerminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0){
            pr = sc.nextLine();

            if (pr.equals("1")||pr.equals("2")||pr.equals("3")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }
        return Integer.parseInt(selec);
    }
//Funciones del Telefono Fijo
    public int probarTelefonoFijo(){
        System.out.println("Que desea probar del Telefono Fijo?: \n1)Hacer llamada\n2)Terminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0){
            pr = sc.nextLine();

            if (pr.equals("1")||pr.equals("2")||pr.equals("3")||pr.equals("4")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }
        return Integer.parseInt(selec);
    }
//Funciones de Camara fotografica
    public int probarCamara(){
        System.out.println("Que desea probar de la Camara Fotografica?: \n1)Tomar Fotografia\n2)Reproducir video\n3)Verificar portabilidad\n4)Terminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0){
            pr = sc.nextLine();

            if (pr.equals("1")||pr.equals("2")||pr.equals("3")||pr.equals("4")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }
        return Integer.parseInt(selec);
    }
//Funciones del computador personal (Desk)
    public int probarDesk(){
        System.out.println("Que desea probaar del computador personal desk?: \n1)Navegar por internet\n2)Reproducir videos\n3)Ejecutar Juegos\n4)Terminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0){
            pr = sc.nextLine();

            if (pr.equals("1")||pr.equals("2")||pr.equals("3")||pr.equals("4")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }
        return Integer.parseInt(selec);
    }
//Funciones del computador personal (Laptop)
    public int probarLap(){
        System.out.println("Que desea probaar del computador personal Laptop?: \n1)Navegar por internet\n2)Reproducir videos\n3)Ejecutar Juegos\n4)Comprobar portabilidad\n5)Terminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0){
            pr = sc.nextLine();

            if (pr.equals("1")||pr.equals("2")||pr.equals("3")||pr.equals("4")||pr.equals("5")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }
        return Integer.parseInt(selec);
    }
//Funciones de la Smart TV
    public int probarSmartTV(){
        System.out.println("Que desea probaar del computador personal Laptop?: \n1)Navegar por internet\n2)Reproducir videos\n3)Terminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0){
            pr = sc.nextLine();

            if (pr.equals("1")||pr.equals("2")||pr.equals("3")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }
        return Integer.parseInt(selec);
    }
//Funciones Tablets
    public int probarTablet(){
        System.out.println("Que desea probaar de la tablet?: \n1)Navegar por internet\n2)Reproducir videos\n3)Tomar Fotografia\n4)Verificar portabilidad\n5)Terminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0){
            pr = sc.nextLine();

            if (pr.equals("1")||pr.equals("2")||pr.equals("3")||pr.equals("4")||pr.equals("5")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }
        return Integer.parseInt(selec);
    }
//Funciones smartwatch
    public int probarSmartW(){
        System.out.println("Que desea probaar del smartwatch?: \n1)Tomar Fotografia\n2)Verificar portabilidad\n3)Hacer llamada\n4)Terminar de probar");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0){
            pr = sc.nextLine();

            if (pr.equals("1")||pr.equals("2")||pr.equals("3")||pr.equals("4")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
    }
    return Integer.parseInt(selec);
}
    public void emitirMensaje(String txt){
        System.out.println(txt);
    }
 //Preguntar si desea agregar el producto al carrito despues de probarlo   
    public int agregarAcarrito(){
        System.out.println("Luego de probar: Desea agregar el producto al carrito?: \n1)Si\n2)No");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0 ){
            pr = sc.nextLine();

            if(pr.equals("1")||pr.equals("2")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }

        return Integer.parseInt(selec);
    }

    public int filtradoCarrito(){
        System.out.println("Desea filtrar el carrito por precio?: \n1)Si\n2)No");
        int b = 10;
        String pr = "";
        String selec = "";

        while(b !=0 ){
            pr = sc.nextLine();

            if(pr.equals("1")||pr.equals("2")){
                b = 0;
                selec = pr;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }

        return Integer.parseInt(selec);
    }


    public int eliminarObjeto(ArrayList<Producto> carrito){
        System.out.println("Que objeto desea retirar del carrito?: ");
        for(int c = 0; c<carrito.size();c++){
            System.out.println((c+1)+ ") "+carrito.get(c).getNombre()+ " "+carrito.get(c).getMarca()+" " + carrito.get(c).getPrecio());
        }
        int k = 10;
        String elim = "";
        while(k!=0){
            String el = sc.nextLine();
            if(Integer.parseInt(el)<carrito.size()){
                k = 0;
                elim = el; 
            }
        }

        return Integer.parseInt(elim);
    }

    public void mostrarCarrito(ArrayList<Producto> carrito){
        System.out.println("Nombre "+ " Marca "+ " Precio");
        for(int c = 0; c<carrito.size();c++){
            System.out.println(carrito.get(c).getNombre()+" "+ carrito.get(c).getMarca()+" " + carrito.get(c).getPrecio());
        }
    }
	



}
