package semaforo;

public class BancoDeDados {
	private static BancoDeDados instancia;
	private int dado;

	private BancoDeDados() {
	}

	public static synchronized BancoDeDados getInstancia() {
		if (instancia == null) {
			instancia = new BancoDeDados();
		}
		return instancia;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

}
