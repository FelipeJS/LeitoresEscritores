package semaforo;

public class Leitor extends Thread {
	private int numeroLeitor;
	private int dadoLido;
	
	public Leitor(int numeroLeitor) {
		this.numeroLeitor = numeroLeitor;
	}
	
	@Override
	public void run() {
		LeitorEscritorSemaforo leitorEscritorSemaforo = new LeitorEscritorSemaforo();
		while (true) {
			this.dadoLido = leitorEscritorSemaforo.lerDado();
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
