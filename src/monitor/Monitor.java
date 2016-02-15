package monitor;

import java.util.Random;

public class Monitor {
	private int contadorLeitor = 0;
	BancoDeDados dados = BancoDeDados.getInstancia();

	public synchronized int lerDado() {
		contadorLeitor++;

		if (contadorLeitor == 1) {
			contadorLeitor--;
			return dados.getDado();
		} else {
			contadorLeitor--;
			return 0;
		}
	}

	public synchronized int escreverDado() {
		Random gerador = new Random();
		int dadoEscrito = gerador.nextInt(50);
		dados.setDado(dadoEscrito);
		return dadoEscrito;
	}
}
