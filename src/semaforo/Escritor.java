package semaforo;

public class Escritor extends Thread {
	private int numeroEscritor;
	private int dadoEscrito;
	
	public Escritor(int numeroEscritor) {
		this.numeroEscritor = numeroEscritor;
	}
	
	@Override
	public void run() {
		LeitorEscritorSemaforo leitorEscritorSemaforo = new LeitorEscritorSemaforo();
		while (true) {
			this.dadoEscrito = leitorEscritorSemaforo.escreverDado();
			System.out.println("Escritor " + this.numeroEscritor + " escreveu " + this.dadoEscrito);
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int getNumeroEscritor() {
		return numeroEscritor;
	}

	public void setNumeroEscritor(int numeroEscritor) {
		this.numeroEscritor = numeroEscritor;
	}

	public int getDadoEscrito() {
		return dadoEscrito;
	}

	public void setDadoEscrito(int dadoEscrito) {
		this.dadoEscrito = dadoEscrito;
	}

}
