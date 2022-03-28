import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String [] args) {
        double n1;
        double n2;
        double n3;
        double n4;

        double n5;
        double n6;
        double n7;
        double n8;

        double r;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto numero"));

        n5 = n1*n1;
        n6 = n2*n2;
        n7 = n3*n3;
        n8 = n4*n4;

        r = n5+n6+n7+n8;
        JOptionPane.showMessageDialog(null , "O resultado final é " + r);

    }
}
