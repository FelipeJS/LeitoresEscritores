package monitor;

public class Leitor extends Thread {
	private int numeroLeitor;
	private int dadoLido;
	
	public Leitor(int numeroLeitor) {
		this.numeroLeitor = numeroLeitor;
	}
	
	@Override
	public void run() {
		Monitor monitor = new Monitor();
		while (true) {
			this.dadoLido = monitor.lerDado();
			System.out.println("Leitor " + this.numeroLeitor + " leu " + this.dadoLido);
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int getNumeroLeitor() {
		return numeroLeitor;
	}

	public void setNumeroLeitor(int numeroLeitor) {
		this.numeroLeitor = numeroLeitor;
	}

	public int getDadoLido() {
		return dadoLido;
	}

	public void setDadoLido(int dadoLido) {
		this.dadoLido = dadoLido;
	}

}
