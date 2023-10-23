package com.main;

import com.bean.*;

public class MainApplication {

	public static void main(String args[]) {
		// Quelle parentesi quadre servono per far sapere
		// al compilatore che si vuole salvare più di un dato
		// in quella variabile
		/*
		 * L'array è un oggetto che contiene più locazioni di memoria. Quando viene
		 * inizializzato un array in questo caso arrayInt è una reference che andrà a
		 * finire all'interno dello stack della JVM, mentre le locazioni di memoria
		 * effettive nell'heap
		 */
		// Inizializzazione; 1 modalità di 2
		int arrayInt[] = new int[3];

		// Valorizzazione
		arrayInt[0] = 89;
		arrayInt[1] = 50;
		arrayInt[2] = 10;

		for (int i = 0; i < arrayInt.length; i++) {

			System.out.println(arrayInt[i]);

		}

		// Inizializzazione; 2 modalità di 2

		int arrayNew[] = { 10, 20, 30 };

		for (int i = 0; i < arrayNew.length; i++) {

			System.out.println(arrayNew[i]);

		}

		/*
		 * Array di reference a un oggetto
		 */
		Corso corsi[] = new Corso[3];
		corsi[0] = new Corso("1028x", "JavaSE", "Roma");
		corsi[1] = new Corso("1029x", "JavaEE", "Torino");
		corsi[2] = new Corso("1030x", "Spring", "Milano");
		
		//Per ogni "variabile" Corso in corsi esegue il corpo
		//del ciclo for 
		for (Corso corso : corsi) {
			
			System.out.println(corso.toString());
			
		}
		
		/*
		 * Gli array possono contenere solo elementi dello stesso tipo
		 * ad esempio reference dello stesso tipo.
		 * Si può usare però il polimorfismo per aggirare questa regola
		 * tutte le classi create hanno un padre in comune: Object
		 */

		Object arrayCA [] = new Object[2];
		
		arrayCA[0] = new Corso("1023hgv", "Java", "Firenze");
		arrayCA[1] = new Academy ("102030","Microservizi","Formatemp","Genova");
		
		for (Object object : arrayCA) {
			
			System.out.println(object.toString());
			
		}
		
	}
	
}
