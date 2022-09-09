/* não consegui fazer */
import javax.swing.JOptionPane;

public class Exerc5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num,  par=0, impar=0, mediapar=0 /*mediageral=0*/; 
        
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero  positivo:"));
            

        } while (num!=0);
        if(num%2==0){
            par = par +1; 
            /*mediapar = par / num;*/
        }else if (num%2!=0){
            impar = impar +1;
        }

        JOptionPane.showMessageDialog(null,  par  );
        JOptionPane.showMessageDialog(null, impar);
        JOptionPane.showMessageDialog(null,  mediapar );
        /*JOptionPane.showMessageDialog(null, + mediageral );*/





    }
}
