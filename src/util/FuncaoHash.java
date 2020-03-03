package util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.List;

public class FuncaoHash {
	
	private int funcaoHash(int codigoBusca) {
		String p = "teste";
		try {
			byte[] bytes = p.getBytes("US-ASCII");
			int ascii = ByteBuffer.wrap(bytes).getInt();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return codigoBusca;
	}
	
	public List<String> trasnformarArquivoEmList() {
		return null;
	}
	
	public List<String> embaralharPalavras(List<String> palavras) {
		return null;
	}
	
	
	// depois fazer um FOR instanciando as tuplas

}
