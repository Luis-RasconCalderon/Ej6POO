import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

	public ArrayList<Producto> ordenarCarritoPrecio(ArrayList<Producto> carritoSinO){
		ArrayList<Producto> CarritoOrdenado = new ArrayList<Producto>();
		ArrayList<String> precio = new ArrayList<String>();


		for(int p = 0;p < carritoSinO.size();p++){
            precio.add(carritoSinO.get(p).getPrecio());
        }
		
		Double[] i = new Double[carritoSinO.size()];
		for(int t = 0;t<precio.size();t++){
			i[t] = Double.parseDouble(precio.get(t));
		}

		Arrays.sort(i, Collections.reverseOrder());

		for(int k = 0; k<i.length;k++){
			for(int g = 0;g<carritoSinO.size();g++){
				if(Double.toString(i[k]).equals(carritoSinO.get(g).getPrecio())){
					CarritoOrdenado.add(carritoSinO.get(g));
					g = g+carritoSinO.size();
				}
			}
		}


		return CarritoOrdenado;
	}


}
