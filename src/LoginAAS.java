import java.util.*;
public class LoginAAS {
	private static String e1;
	private static String eingN = "";
	private static String eingP = "";
	private static Sachbearbeiter sb;
	
	public static void oeffnen() {
		System.out.println("Waehlen sie als Admin anmelden mit a oder Normal anmelden mit n");
		e1=Main.s.next();
		System.out.println("Benutzernamen eingeben:");
		eingN = Main.s.next();
		System.out.println("Passwort eingeben:");
		eingP = Main.s.next();

		  switch (e1) {
		  case "a":
		  if(LoginK.login(eingN, eingP) && Sachbearbeiter.selectSachbearbeiter(eingN).isAdmin()) {
			  SachbearbeiterS.AdminAuswahl();
		 }
		  else {
			  System.out.println("Falsche Anmeldedaten");
			  LoginAAS.oeffnen();
			  }
			  
		  
		  break;
		  case "n":
			  if(LoginK.login(eingN, eingP) && !Sachbearbeiter.selectSachbearbeiter(eingN).isAdmin()) {
				  SachbearbeiterS.NormalAuswahl();
			 }
			  else {
				  System.out.println("Falsche Anmeldedaten");
				  LoginAAS.oeffnen();
			  }
		  break;
		  default: 
			System.out.println("Ungueltige Auswahl"); 
			LoginAAS.oeffnen();
			break;
		  }
	
	}
	public void ausfuehren() {
		if(LoginK.isEingeloggt()) {
			
		}
	}
	
}
