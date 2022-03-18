import javax.swing.JOptionPane;

public class Vokaltest{
    public static void main(String[] args)
    {
        String eingabe;

        eingabe=JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein :");
        char c=eingabe.charAt(0);
        switch(c){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            JOptionPane.showMessageDialog(null,"Es ist Vokal");
            break;
        default :
            JOptionPane.showMessageDialog(null,"Es ist kein Vokal");
        }
    }
}