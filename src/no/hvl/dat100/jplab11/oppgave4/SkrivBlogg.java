package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean ok = false;
		try {
			PrintWriter skriver = new PrintWriter(mappe + filnavn);
			skriver.write(samling.toString());
			skriver.close();
			ok = true;
			return ok;
		} catch (Exception e) {
			System.out.printf("Exception: " + e.getMessage());
		}
		return ok;

	}
}
