import java.util.Scanner;
import java.util.ArrayList;
public class Clase5 {
	 public static void main (String[] args)   
	 { Scanner num = new Scanner(System.in);  //Inicializa el Scanner
	   ArrayList <String> palabras = new ArrayList <String>();  //Vector con un indice indefinido
	   System.out.println (palabras);
	   palabras.add("Lunes"); //Agrego al final del array
	   System.out.println (palabras);
	   palabras.add(0,"Lunes1"); //Agrego en el indice del array y desplazo a la derecha
	   System.out.println (palabras);
	   System.out.println (palabras.get(0)); //Imprimo el lugar del vector que deseo
	   palabras.remove("Lunes1");   //Remuevo el valor escrito
	   System.out.println (palabras);
	   palabras.set (0, "Martes");  //Reemplazo un valor por el deseado
	   System.out.println (palabras);
	   palabras.clear();   //Limpio el vector
	   System.out.println (palabras); 
	   
	 }
		 
	 

}
