import java.util.*;
public class LoginK {
	private static Sachbearbeiter sb = new Sachbearbeiter();
	private String pw;
	private String un;	
	static boolean test = false;
	public static boolean login(String un, String pw) {	
			for(int i = 0; i<Sachbearbeiter.gibAlleNamen().length;i++) {
				if (un.equals(Sachbearbeiter.gibAlleNamen()[i])) {
					test = pw.equals(Sachbearbeiter.selectSachbearbeiter(un).getPasswort());
				}
				
			}
			
			return test;
		}
		public static boolean isEingeloggt() {
			return test;
		}
		public static Sachbearbeiter getEingeloggt() {
			return sb;
		}
	
	

}
