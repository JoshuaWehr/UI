import java.util.*;
public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
	
		String[] v0 = {"KeineVoraussetzungen"};
		String[] v1 = {"Mathematik1"};
		String[] v2 = {"Mathematik2", "Allgemeine Betriebswirtschaft"};
		
		Sachbearbeiter sb1 = new Sachbearbeiter("jeff", "123", true) ;
		Sachbearbeiter sb2 = new Sachbearbeiter("Tom", "167", false) ;
		
		Fortbildung f1 = new Fortbildung("Mathematik 1", v0);
		Fortbildung f2 = new Fortbildung("Mathematik 2",v1);
		Fortbildung f3 = new Fortbildung("Kostenrechnung", v2);
		Fortbildung f4 = new Fortbildung("Allgemeine Betriebswirtschaft", v0);
		
		LoginAAS.oeffnen();
		
	
		
		
		System.out.println();
	}

}
