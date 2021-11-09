import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import java.io.FileNotFoundException;


public class PrepararCSV {
    private File path = new File("/Ej6POO/Tienda 1.csv");
    private File path2 = new File("/Ej6POO/Tienda 2.csv");
    private File path3 = new File("/Ej6POO/Tienda 3.csv");


    public ArrayList<String[]> leerSucursal1(){
        ArrayList<String[]> sucursal1 = new ArrayList<String[]>();
		String line = "";
		
		try{
            BufferedReader br = new BufferedReader(new FileReader(path));
			while((line = br.readLine())!= null){
				String[] values = line.split(",");
				sucursal1.add(values);
			}
            br.close();
			
		}catch(FileNotFoundException e){
			//e.printStackTrace();
		}catch(IOException e){
			//e.printStackTrace();
		}
        return sucursal1;
    }

    
    public ArrayList<String[]> leerSucursal2(){
        ArrayList<String[]> sucursal2 = new ArrayList<String[]>();
		String line = "";
		
		try{
            BufferedReader br = new BufferedReader(new FileReader(path2));
			while((line = br.readLine())!= null){
				String[] values = line.split(",");
				sucursal2.add(values);
			}
            br.close();
			
		}catch(FileNotFoundException e){
			//e.printStackTrace();
		}catch(IOException e){
			//e.printStackTrace();
		}
        return sucursal2;
    }


    public ArrayList<String[]> leerSucursal3(){
        ArrayList<String[]> sucursal3 = new ArrayList<String[]>();
		String line = "";
		
		try{
            BufferedReader br = new BufferedReader(new FileReader(path3));
			while((line = br.readLine())!= null){
				String[] values = line.split(",");
				sucursal3.add(values);
			}
            br.close();
			
		}catch(FileNotFoundException e){
			//e.printStackTrace();
		}catch(IOException e){
			//e.printStackTrace();
		}
        return sucursal3;
    }



}
