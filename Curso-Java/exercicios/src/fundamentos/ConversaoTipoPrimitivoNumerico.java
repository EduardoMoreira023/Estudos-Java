package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // Conversão Implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888888 ; // Conversão Explícita
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;	// explícita (CAST)
		System.out.println(f);
		
	}

}
