package calculadora;

public class Calculadora {
	int num1;
	int num2;
	
	/**
	 * 
	 * @param num1 Es un número entero
	 * @param num2 Es un número entero
	 */
	
	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * @return Devuelve la suma de los números num1
	 *  y num2 que son atributos del objeto.
	 */
	
	public int suma() {
		return num1+num2;
	}
	public void imprimirSuma() {
		System.out.println(num1+num2);
	}
	
	/**
	 * 
	 * @return la suma de los números <b>con</b> un segundo de retardo
	 * @throws InterruptedException esto lo lanza el método 
	 * sleep de la clase Thread
	 * 
	 * <pre>
	 * {@code 
	 * public int sumaLenta() throws InterruptedException {
	 *    //duerme 1 segundo
	 *    Thread.sleep(1000);
	 *    return num1+num2;
	 *}
	 * }
	 * </pre>
	 */
	
	
	
	public int sumaLenta() throws InterruptedException {
		//duerme 1 segundo
		Thread.sleep(1000);
		return num1+num2;
	}
	
	
	/**
	 * 
	 */
	
	public void imprimirSumaLarga() {
		System.out.println("Suma: "+num1+"+"+num2+"=");
		System.out.println(num1+num2);
	}
	
	/**
	 * 
	 * @return 
	 */
	
	public int resta() {
		return num1-num2;
	}
	public int producto() {
		return num1*num2;
	}
	public double division() {
		return (double)(num1)/num2;
	}
	
	public double raizNum1() {
		return Math.sqrt(num1);
	}
	public double raizNum2() {
		return Math.sqrt(num2);
	}
}
