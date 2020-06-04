
public class FortbildungszuordnungBearbeitenAAS {
	private static Sachbearbeiter sb = new Sachbearbeiter();
	static String str="";
	
	public static void oeffnen() {
		System.out.println("Bitte Sachbearbeiter Auswaehlen:");
	sb.kopiereAttribute(SachbearbeiterAuswaehlenAAS.oeffnen());
	for(String s1 : Fortbildung.gibAlleFortbildungen() ) {
		System.out.println(s1);
	}
	System.out.println("Bitte Fortbildung auswahlen");
	str = Main.s.next();
	for(String st : sb.gibFortbildungenSb() ) {
		if(st.equals(str)) {
			Fortbildung.gibKopie(str);
			}
		}
	sb.gibFortbildungenSb();
	}
	
	public void schlieﬂen() {
		
	}
	public void abbrechen() {
		
	}
	public void ausfuehren() {
		
	}
}
