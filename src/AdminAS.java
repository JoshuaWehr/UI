import java.util.Scanner;

public class AdminAS {
		private static boolean b  = false ;
		static Sachbearbeiter sb = new Sachbearbeiter();
	public static void login() {
	
}
	public static void sachbearbeiterErfassen() {
		AdminSachbearbeiterErfassenAAS.schreibeSachbearbeiter(); 
		
	}
	
    public static void sachbearbeiterLoeschen(){
        AdminSachbearbeiterLoeschenAAS.entferneSachbearbeiter(AdminAS.sachbearbeiterAuswaehlen());
    }

    public static void sachbearbeiterEditieren(){
        SachbearbeiterEditierenAAS.oeffnen();
    }

    public static Sachbearbeiter sachbearbeiterAuswaehlen() {
        sb = SachbearbeiterAuswaehlenAAS.oeffnen();
        System.out.println(sb.getName());
        return sb;
    }
/*
    public static void fortbildungZuweisen() {
    	FortbildungszuordnungBearbeiterAAS.getInstance().oeffnen();
    	}

   */ public static void fortbildungAuswaehlen() {
    	FortbildungszuordnungBearbeitenAAS.oeffnen();
    	}


}



