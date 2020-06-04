import java.util.*;

public class Fortbildung {
	private static HashSet<Fortbildung> fortbildungen = new HashSet<Fortbildung>();
	private int c = 0;
	private int FortbildungsID;
	private String Fortbildung = "";
	private String[] Voraussetzung;
	private boolean bestanden;
	
	Fortbildung(String fbn, String[] vorauss){
		this.Fortbildung = fbn;
		this.Voraussetzung = vorauss;
		this.FortbildungsID = c;
		fortbildungen.add(this);
		c++;
		
	}
	Fortbildung(){
		FortbildungsID = -1;
		Fortbildung = "ERROR";
		Voraussetzung[0] = "ERROR";
	}
	public String getFortbildungsname() {
		return this.Fortbildung;
	}
	public String[] getVoraussetzungen() {
		return this.Voraussetzung;
	}
	public boolean getBestanden() {
		return this.bestanden;
	}
	public void setBestanden(boolean t) {
		this.bestanden = t;
	}
	
	
	public static String[] gibAlleFortbildungen() {
		int i = 0;
		String[] s = new String[fortbildungen.size()];
		for(Fortbildung f : fortbildungen) {
		s[i] = f.Fortbildung;
		i++;
	
		}
		return s;
	}
	public static Fortbildung gibKopie(String s) {
		Fortbildung fb = new Fortbildung();
		for(Fortbildung f : fortbildungen) {
			if (s.equals(f.Fortbildung)) {
				fb= f;
			}
		}
		return fb;
	}
	public static Fortbildung gibFortbildung(String s) {
		for(Fortbildung f : fortbildungen) {
			if (s.equals(f.Fortbildung)) {
				return f;
			}
		}
		Fortbildung fb = new Fortbildung();
		return fb;
	}
}
	
