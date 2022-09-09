import static javax.swing.JOptionPane.showInputDialog;
import javax.swing.JOptionPane;

public class oppgavekarakterpoeng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for (int i = 0; i < 10; i++) {
			
			int poengsum = Integer.parseInt(showInputDialog("Skriv inn poengsummen din"));
			String karakter = "Ugyldig poengsum";
			
		if (poengsum <= 39 && poengsum >= 0)
			karakter = "F";
		
		if (poengsum >= 40 && poengsum <= 49)
			karakter = "E";
			
		if (poengsum >= 50 && poengsum <= 59)
			karakter = "D";
		
		if (poengsum >= 60 && poengsum <= 79)
			karakter = "C";
		
		if (poengsum >= 80 && poengsum <= 89)
			karakter = "B";
			
		if (poengsum >= 90 && poengsum <= 100)
			karakter = "A";
			
		if ((karakter).equals("Ugyldig poengsum"))
				i = i - 1;
		
		
		JOptionPane.showMessageDialog(null, "Karakteren din ble: " + karakter);
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}

}
