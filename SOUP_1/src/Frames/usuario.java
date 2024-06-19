
package Frames;

/**
 * @(#)Usuario.java
 *
 *
 * @author Samuel López
 * @version 1.00 2022/4/26
 */
class Usuario {
	
	//Atributos	
	private String nombre;
	private String password;
	private int nJuegos;
	private int[] puntajes;

	//Métodos
	//Constructor
	public Usuario(String nombre, String password, int nJuegos, int[] puntajes) {
		this.nombre = nombre;
		this.password = password;
		this.nJuegos = nJuegos;
		this.puntajes = puntajes;
	}
	
	//Métodos get
	public String getNombre() {
		return nombre;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getnJuegos() {
		return nJuegos;
	}
	
	public int[] getPuntajes() {
		return puntajes;
	}
	
	//Métodos set
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setnJuegos(int nJuegos) {
		this.nJuegos = nJuegos;
	}

	public void setPuntajes(int[] puntajes) {
		this.puntajes = puntajes;
	}	
}