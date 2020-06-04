
public class AdminK {
	private Sachbearbeiter sbk = new Sachbearbeiter();

	public String[] gibSachbearbeiterNamen() {
		return Sachbearbeiter.gibAlleNamen();
	}
	public Sachbearbeiter gibSachbearbeiter(String s) {
		return sbk;
	}
	public void kopiereSachbearbeiter(Sachbearbeiter sb) {
		 sbk.kopiereAttribute(sb);
	 }
	public void schreibeSachbearbeiter(Sachbearbeiter sb) {
		
		sb.kopiereAttribute(sbk);
	}

	public void loescheSachbearbeiter(String s) {
		Sachbearbeiter.sachbearbeiterEntfernen(Sachbearbeiter.selectSachbearbeiter(s));
	}
	public Sachbearbeiter erstelleSachbearbeiter(String s1, String s2, boolean b) {
		Sachbearbeiter neu = new Sachbearbeiter(s1, s2, b);
		return neu;
	}
	
}
