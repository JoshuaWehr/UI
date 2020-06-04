
public class SachbearbeiterEditierenAAS {
	private static Sachbearbeiter sb = new Sachbearbeiter();
	private static Sachbearbeiter sb1 = new Sachbearbeiter();
	private static String e1, e2;
	public static void oeffnen() {
		sb = AdminAS.sachbearbeiterAuswaehlen();
		System.out.println("Neuen Benutzernamen eingeben");
		e1 = Main.s.next();
		sb1.setName(e1);
		System.out.println("Neues Passwort eingeben");
		e2 = Main.s.next();	
		sb1.setPasswort(e2);
		SachbearbeiterEditierenK.getSachbearbeiter(sb);
		SachbearbeiterEditierenK.schreibeSachbearbeiter(sb1);
	}

}
