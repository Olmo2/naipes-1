package edu.fleming.daw.naipes;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

	private static ArrayList<Naipe> naipes = new ArrayList<Naipe>();
	
	public int numeroNaipes() {
		naipes.size();
		return naipes.size();
	}
	
	public static void LlenarMazo() {
		//PICAS
			naipes.add(new Naipe(Palo.PICAS, Id.AS, 1));
			naipes.add(new Naipe(Palo.PICAS, Id.DOS, 2));
			naipes.add(new Naipe(Palo.PICAS, Id.TRES, 3));
			naipes.add(new Naipe(Palo.PICAS, Id.CUATRO, 4));
			naipes.add(new Naipe(Palo.PICAS, Id.CINCO, 5));
			naipes.add(new Naipe(Palo.PICAS, Id.SEIS, 6));
			naipes.add(new Naipe(Palo.PICAS, Id.SIETE, 7));
			naipes.add(new Naipe(Palo.PICAS, Id.OCHO, 8));
			naipes.add(new Naipe(Palo.PICAS, Id.NUEVE, 9));
			naipes.add(new Naipe(Palo.PICAS, Id.DIEZ, 10));
			naipes.add(new Naipe(Palo.PICAS, Id.J, 11));
			naipes.add(new Naipe(Palo.PICAS, Id.Q, 12));
			naipes.add(new Naipe(Palo.PICAS, Id.K, 13));
		//TREBOLES
			naipes.add(new Naipe(Palo.TREBOLES, Id.AS, 1));
			naipes.add(new Naipe(Palo.TREBOLES, Id.DOS, 2));
			naipes.add(new Naipe(Palo.TREBOLES, Id.TRES, 3));
			naipes.add(new Naipe(Palo.TREBOLES, Id.CUATRO, 4));
			naipes.add(new Naipe(Palo.TREBOLES, Id.CINCO, 5));
			naipes.add(new Naipe(Palo.TREBOLES, Id.SEIS, 6));
			naipes.add(new Naipe(Palo.TREBOLES, Id.SIETE, 7));
			naipes.add(new Naipe(Palo.TREBOLES, Id.OCHO, 8));
			naipes.add(new Naipe(Palo.TREBOLES, Id.NUEVE, 9));
			naipes.add(new Naipe(Palo.TREBOLES, Id.DIEZ, 10));
			naipes.add(new Naipe(Palo.TREBOLES, Id.J, 11));
			naipes.add(new Naipe(Palo.TREBOLES, Id.Q, 12));
			naipes.add(new Naipe(Palo.TREBOLES, Id.K, 13));
			//DIAMANTES
			naipes.add(new Naipe(Palo.DIAMANTES, Id.AS, 1));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.DOS, 2));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.TRES, 3));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.CUATRO, 4));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.CINCO, 5));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.SEIS, 6));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.SIETE, 7));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.OCHO, 8));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.NUEVE, 9));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.DIEZ, 10));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.J, 11));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.Q, 12));
			naipes.add(new Naipe(Palo.DIAMANTES, Id.K, 13));
			//CORAZONES
			naipes.add(new Naipe(Palo.CORAZONES, Id.AS, 1));
			naipes.add(new Naipe(Palo.CORAZONES, Id.DOS, 2));
			naipes.add(new Naipe(Palo.CORAZONES, Id.TRES, 3));
			naipes.add(new Naipe(Palo.CORAZONES, Id.CUATRO, 4));
			naipes.add(new Naipe(Palo.CORAZONES, Id.CINCO, 5));
			naipes.add(new Naipe(Palo.CORAZONES, Id.SEIS, 6));
			naipes.add(new Naipe(Palo.CORAZONES, Id.SIETE, 7));
			naipes.add(new Naipe(Palo.CORAZONES, Id.OCHO, 8));
			naipes.add(new Naipe(Palo.CORAZONES, Id.NUEVE, 9));
			naipes.add(new Naipe(Palo.CORAZONES, Id.DIEZ, 10));
			naipes.add(new Naipe(Palo.CORAZONES, Id.J, 11));
			naipes.add(new Naipe(Palo.CORAZONES, Id.Q, 12));
			naipes.add(new Naipe(Palo.CORAZONES, Id.K, 13));
	}
	
	public static void VaciarMazo(){
		naipes.removeAll(naipes);
	}
	
	public Naipe getNaipe() {
		System.out.println(naipes.get(0));
		return null;
	}
	
	

	public static void main(String[] args) {
	 LlenarMazo();
	 System.out.println(naipes);
	 VaciarMazo();
	 System.out.print(naipes);
	}
}
