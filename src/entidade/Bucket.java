package entidade;
import java.util.List;

public class Bucket {
	
	private int id;
	private List<Pagina> pagina;
	
	public Bucket(int id, List<Pagina> pagina) {
		super();
		this.id = id;
		this.pagina = pagina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Pagina> getPaginas() {
		return pagina;
	}

	public void setPaginas(List<Pagina> pagina) {
		this.pagina = pagina;
	}
}
