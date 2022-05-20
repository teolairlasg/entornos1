package calculadora;

public class Calculadora {
	int num1;
	int num2;
	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int suma() {
		return num1+num2;
	}
	public void imprimirSuma() {
		System.out.println(num1+num2);
	}
	
	public int sumaLenta() throws InterruptedException {
		//duerme 1 segundo
		Thread.sleep(1000);
		return num1+num2;
	}
	
	
	public void imprimirSumaLarga() {
		System.out.println("Suma: "+num1+"+"+num2+"=");
		System.out.println(num1+num2);
	}
	
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
