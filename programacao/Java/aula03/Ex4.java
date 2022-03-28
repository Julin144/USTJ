import javax.swing.JOptionPane;
public class Ex4{
    public static void main(String [] args) {
        
        double v1;
        double r;

        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        r = v1 - 1;
        JOptionPane.showMessageDialog(null, "O antecessor é:" + r);
    }
}