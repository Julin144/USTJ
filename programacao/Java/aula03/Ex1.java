import javax.swing.JOptionPane;
public class Ex1{
    public static void main(String[] args) {
        double n1;
        double n2;
        double r;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotaçãp do dólar"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dólares"));
        r = n1 * n2;
        JOptionPane.showMessageDialog(null,"resultado é " + r); 
    }
}