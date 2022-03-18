/* Zahlentest
 * Nach der Eingabe einer Zahl wird geprüft,
 * ob die Zahl positiv oder negativ ist.
 * Das Ergebnis wird in einem MessageDialog ausgegeben.
 */

import javax.swing.JOptionPane;

public class Zahlentest {

    public static void main(String[] args) {
	// Variable Declaration
	double zahl;
	// Input Zahl
	zahl = Double.parseDouble(JOptionPane
		.showInputDialog("Geben Sie eine Zahl ein:"));

	//Check the number if Positive oder Negative
	if (zahl < 0) {
	    JOptionPane.showMessageDialog(null, "Die Zahl ist negativ!");
	} else {
	    JOptionPane.showMessageDialog(null, "Die Zahl ist positiv!");
	}
    }

}
