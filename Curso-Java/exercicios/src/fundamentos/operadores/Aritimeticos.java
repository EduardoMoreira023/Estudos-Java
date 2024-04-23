package fundamentos.operadores;

public class Aritimeticos {

	public static void main(String[] args) {
		
		System.err.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);   // Ambas foram feito o CAST para serem exibidas como double e float!!!
		System.out.println(a / (float) b);
		
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b);

		
		
		
		

	
		
	

	}

}
