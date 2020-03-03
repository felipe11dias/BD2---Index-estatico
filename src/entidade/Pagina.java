package entidade;
import java.util.List;

public class Pagina {
	
	private int qtd_tuplas;
	private List<Tupla> tuplas;
	
	public Pagina(int qtd_tuplas, List<Tupla> tuplas) {
		super();
		this.qtd_tuplas = qtd_tuplas;
		this.tuplas = tuplas;
	}

	public int getQtd_tuplas() {
		return qtd_tuplas;
	}

	public void setQtd_tuplas(int qtd_tuplas) {
		this.qtd_tuplas = qtd_tuplas;
	}

	public List<Tupla> getTuplas() {
		return tuplas;
	}

	public void setTuplas(List<Tupla> tuplas) {
		this.tuplas = tuplas;
	}
	
}
