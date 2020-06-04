import java.util.*;

class Sachbearbeiter {
private static HashSet<Sachbearbeiter> sachbearbeiter = new HashSet<Sachbearbeiter>();
boolean test=true;
private boolean admin;
private String benutzername = "" ;
private String passwort = "" ;
private HashSet<Fortbildung> fortbildungensb = new HashSet<Fortbildung>();
public  Sachbearbeiter(String n, String pw, boolean a) {
	for(Sachbearbeiter sb: sachbearbeiter) {
		if(sb.benutzername.equals(n)) {
			test = false;
		}
	}
	if(test) {
	this.benutzername = n;
	this.passwort = pw;
	this.admin = a;
	sachbearbeiter.add(this);
	}
}
public Sachbearbeiter() {
	this.passwort="XXXXXXX";
	this.benutzername="ERROR";
	this.admin = false;
}
public static void sachbearbeiterEntfernen(Sachbearbeiter sb) {
	sachbearbeiter.remove(sb);
}
public String getName() {
	return this.benutzername;
}
public String getPasswort() {
	return this.passwort;
}
public boolean isAdmin() {
	return this.admin;
}
public void setName(String n) {
	this.benutzername = n;
}
public void setPasswort(String pw) {
	this.passwort = pw;
}
public void setAdmin(boolean a) {
	this.admin = a;
}
public void setFortbildungen(Fortbildung s) {
	fortbildungensb.add(s);
}
public String[] gibFortbildungenSb() {
	int i = 0;
	String[] alleFb = new String[fortbildungensb.size()];
	for(Fortbildung fb : fortbildungensb) {
		alleFb[i] = fb.getFortbildungsname();
		i++;
}
	return alleFb;
}	 
public static String[] gibAlleNamen() {
	int i = 0;
	String[] alleNamen = new String[sachbearbeiter.size()];
	for(Sachbearbeiter sb : sachbearbeiter) {
		alleNamen[i] = sb.benutzername;
		i++;
		
	}
	return alleNamen;
}

public static Sachbearbeiter gibKopie(String s) {
	Sachbearbeiter temp = new Sachbearbeiter();
	for(Sachbearbeiter sb : sachbearbeiter) {
		if(s.equals(sb.benutzername)) {
			temp = sb;
		}
	}
	return temp;
}

public static Sachbearbeiter selectSachbearbeiter(String s) {
	for(Sachbearbeiter sb : sachbearbeiter) {
		if(s.equals(sb.getName())) {
			return sb;
		}
		
		
	}
	Sachbearbeiter f = new Sachbearbeiter();
	return f;
}
public void kopiereAttribute(Sachbearbeiter sb) {
	this.benutzername = sb.benutzername;
	this.passwort = sb.passwort;
	this.admin = sb.admin;
	this.fortbildungensb = sb.fortbildungensb; 
}
public void setFortbildung() {
	
}
public boolean checkBelegt(String s1) {
	boolean b;
	for(Fortbildung f : this.fortbildungensb) {
		if(f.getFortbildungsname().equals(s1)) {
			
		}
	}
	
}

}
