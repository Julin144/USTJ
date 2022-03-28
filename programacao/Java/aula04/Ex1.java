import javax.swing.JOptionPane;
public class Ex1{
    public static void main(String [] args){

        double nota =  Double.parseDouble(JOptionPane.showInputDialog(null, "digite a nota"));
        
        if(nota >= 70){
            JOptionPane.showMessageDialog(null, "Parabéns");
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}