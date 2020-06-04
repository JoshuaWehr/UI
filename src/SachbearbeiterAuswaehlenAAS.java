import java.util.*;

public class SachbearbeiterAuswaehlenAAS {
	static String e1;
	
	public static Sachbearbeiter oeffnen() {
		System.out.println("Bitte einen der Folgenden Nutzer auswaehlen:");
		for(int i = 0; i < Sachbearbeiter.gibAlleNamen().length; i++) {
			System.out.println(Sachbearbeiter.gibAlleNamen()[i]);
		}
		e1 = Main.s.next();
		Sachbearbeiter sb = new Sachbearbeiter();
		for(String s: Sachbearbeiter.gibAlleNamen()) {
			if(e1.equals(s)) {
			sb.kopiereAttribute(Sachbearbeiter.selectSachbearbeiter(s));
			}
		}
		return sb;
	}
}

