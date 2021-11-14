package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(mappe + filnavn);

			writer.println(samling.toString());
			return true;


		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Filen kan ikke Åpnes");
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
		return false;

	}
}
