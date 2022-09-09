/*n sei se tá certo*/
import javax.swing.JOptionPane;

public class Exerc3 {
    public static void main(String[] args) {
        double num, soma=0 , media=0, qvp=0, qvn=0, pp=0, pn=0   ;
        int c = 0;
        while (c < 3){
            num = Float.parseFloat(JOptionPane.showInputDialog("digite um valor: "));
            soma = soma + num;
            media = num / c;
            c++;
            if (num >= 0){
                qvp = qvp+ 1;
                pp = qvp / 100;
            }else if(num < 0){
                qvn = qvn + 1;
                pn = qvn / 100;
    
            }
            
            
            
        }
        
        JOptionPane.showMessageDialog(null, "a media dos valores é"+ media);
        JOptionPane.showMessageDialog(null, "a quantidade de valores positivos são "+ qvp);
        JOptionPane.showMessageDialog(null, "a quantidade de valores negativos são"+ qvn);
        JOptionPane.showMessageDialog(null,"o percentual de valores pos é" +pp+"%" );
        JOptionPane.showMessageDialog(null, "o percentual de valores neg é" +pn+"%");



    }
}
