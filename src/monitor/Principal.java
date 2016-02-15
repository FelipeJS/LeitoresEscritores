package monitor;

public class Principal {

	public static void main(String[] args) {
		Leitor leitor1 = new Leitor(1);
		Leitor leitor2 = new Leitor(2);
		Escritor escritor1 = new Escritor(1);
		Escritor escritor2 = new Escritor(2);
		
		escritor1.start();
		escritor2.start();
		leitor1.start();
		leitor2.start();
	}
}
