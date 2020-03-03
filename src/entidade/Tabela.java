package entidade;
import java.util.List;

public class Tabela {
	
	private String nameTable;
	private List<Tupla> tuplas;
	
	public Tabela(String nameTable, List<Tupla> tuplas) {
		super();
		this.nameTable = nameTable;
		this.tuplas = tuplas;
	}

	public String getNameTable() {
		return nameTable;
	}

	public void setNameTable(String nameTable) {
		this.nameTable = nameTable;
	}

	public List<Tupla> getTuplas() {
		return tuplas;
	}

	public void setTuplas(List<Tupla> tuplas) {
		this.tuplas = tuplas;
	}
	
}
