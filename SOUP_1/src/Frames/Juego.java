    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
/**
 * 
 *
 * @author eliza
 */
public class Juego extends javax.swing.JFrame {
	private  int Filas = 15; //Filas de la matriz de botones
	private  int Columnas = 15; //Columnas de la matriz de botones
    private String words[];
	private javax.swing.JButton[][] Cuadro;// se declara matriz de botones
	
	//Variables para majenar captura de palabras
	CapturarPalabras[] captura = new CapturarPalabras[10];
	int indiceCaptura = 0;
    
	//Crear los objetos de la captura de palabras
	public void crearObjetosCaptura() {
		for (int i = 0; i < 10; i++) {
			captura[i] = new CapturarPalabras();
		}
	}
	
    /**
     * Creates new form Juego
     */
    public Juego() throws FileNotFoundException {
        initComponents();
        this.Text.setText("ENCUENTRA LAS 10 PALABRAS  ");
		this.crearObjetosCaptura();
        setMatrix();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        Cargar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombreSopaTitulo = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cargar.setText("Cargar Sopa");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar Palabra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        panelBotones.setBackground(new java.awt.Color(255, 255, 153));
        panelBotones.setAutoscrolls(true);
        panelBotones.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        Text.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 48)); // NOI18N
        jLabel1.setText("SOPA DE LETRAS");

        nombreSopaTitulo.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        nombreSopaTitulo.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreSopaTitulo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(Cargar)
                            .addComponent(jButton3))
                        .addGap(33, 33, 33)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(nombreSopaTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addGap(32, 32, 32)
                .addComponent(Cargar)
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public static char[][] leerSopaMatriz(String nombre) throws FileNotFoundException {
		//Declaramos variables
		int a, b, fila, columna, temp;
		boolean key;
		String cad = "";
		fila = 0;
		columna = 0;
		key = false;
		
		//Creamos objetos para leer el archivo
		File sopaTxt = new File(nombre);
		Scanner sopaMat = new Scanner(sopaTxt);
		File sopaTxt1 = new File(nombre);
		Scanner sopaMat1 = new Scanner(sopaTxt1);
		File sopaTxt2 = new File(nombre);
		Scanner sopaMat2 = new Scanner(sopaTxt2);
		File sopaTxt3 = new File(nombre);
		Scanner sopaMat3 = new Scanner(sopaTxt2);
		File sopaTxt4 = new File(nombre);
		Scanner sopaMat4 = new Scanner(sopaTxt2);
		
		//Contamos filas
		while ((sopaMat.hasNextLine()) && (!".".equals(sopaMat3.nextLine()))) {			
			sopaMat.nextLine();
			fila++;			
		}
		
		//Guardamos número de filas
		temp = fila;		
		
		//Contamos columnas
		while ((sopaMat1.hasNextLine()) && (!".".equals(sopaMat4.nextLine()))) {
			cad = sopaMat1.nextLine();
			columna = (int) cad.chars().filter(ch -> ch != ' ').count();		
			if(temp != columna) {
				key = true;
			}
		}		
		
		//Creamos la matriz
		a = fila;
		b = columna;
		char[][] sopa;
		
		//Llenamos la matriz y vemos si esta correcta
		if((fila != columna) || key) {
			System.out.println("\nLa sopa de letras no es cuadrada o está incompleta");
			sopa = new char[0][0];
		}
		else{
			sopaMat2.reset();
			sopa = new char[a][b];
			for (int i = 0; i < fila; i++) {
				for (int j = 0; j < columna; j++) {
					sopa[i][j] = sopaMat2.next().charAt(0);					
				}				
			}
		}                                          
		return sopa;
	}
     
    
public static String[] leerPalabras(String nombre) throws FileNotFoundException {
		//Para leer el archivo
		File F1 = new File(nombre);
		Scanner S1 = new Scanner(F1);		
		//El arreglo a regresar
		String[] wordArr = new String[10];
		
		while ((S1.hasNextLine()) && (!".".equals(S1.nextLine()))) {
			//No hacemos nada solo avanzamos hasta donde estan las palabras
		}
		
		//Llenamos el arreglo
		for (int i = 0; i < 10; i++) {
			wordArr[i] = S1.nextLine();
		}
		
		return wordArr;
                  
	}
   

             
	public void setMatrix() throws FileNotFoundException{
        //variables auxiliares
        int x=5;
        int y=5;
        int  random = (int)(Math.random()*3);
     //   System.out.println(random);
		char[][] sopa;
		String[] palabras;
		String nombreSopa;
        Cuadro = new JButton[Filas][Columnas]; //define tamanio
		if (random == 1){
			nombreSopaTitulo.setText("Electrodomésticos");
			nombreSopa = "SOPA2.txt";
			
			sopa = leerSopaMatriz(nombreSopa);
			for(int i = 0; i < Filas; i++) {
				for(int j = 0; j < Columnas; j++) {
					Cuadro[i][j] = new JButton();
					Cuadro[i][j].setText(String.valueOf(sopa[i][j]));
					Cuadro[i][j].setBounds(x, y, 40, 40);            
					ButtonController b = new ButtonController();
					Cuadro[i][j].addActionListener(b);
					//Cuadro[i][j].addMouseListener(b);                                
					panelBotones.add(Cuadro[i][j]);
					x += 38;
				}
			x = 5;
            y += 38;
			}        
		} 
                
		if (random == 2) {
			nombreSopaTitulo.setText("Ciudades");
			nombreSopa = "SOPA3.txt";
			sopa = leerSopaMatriz(nombreSopa);
			for(int i = 0; i < Filas; i++){
				for(int j = 0; j < Columnas; j++){
					Cuadro[i][j] = new JButton();
					Cuadro[i][j].setText(String.valueOf(sopa[i][j]));
					Cuadro[i][j].setBounds(x, y, 40, 40);
					ButtonController b = new ButtonController();
					Cuadro[i][j].addActionListener(b);
					//Cuadro[i][j].addMouseListener(b);
					panelBotones.add(Cuadro[i][j]);
					x += 38;
				}
			x = 5;
            y += 38;
			}
		}
		
		if (random == 0){
			nombreSopaTitulo.setText("Animales");
			nombreSopa = "SOPA4.txt";
			sopa = leerSopaMatriz(nombreSopa);
			for(int i = 0; i < Filas; i++){
				for(int j = 0; j < Columnas; j++){
				Cuadro[i][j] = new JButton();
				Cuadro[i][j].setText(String.valueOf(sopa[i][j]));
				Cuadro[i][j].setBounds(x, y, 40, 40);                                
				ButtonController b = new ButtonController();
				Cuadro[i][j].addActionListener(b);
				//Cuadro[i][j].addMouseListener(b);
				panelBotones.add(Cuadro[i][j]);
				x += 38;
				}
			x = 5;
            y += 38;
			}
		}
		
		//Leemos el nombre de la sopa
	//	nombreSopa = "SOPA2.txt";
		
		//Llenamos los arreglos
	//	sopa = leerSopaMatriz(nombreSopa);
        
		//Pinta los botones de la matriz en el panel
 
          /**      for(int i = 0; i < Filas; i++){
            for(int j = 0; j < Columnas; j++){
                Cuadro[i][j] = new JButton();
				Cuadro[i][j].setText(String.valueOf(sopa[i][j]));
				Cuadro[i][j].setBounds(x, y, 40, 40);
                
                                
                                ButtonController b = new ButtonController();
                               
                                
                                Cuadro[i][j].addActionListener(b);
                             //   Cuadro[i][j].addMouseListener(b);
                                
                                panelBotones.add(Cuadro[i][j]);
				x += 38;
			}
			x = 5;
            y += 38;
		}
                */ 
	}
        
	private class ButtonController implements ActionListener{
		public void actionPerformed (ActionEvent e){
			for(int i = 0; i < Filas; i++){
				for(int j = 0; j < Columnas; j++){
					if(e.getSource().equals(Cuadro[i][j])){
						Cuadro[i][j].setBackground(Color.YELLOW);
						captura[indiceCaptura].agregarLetra(Cuadro[i][j].getText());
					}
				}
			}
		}
	}
                
                
            
            
        
      
        

        
      /**
     
        public void mousePressed(MouseEvent e){
            if (SwingUtilities.isRightMouseButton(e)){
                  for(int i = 0; i < Columnas; i++){
                for(int j = 0; j < Filas; j++){
                    if(e.getSource().equals(Cuadro[i][j])){
                        Cuadro[i][j].setBackground(Color.white);
                        Cuadro[i][j].setName("0");
                        return;
            }
            
        }
                }
                  }
            }
         
        
     */
        
	
    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
      if (panelBotones != null){
         Cargar.setEnabled(true);          
      }     
      // TODO add your handling code here:
    }//GEN-LAST:event_CargarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		indiceCaptura++;
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
		
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
				try {
					new Juego().setVisible(true);					
				} catch (FileNotFoundException ex) {
					System.out.println("Error");
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JTextField Text;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel nombreSopaTitulo;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
}
