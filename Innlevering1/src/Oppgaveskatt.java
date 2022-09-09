import static javax.swing.JOptionPane.showInputDialog;
import javax.swing.JOptionPane;


public class Oppgaveskatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++); {
			
			int inntekt = Integer.parseInt(showInputDialog("Skriv inn inntekten din"));
			String skatt = " ";
			
			if (inntekt <= 164100)
				skatt = "0.0%";
			
			if (inntekt >= 164101 && inntekt <= 230950)
				skatt = "0.93%";
			
			if (inntekt >= 230951 && inntekt <= 580650)
				skatt = "2.41%";
			
			if (inntekt >= 580651 && inntekt <= 934050)
				skatt = "11.52%";
			
			if (inntekt >= 934051)
				skatt = "14.52%";
			
			JOptionPane.showMessageDialog(null, "Basert på din inntekt skal du betale "+skatt + " i skatt");
			
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
