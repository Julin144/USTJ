import javax.swing.JOptionPane;
public class Ex2 {
    public static void main(String[] args){
        double vl1;
        double vl2;
        double r;
         
        vl1 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso "));
        vl2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura"));
        r = vl1 / (vl2*vl2);
        if(r<18.5){
            JOptionPane.showMessageDialog(null,"O resultado é"+ r + " Abaixo do peso");
        }
        if(r<24.9){
            JOptionPane.showMessageDialog(null,"O resultado é"+ r + "  peso Normal");
        }
        if(r<30){
            JOptionPane.showMessageDialog(null,"O resultado é"+ r + "  Sobrepeso");
        }
        else{
            JOptionPane.showMessageDialog(null,"O resultado é"+ r + "  Obesidade");
        }
    }
}