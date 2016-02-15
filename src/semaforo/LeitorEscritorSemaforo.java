package semaforo;

import java.util.Random;

public class LeitorEscritorSemaforo {
	private int contadorLeitor = 0;
	BancoDeDados dados = BancoDeDados.getInstancia();
	Semaforo semaforo = new Semaforo();

	public int lerDado() {
		semaforo.down();
		contadorLeitor++;

		if (contadorLeitor == 1) {
			contadorLeitor--;
			int dado = dados.getDado();
			semaforo.up();
			return dado;
		} else {
			contadorLeitor--;
			semaforo.up();
			return 0;
		}
	}

	public int escreverDado() {
		Random gerador = new Random();
		int dadoEscrito = gerador.nextInt(50);

		semaforo.down();
		dados.setDado(dadoEscrito);
		semaforo.up();
		return dadoEscrito;
	}
}
