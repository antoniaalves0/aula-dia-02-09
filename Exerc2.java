/* nao esta imprimindo a menor altura  */
import javax.swing.JOptionPane;

public class Exerc2 {
    public static void main(String[] args) {
        double h , menor = 0.0 , maior = 0.0 ;
        int c = 0;
        do {
            h = Double.parseDouble(JOptionPane.showInputDialog("digite sua altura: "));
            
            /*JOptionPane.showMessageDialog(null, "a menor altura eh: "+menor + "a maior altura eh:"+maior);*/
        c++;
        } while (c < 3);
        if (h < menor ){
            menor = h;
        }else if (h > maior) {
            maior = h; 
        } 
        JOptionPane.showMessageDialog(null, " a menor altura é: "+ menor );
        JOptionPane.showMessageDialog(null, "e a maior altura é:"+ maior );
        
    }
}