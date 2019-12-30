/*
 * Clase ModeloCalculadora, simula una calculadora muy sencilla.
 * Permite realizar la suma y la resta de dos n�meros enteros.
 * Fue constru�da siguiendo las reglas del patr�n "Singleton"
 * con instanciaci�n diferida.
 */
package modelo;

/**
 *
 * @author malico
 * @version (V.1)
 */
public class ModeloCalculadora {
    // variable de instancia del tipo de la misma clase (patron Singleton)
    private static ModeloCalculadora modeloCalculadora = null;  
    /**
     * Constructor de la clase ModeloCalculadora, con acceso privado
     */
    private ModeloCalculadora(){
    }
    /**
     * Metodo para obtener la instancia (y crearla si fuera necesario)
     * de la clase
     * 
     * @return ModeloCalculadora La instancia de la clase creada 
     *                           (�nica existente por patron Singleton)
     */
    public static ModeloCalculadora getInstanciaModeloCalculadora() {
        if (modeloCalculadora == null) {
            synchronized (ModeloCalculadora.class) {
                if (modeloCalculadora == null) {
                    modeloCalculadora = new ModeloCalculadora();
		}
            }
	}   
        return modeloCalculadora;
    }
    /**
     * Metodo que permite obtener el resultado de la suma de
     * dos n�meros enteros
     * 
     * @param primerNumero   int El primer sumando
     * @param segundoNumero  int El segundo sumando
     * @return int El resultado de la suma
     */
    public int sumar(int primerNumero, int segundoNumero) {
	return primerNumero + segundoNumero;
    } 
    /**
     * Metodo que permite obtener el resultado de la resta de
     * dos n�meros enteros
     * 
     * @param primerNumero   int El minuendo (primer valor de la resta)
     * @param segundoNumero  int El sustraendo (segundo valor de la resta)
     * @return int El resultado de la resta
     */
    public int restar(int primerNumero, int segundoNumero) {
	return primerNumero - segundoNumero;
    } 
}
