package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

import java.util.ArrayList;

public class Blogg {
	private Innlegg[] innleggs;
	private int nesteLedig;

	// TODO: objektvariable 

	public Blogg() {
		this.innleggs = new Innlegg[20];
		this.nesteLedig = 0;
	}

	public Blogg(int lengde) {
		this.innleggs = new Innlegg[lengde];
		this.nesteLedig = 0;
	}

	public int getAntall() {
		return this.nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggs;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < this.nesteLedig; i++) {
			if (innlegg.erLik(innleggs[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < this.nesteLedig; i++) {
			if (innlegg.erLik(innleggs[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggs.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (!(finnes(innlegg))) {
			for (int i = 0; i < innleggs.length; i++) {
				if (innleggs[i] == null) {
					innleggs[i] = innlegg;
					nesteLedig++;
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		String returnString = "";
		for (Innlegg innlegg: innleggs) {
			if (innlegg != null) {
				returnString += innlegg.toString();
			}
		}
		return getAntall() + "\n" + returnString;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}