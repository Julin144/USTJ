import javax.swing.JOptionPane;
public class Ex3{
    public static void main(String [] args) {
     
        double pp;
        double qv;
        double p;
        double r;

        pp = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do produto:"));
        qv = Double.parseDouble(JOptionPane.showInputDialog("Digite o qunatidade de produtos:"));

        p =  qv * pp *  0.05 ; 
        r =  qv * pp + p;

        JOptionPane.showMessageDialog(null, "O valor é" + r);
    }
}