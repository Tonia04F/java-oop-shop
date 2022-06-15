package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
/*classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
-marca
-nome
-prezzo
-iva
Scegliere opportunamente il tipo di dato per gli attributi
Aggiungere un costruttore che inizializza tutti gli attributi.
Aggiungere dei metodi per:
-calcolare il prezzo comprensivo di iva
-formattare il prezzo restituendo una stringa con un determinato numero di decimali e il carattere €*/

	
	//ATTRIBUTI
	String marca;
	String nome;
	double prezzoBase;
	double iva;
	
	//importo la classe decimal format per restituire la strunga con prezzo e simbolo euro
	DecimalFormat df = new DecimalFormat ("#.00€");
	
	//COSTRUTTORE
	public Prodotto(String marca, String nome, double prezzoBase, double iva) {
		
		this.marca = marca;
		this.nome = nome;
		this.prezzoBase = prezzoBase;
		this.iva = iva;
	}
	
	//METODI
	public double prezzoIva(){
		//calcolare il prezzo comprensivo di iva
		double prezzoIva = prezzoBase + (prezzoBase/100)*iva;//posso inserire la funzione anche nel return direttamente
		return prezzoIva;	
	}
	
	public String restituisciStringa() {
		
		return "Il prezzo del prodotto con iva calcolata è: "+ nome + marca + df.format(prezzoIva());
	}
	


}
