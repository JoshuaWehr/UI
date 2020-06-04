
public class SachbearbeiterAuswaehlenK {

	
public static Sachbearbeiter gibSachbearbeiter(String s) {
		for(String sb : Sachbearbeiter.gibAlleNamen()) {
			if(s.equals(sb)) {
				Sachbearbeiter sb2 = Sachbearbeiter.selectSachbearbeiter(s);
			}
		}
		return sb2;
	}
}
