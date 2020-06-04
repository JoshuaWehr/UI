
public class SachbearbeiterLoeschenK {
	public static void adminSachbearbeiterLoeschen(Sachbearbeiter sb) {		
		System.out.println("Sachbeabeiter " + sb.getName() + " wird gelöscht \n");
		Sachbearbeiter.sachbearbeiterEntfernen(Sachbearbeiter.selectSachbearbeiter(sb.getName()));
	}
}
