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
        int h = 10;
        String nume = sc.nextLine();
        return nume;
        
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



}
