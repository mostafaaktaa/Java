import javax.swing.JOptionPane;

public class test{
    public static void main(String[] args)
    {
        double a,b,c,D;

        a=Double.parseDouble(JOptionPane.showInputDialog("Geben Sie a ein :"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Geben Sie b ein :"));
        c=Double.parseDouble(JOptionPane.showInputDialog("Geben Sie c ein :"));

        D= b*b-4*a*c;



        if(D<0){
            JOptionPane.showMessageDialog(null,"Keine Loesung");
        } else if (D==0) {
            JOptionPane.showMessageDialog(null, "eine Loesung");
        }
        else{
            JOptionPane.showMessageDialog(null, "Zwei  Loesung");
        }

    }
}