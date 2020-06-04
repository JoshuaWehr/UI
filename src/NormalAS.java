import java.util.*;
public class NormalAS {
	private static Scanner s = new Scanner(System.in);
	private static String e1;
public static boolean login() {
	if(LoginK.isEingeloggt()&&!LoginK.getEingeloggt().isAdmin() ) {
		return true;
		}
		else {
			System.out.println("Falsche Anmeldedaten");
			return false;
		}
}

public static void SachbearbeiterEditieren(){ 
	SachbearbeiterEditierenAAS.NormalEditiereSachbearbeiter();
	}

public static void SachbearbeiterAuswaehlen(){ 
	SachbearbeiterAuswaehlenAAS.selektiereSachbearbeiter();
}

public static void FortbildungZuweisen() {
	FortbildungZuweisenAAS.getInstance().oeffnen();
	}

public static void FortbildungAuswaehlen() {
	FortbildungAuswaehlenAAS.getInstance().oeffnen();
	}

public static void FortbildungBestehen() {
	FortbildungBestehenAAS.getInstance().oeffnen();
	}

public static void FortbildungLoeschen() {
	FortbildungEntfernenAAS.getInstance().oeffnen();
	}

public static void BestehenEntfernen() {
	FortbildungBestehenEntfernenAAS.getInstance().oeffnen();
	}
}
