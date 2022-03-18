/* LoesungenQuadratischeGleichung ax^2 + bx +c = 0
 * Nach der Eingabe der drei Koeffizienten a, b und c
 * wird bestimmt wie viele L�sungen die Gleichung hat.
 * Das Ergebnis wird in einem MessageDialog ausgegeben.

 */

import javax.swing.JOptionPane;

public class LoesungenQuadratischeGleichung {

    public static void main(String[] args) {
	double a, b, c, d;
	a = Double.parseDouble(JOptionPane.showInputDialog("ax" + '\u00b2'
		+ " + bx + c; Geben Sie den Koeffizienten a ein:"));
	b = Double.parseDouble(JOptionPane.showInputDialog("ax" + '\u00b2'
		+ " + bx + c; Geben Sie den Koeffizienten b ein:"));
	c = Double.parseDouble(JOptionPane.showInputDialog("ax" + '\u00b2'
		+ " + bx + c; Geben Sie den Koeffizienten c ein:"));
	d = b * b - 4 * a * c;
	if (d < 0) {
	    JOptionPane.showMessageDialog(null,
		    "Die Gleichung hat keine L�sung!");
	} else {
	    if (d > 0) {
		JOptionPane.showMessageDialog(null,
			"Die Gleichung hat zwei L�sungen!");
	    } else {
		JOptionPane.showMessageDialog(null,
			"Die Gleichung hat eine L�sung!");
	    }
	}
    }

}
