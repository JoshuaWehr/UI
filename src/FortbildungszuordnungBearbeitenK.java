
public class FortbildungszuordnungBearbeitenK {

	public void gibFortbildungszuordnungNamen() {
		
	}
	public void gibForbildungszuordnung(String s) {
		
	}
	public void schreibeFirtbildungszuordnung(Fortbildung f) {
		
	}
	public void loescheFortbildungszuordnung(String s) {
		
	}

public void oeffnen(Sachbearbeiter benutzer, String fbname){

    Fortbildung fortbildung = Fortbildung.gibFortbildung(fbname);

    if (fortbildung.getFortbildungsname().equals("Mathematik 1")){
        if(benutzer.checkBelegung("Mathematik 2") || benutzer.checkBelegung("Kostenrechnung")) {
            System.out.println();
            System.out.println("Der Bestanden-Status darf nicht geaendert werden");
        }
        else{
            benutzer.removeBestanden("Mathematik 1");
            benutzer.setBelegt("Mathematik 1");
        }
    }

    if (fortbildung.gibName().equals("Mathe2")){
        if(benutzer.checkBelegung("Kostenrechnung")) {
            System.out.println();
            System.out.println("Der Bestanden-Status darf nicth geaendert werden");
        }
        else {
            benutzer.removeBestanden("Mathe2");
            benutzer.setBelegt("Mathe2");
        }
    }

    if (fortbildung.gibName().equals("Allgemeine BetriebsWirtschaft")){
        if(benutzer.checkBelegung("Kostenrechnung")) {
            System.out.println();
            System.out.println("Der Bestanden-Status darf nicth geaendert werden");
        }
        else{
            benutzer.removeBestanden("Allgemeine BetriebsWirtschaft");
            benutzer.setBelegt("Allgemeine BetriebsWirtschaft");
        }
    }

    if (fortbildung.gibName().equals("Kostenrechnung")){
        benutzer.removeBestanden("Kostenrechnung");
        benutzer.setBelegt("Kostenrechnung");
    }
}
}
