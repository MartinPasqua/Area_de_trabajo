package Clase7;  //PROGRAMACION ORIENTADA A OBJETOS

public class Ejercicio1 {
   //ATRIBUTOS  
	private String nombre;
	private String apellido;
	private String domicilio;
	private String dni;
	private int edad;
	private String cuil;
	private double altura;
	private double peso;
	
	
	//CONSTRUCTORES
	public Ejercicio1 ()  //Constructor por defecto
	{}
	public Ejercicio1 (String nombre, String apellido, String dni, int edad) //Traigo las variables
	{this.nombre =nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.edad = edad;
	
	}
	
	public void mostrar ()  //Funcion a mostrar
	{System.out.println("Nombre" + this.nombre);
	System.out.println("Apellido " + this.apellido);
	System.out.println("Dni " + this.dni);
	System.out.println("edad " + this.edad);}
	
	
	 public static void main (String[] args) 
	 {Ejercicio1 Martin = new Ejercicio1 ("Martin", "Pasqua", "123123", 23);
		 System.out.println(Martin); //No lo permite porque es privado
	Martin.mostrar();	 
	 }
	 
	
}
