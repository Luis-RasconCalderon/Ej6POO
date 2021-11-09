import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    Scanner sc = new Scanner(System.in);

    public void bienvenida(){
        System.out.println("\n-----------------------------------------------");
        System.out.println("Bienvenido al Electronica Latinoamericana!");
        System.out.println("\n-----------------------------------------------n");
    }

    public void despedida(){
        System.out.println("\n-----------------------------------------------");
        System.out.println("Nos vemos pronto!");
        System.out.println("\n-----------------------------------------------");
    }


    public String numeroAllamar(){
        System.out.println("\nIngrese el numero de telefono a llamar: ");
        String nume = sc.nextLine();
        return nume;
    }


    public String introducirSitio(){
        System.out.println("\nIngrese el sitio a visitar: ");
        String sitio = sc.nextLine();
        return sitio;
    }

    public String elegirSucursal(){
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

            if(pro.equals("1")||pro.equals("2")||pro.equals("3")||pro.equals("4")||pro.equals("5")||pro.equals("6")||pro.equals("7")||pro.equals("8")){
                a = 0;
                selec = pro;
            }else{
                System.out.println("\n Ingrese un numero correcto");
            }
        }

        return Integer.parseInt(selec);
    } 

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


    public int menu(){
        System.out.println("Que desea hacer?: \n1)Agregar producto\n2)Ver carrito\n3)Comprar todo en carrito y cerrar");
        int b = 10;
        String men = "";
        String selec = "";

        while(b !=0 ){
            men = sc.nextLine();
            if(men.equals("1")||men.equals("2")||men.equals("3")){
                b = 0;
                selec = men;
            }else{
                System.out.println("\n Ingrese una opcion correcta");
            }
        }

        return Integer.parseInt(selec);
    }


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


    public void emitirMensaje(String txt){
        System.out.println(txt);
    }
    
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



}
