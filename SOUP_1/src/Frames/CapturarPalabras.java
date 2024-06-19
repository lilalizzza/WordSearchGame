
package Frames;

/**
 *
 * @author Samuel López
 */
public class CapturarPalabras {
	String palabra;

	public CapturarPalabras() {
		palabra = "";
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public void agregarLetra(String letra) {
		palabra = palabra + letra;
	}
	
}
