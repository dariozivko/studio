package studio.selezionatore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Random;

public class SelezionatoreMain {
	private static ArrayList<String> _partecipanti = new ArrayList<String>(Arrays.asList("stefano", "gennario", "deca", "tia", "vacca", "enri", "manlio", "ale", "chicco", "matteo", "pino", "massi", "gabri"));

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Partecipanti totali: " + listaPartecipanti());
		
		ArrayList<String> assenti = new ArrayList<String>(Arrays.asList(args[0].split(",")));
		ArrayList<String> aggiunti = new ArrayList<String>(Arrays.asList(args[1]));
		
		PrintWriter writer = new PrintWriter(new File("/Data/Reporting/Dario/studio/assenti.txt"));
		
		for (String assente : assenti) {
			writer.append(assente + " " + new GregorianCalendar().getTime().toString());
			writer.println();
			rimuoviPartecipante(assente);
		}
		
		writer.close();
		
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
