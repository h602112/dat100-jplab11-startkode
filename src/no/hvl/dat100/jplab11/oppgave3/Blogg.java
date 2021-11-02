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
		int indeks = 0;
		for (Innlegg inlegg: this.innleggs) {
			if (inlegg.erLik(innlegg)) {
				return indeks;
			}
			indeks++;
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		while (this.innleggs != null) {
			for (Innlegg inlegg : this.innleggs) {
				if (inlegg.erLik(innlegg)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggs.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		while (!(finnes(innlegg)) && ledigPlass()) {
			this.innleggs[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
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