/* Collatzfolge
 * Nach der Eingabe einer Startzahl (ganze Zahl)
 * wird die zugeh�rige Collatzfolge bis zur
 * ersten 1 ausgegeben.
 */

import javax.swing.JOptionPane;

public class Collatzfolge {
    public static void main(String[] args) {
	int n;
	String eingabe;

	// Eingabedialog anzeigen
	eingabe = JOptionPane
		.showInputDialog("Geben Sie die Startzahl f�r die Collatzfolge ein: ");
	n = Integer.parseInt(eingabe);
	System.out.println(n);
	while (n != 1) {
	    if (n % 2 == 0)
		n /= 2;
	    else
		n = 3 * n + 1;
	    System.out.println(n);
	}
    }
}