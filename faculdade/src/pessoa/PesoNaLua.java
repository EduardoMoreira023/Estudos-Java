package pessoa;

public class PesoNaLua {
	
	public static void main (String args[]) {

		int polegadas, metros;
		int counter;

		counter = 0;
		for(polegadas = 1; polegadas <= 144; polegadas++) {
		metros = (int) (polegadas / 39.37);
		System.out.println(polegadas + " polegadas eh igual ah " + metros + " metros.");

		counter ++;

		if (counter == 12) {
		System.out.println();
		counter = 0;
		}
		}
		}

	

}
