import java.util.Scanner;

public class SachbearbeiterS {
	String e1;
public static void Login() {

		LoginAAS.oeffnen();
	}

public static void AdminAuswahl(){
    String input;
    boolean loop = true;
    do {
        System.out.println("Operation auswaehlen");
        System.out.println("Erfassen, Loeschen"
        		+ ", Editieren, Auswaehlen, Fortbildung - Auswaehlen, Zuordnen, Bestehen, Loeschen, BestehenEntfernen, Beenden");
        input = Main.s.next();
        switch (input) {
            case "Erfassen":
            case "erfassen":
            	AdminAS.sachbearbeiterErfassen();
            	for(int i = 0; i<Sachbearbeiter.gibAlleNamen().length; i++)
            		System.out.println(Sachbearbeiter.gibAlleNamen()[i]);
                break;
            case "Loeschen":
            case "loeschen":
                AdminAS.sachbearbeiterLoeschen();
                break;
            case "Editieren":
            case "editieren":
                AdminAS.sachbearbeiterEditieren();
                break;
            case "Auswaehlen":
            case "auswaehlen":
                AdminAS.sachbearbeiterAuswaehlen();
                break;
            case "FortbildungAuswaehlen":
            case "fortbildungauswaehlen":
                AdminAS.fortbildungAuswaehlen();
                break;
            case "FortbildungZuordnen":
            case "fortbildungszuordnen":
                //AdminAS.FortbildungZuweisen();
                break;
            case "FortbildungBestehen":
            case "fortbildungbestehen":
                //AdminAS.FortbildungBestehen();
                break;
            case "FortbildungLoeschen":
            case "fortbildungloeschen":
               // AdminAS.FortbildungszuordnungLoeschen();
                break;
            case "BestehenEntfernen":
            case "bestehenentfernen":
                //AdminAS.BestehenEntfernen();
                break;
            case "Beenden":
            case "beenden":
                loop = false;
                break;
            default:
                System.out.println("Falsche eingabe");
        }
    }while (loop);

}
public static void NormalAuswahl() {
    String input;
    boolean loop = true;
    do {
        System.out.println("Operation auswaehlen");
        System.out.println("Editieren, Auswaehlen, Fortbildung - Auswählen, Zuordnen, Bestehen, Loeschen, BestehenEntfernen, Beenden");
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        switch (input) {
            case "Editieren":
            case "editieren":
                NormalAS.SachbearbeiterEditieren();
                break;
            case "Auswaehlen":
            case "auswaehlen":
                NormalAS.SachbearbeiterAuswaehlen();
                break;
            case "FortbildungAuswaehlen":
            case "fortbildungauswaehlen":
                NormalAS.FortbildungAuswaehlen();
                break;
            case "FortbildungZuordnen":
            case "fortbildungszuordnen":
                NormalAS.FortbildungZuweisen();
                break;
            case "FortbildungBestehen":
            case "fortbildungbestehen":
                NormalAS.FortbildungBestehen();
                break;
            case "FortbildungLoeschen":
            case "fortbildungloeschen":
                NormalAS.FortbildungLoeschen();
                break;
            case "BestehenEntfernen":
            case "bestehenentfernen":
                NormalAS.BestehenEntfernen();
                break;
            case "Beenden":
            case "beenden":
                loop = false;
                break;
            default:
                System.out.println("Falsche eingabe");
        }
    } while (loop);
}
}
