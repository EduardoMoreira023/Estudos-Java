package fundamentos;

public class PrimitivosVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		
		// Wrappers são a versão objeto dos tipos primitivos!!!!!!!
		
		// Obs: Tudo em JAVA é objeto, menos os tipos primitivos!!!!
		
		int a = 123;
		System.out.println(a);
	}

}
