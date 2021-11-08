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
        String nume = "";
        while(h !=0){
            try {
                int num = sc.nextInt();
                h = 0;
                nume = Integer.toString(num);
                
            } catch (Exception e) {
                System.out.println("\n Ingrese un numero,");
            }
        }
        return nume;
        
    }

}
