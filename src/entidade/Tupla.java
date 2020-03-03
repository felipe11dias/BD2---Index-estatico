package entidade;

import java.util.concurrent.atomic.AtomicInteger;

public class Tupla {
	
	private static AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String palavra;
	
	public Tupla(String palavra) {
		super();
		this.id = count.incrementAndGet(); 
		this.palavra = palavra;
	}	
	
	public int getId() {
		return this.id;
	}
	
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

}
