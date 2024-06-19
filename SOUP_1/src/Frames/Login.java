
package Frames;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @(#)Login.java
 *
 *
 * @author Samuel López
 * @version 1.00 2022/4/21
 */
class Login {
	
	//Atributos
	private int nUsuarios;
	private Usuario[] regUsuarios;
	
	//Métodos
	//Constructor
	public Login(int nUsuarios, Usuario[] regUsuarios) {
		this.nUsuarios = nUsuarios;
		this.regUsuarios = regUsuarios;
	}
	
	//Métodos get
	public int getnUsuarios() {
		return nUsuarios;
	}
	
	public Usuario[] getRegUsuarios() {
		return regUsuarios;
	}	
	
	//Métodos set
	public void setnUsuarios(int nUsuarios) {
		this.nUsuarios = nUsuarios;
	}
	
	public void setRegUsuarios(Usuario[] regUsuarios) {
		this.regUsuarios = regUsuarios;
	}	
	
	//Cargamos los usuarios de los archivos	
	public static Login cargarUsuarios() throws FileNotFoundException {
		int numPer = 0;
		String nombre;
		String password;
		int nJuegos;
		int[] puntajes;
		File f1 = new File("Usuarios.txt");
		Scanner s1 = new Scanner(f1);
		
		//Creamos el arreglo de usuarios
		Usuario[] arr1;
		
		//Vemos si el archivo está vacío
		if(s1.hasNext()) {
			//Llenamos los datos
			numPer = Integer.parseInt(s1.nextLine());			
			//Creamos un arreglo de usuarios
			arr1 = new Usuario[numPer];			
			//Llenamos arreglo de usuarios
			for (int i = 0; i < numPer; i++) {
				//Leemos del archivo
				nombre = s1.next();				
				password = s1.next();
				nJuegos = Integer.parseInt(s1.next());
				//Creamos arreglo de puntajes
				puntajes = new int[nJuegos];
				for (int j = 0; j < nJuegos; j++) {					
					puntajes[j] = Integer.parseInt(s1.next());
				}				
				//Agregamos los valores al arreglo de usuarios
				arr1[i] = new Usuario(nombre, password, nJuegos, puntajes);
			}			
		}else {
			arr1 = new Usuario[numPer];			
		}
		
		//Creamos el Login
		Login log1 = new Login(numPer, arr1);
		return log1;
	}
	
	//Vemos el contenido del Login
	public void verContenidoLogin() {
		int[] points;
		System.out.println("\nLista de usuarios actuales en sistema");
		System.out.println("\nNúmero de usuarios: " + this.getnUsuarios());
		Usuario[] imp1;
		imp1 = this.getRegUsuarios();
		for (int i = 0; i < this.getnUsuarios(); i++) {
			System.out.println("\nUsuario " + (i+1) + ": " + imp1[i].getNombre());
			System.out.println("\nContraseña: " + imp1[i].getPassword());
			System.out.println("\nPuntajes: ");
			for (int j = 0; j < imp1[i].getnJuegos(); j++) {
				points = imp1[i].getPuntajes();
				System.out.print(" [" + points[j] + "] ");
			}
			System.out.println("");
		}
	}
	
	//Buscar usuario y contraseña
	public boolean buscarUsuario(String name, String pase) {
		Usuario[] search;
		boolean encontrado = false;
		int cont1, cont2;
		
		//Inicializamos variables
		cont1 = 0;
		cont2 = 0;
		search = this.getRegUsuarios();
		
		//Buscamos el nombre
		for (int i = 0; i < this.getnUsuarios(); i++) {			
			if ((search[i].getNombre()).equals(name)) {
				cont1++;
			}
			if ((search[i].getPassword()).equals(pase)) {
				cont2++;
			}			
		}
		if((cont1 == 1) && (cont2 == 1)){
			encontrado = true;
		}
		return encontrado;
	}
	
	//Buscar a que usuario agregar el puntaje
	public int buscarLugar(String name, String pase) {
		//Creamos objeto de busqueda y variables
		Usuario[] search;
		int lugar;
		
		
		//Inicializamos variables		
		search = this.getRegUsuarios();
		lugar = 0;
		
		//Buscamos el nombre
		for (int i = 0; i < this.getnUsuarios(); i++) {			
			if ((search[i].getNombre()).equals(name)) {
				if ((search[i].getPassword()).equals(pase)) {
					lugar = i;
				}
			}					
		}		
		return lugar;
	}
	
	//Agregamos un nuevo usuario
	public boolean agregarUsuario(String newNombre, String newPase) {
		//Declaramos variables		
		boolean crear;
		int cantUs;
		int[] puntajes;
		
		//Buscamos si ya existe ese Usuario
		crear = this.buscarUsuario(newNombre, newPase);
		
		//Creamos o no un nuevo usuario
		if (crear == false) {
			//Aumentamos tamaño de arreglo
			this.setnUsuarios(this.getnUsuarios() + 1);			
			cantUs = this.getnUsuarios();
			
			//Creamos arreglo de apoyo
			Usuario[] agr1;
			agr1 = Arrays.copyOf(this.getRegUsuarios(), cantUs);
			
			//Llenamos los datos y los agregamos al registro
			puntajes = new int[cantUs];
			agr1[cantUs-1] = new Usuario(newNombre, newPase, 0, puntajes);
			
			//Agregamos el nuevo registro al login
			this.setRegUsuarios(agr1);
			
			//Avisamos que si se creo el usuario
			crear = true;
		}else{
			//Avisamos que no se creó el usuario
			crear = false;
		}
		return crear;
	}		
	
	//Agregamos puntaje, el número de Juego es el que hay antes de agregar el nuevo
	public boolean agregarPuntaje(String name, String pase, int noJuego, int score) {
		//Varuables
		int lugar, numScore;
		boolean agregado;
		
		//Inicializamos variables
		lugar = 0;
		agregado = false;
		
		//Busacamos si existe el usuario
		if (this.buscarUsuario(name, pase)) {
			//Buscamos la ubicación del usuario
			lugar = this.buscarLugar(name, pase);
			Usuario[] arr1;
			arr1 = this.getRegUsuarios();
			//Aumentamos la cantidad de juegos jugados
			arr1[lugar].setnJuegos(noJuego + 1);
			
			//Agregamos el nuevo puntaje a el registro			
			int[] scores;			
			scores = Arrays.copyOf(arr1[lugar].getPuntajes(), arr1[lugar].getnJuegos());
			
			//Agregamos el puntaje
			numScore = arr1[lugar].getnJuegos() - 1;
			scores[numScore] = score;
			
			//Agregamos el nuevo de registro de puntos
			arr1[lugar].setPuntajes(scores);
			
			//Avisamos que fue creado
			agregado = true;
		}
		return agregado;
	}
	
	//Guardamos en el archivo los usuarios
	public void guardarUsuarios() throws IOException {
		//Declaramos variables		
		File F1 = new File("Usuarios.txt");
		FileWriter fw = new FileWriter(F1);
		int[] points;
		Usuario[] save;
		
		//Inicializanos variables		
		save = this.getRegUsuarios();		
		fw.write(this.getnUsuarios() + "\n");
		
		for (int i = 0; i < this.getnUsuarios(); i++) {
			fw.write(save[i].getNombre() + "\n");
			fw.write(save[i].getPassword() + "\n");
			fw.write(save[i].getnJuegos() + "\n");
			for (int j = 0; j < save[i].getnJuegos(); j++){
				points = save[i].getPuntajes();
				fw.write(points[j] + "\n");				
			}			
		}		
		fw.close();				
	}
}