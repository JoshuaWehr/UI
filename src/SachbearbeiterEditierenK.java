
public class SachbearbeiterEditierenK {
	private static Sachbearbeiter sbk = new Sachbearbeiter();

	public static void getSachbearbeiter(Sachbearbeiter s) {
		sbk = Sachbearbeiter.selectSachbearbeiter(s.getName());
	}
	public static void schreibeSachbearbeiter(Sachbearbeiter sb) {
		
		sbk.kopiereAttribute(sb);
	}
	
}
