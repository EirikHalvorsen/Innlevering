import static javax.swing.JOptionPane.showInputDialog;

import javax.swing.JOptionPane;
import java.util.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Skriv inn nummeret: ");
		int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
		

        {
            fact=fact*i;
            i++;
        }
		
        System.out.println("Fakulteten av nummeret: "+fact); 
		
		
		
	}

}
