package studio.selezionatore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SelezionatoreMain {
	private static ArrayList<String> _partecipanti = new ArrayList<String>(Arrays.asList("dario", "stefano", "gennario", "deca", "tia", "vacca", "enri", "manlio", "ale", "chicco", "matteo", "pino", "massi", "gabri"));

	public static void main(String[] args) {
		System.out.println("Partecipanti totali: " + listaPartecipanti());
		
		ArrayList<String> assenti = new ArrayList<String>(Arrays.asList(args[0].split(",")));
		ArrayList<String> aggiunti = new ArrayList<String>(Arrays.asList(args[1]));
		
		for (String assente : assenti) {
			rimuoviPartecipante(assente);
		}
		
		aggiungiNuovi(aggiunti);
		
		System.out.println("Partecipanti presenti alla presentazione: " + listaPartecipanti());
		System.out.println("Partecipante scelto per la presentazione: " + presentatore());

	}

	private static void aggiungiNuovi(ArrayList<String> aggiunti) {
		_partecipanti.addAll(aggiunti);
		
	}

	private static String presentatore() {
			return _partecipanti.get(new Random(System.nanoTime()).nextInt(_partecipanti.size()));
	}

	private static void rimuoviPartecipante(String assente) {
		_partecipanti.remove(assente);
		
	}

	private static String listaPartecipanti() {
		String listaPartecipanti = new String("");
		
		for (String partecipante : _partecipanti) {
			listaPartecipanti = listaPartecipanti + partecipante + " ";
		}
		
		return listaPartecipanti;
	}

}
