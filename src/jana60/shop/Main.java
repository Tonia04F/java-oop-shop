package jana60.shop;

public class Main {

	public static void main(String[] args) {
		/*metodo main dove istanziare degli oggetti Prodotto e chiamarne i vari metodi (i valori degli attributi possono essere scelti arbitrariamente da voi programmatori) */ 

		//creo nuovi prodotti
		Prodotto iphone = new Prodotto("xr","iphone", 800, 18);
		Prodotto samsung = new Prodotto("s21","samsung",750, 18);
		Prodotto pc = new Prodotto("macBookAir","macos", 1400,18);

		Prodotto[] prodotti = new Prodotto[3];
		prodotti[0]= iphone;
		prodotti[1]=samsung;
		prodotti[2]= pc;
		
		//aggiungo metodi ai prodotti
		for(int i = 0; i < prodotti.length; i++) {
			
		System.out.println(prodotti[i].restituisciStringa());
		
		}
		
	}

}
