
public class NormalK {
 private Sachbearbeiter sbk = new Sachbearbeiter();
 public String[] gibSacharbeiterNamen() {
	 return Sachbearbeiter.gibAlleNamen();
 }
 public void kopiereSachbearbeiter(Sachbearbeiter sb) {
	 sbk.kopiereAttribute(sb);
 }
 public void schreibeSacharbeiter(Sachbearbeiter sb) {
	 sb.kopiereAttribute(sbk);
 }
 
}
