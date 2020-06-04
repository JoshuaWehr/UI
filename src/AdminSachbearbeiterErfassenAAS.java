import java.util.*;
public class AdminSachbearbeiterErfassenAAS {

	public static void schreibeSachbearbeiter(){
		String Name;
		String passwort;
		String ad;
		boolean t = true;
		boolean admin = false;
		System.out.println("Benutzernamen eingeben");
		Name = Main.s.next();
		System.out.println("Passwort eingeben");
		passwort = Main.s.next();
		do {
		System.out.println("Admin(a)/Normal(n)");
		ad = Main.s.next();
		switch(ad) {
		case "a":
			admin = true;
			t=false;
			break;
		case "n" :
			admin = false;
			t=false;
			break;
		default:
			break;
		}
		}while(t);
		Sachbearbeiter sb = new Sachbearbeiter(Name, passwort, admin);
		
	}
}
