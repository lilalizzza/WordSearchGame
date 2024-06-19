/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class login {
    
    
	//Atributos
	private int nUsuarios;
	private Usuario[] regUsuarios;
	
	//Métodos
	//Constructor
	public login(int nUsuarios, Usuario[] regUsuarios) {
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
    
}
