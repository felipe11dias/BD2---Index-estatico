package util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class Teste {

	public static void main(String[] args) {
		
		funcaoHash(0);
		

	}
	
	static private int funcaoHash(int codigoBusca) {
		String p = "teste";
		String p2 = "Essa palavra é!dadada!";
		try {
			byte[] bytes = p.getBytes("US-ASCII");
			Long ascii = ByteBuffer.wrap(bytes).getLong();
			
			byte[] bytes2 = p2.getBytes("US-ASCII");
			Long ascii2 = ByteBuffer.wrap(bytes2).getLong();
			
			System.out.println(ascii);
			System.out.println(ascii2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return codigoBusca;
	}

}
