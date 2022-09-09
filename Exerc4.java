
/*certo */
import javax.swing.JOptionPane;
public class Exerc4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num=1, i1=0, i2=0, i3=0, i4=0 ; 
        
        while (num > 0 ){
            num = Integer.parseInt(JOptionPane.showInputDialog("digite um valor positivo (PARA ENCERRAR DIGITE UM NUMERO NEGATIVO) "));
            
            if (num>=0 && num <= 25){
                
                i1 = i1 +1;
            } else if ( num >= 26 && num <= 50){
                
                i2 = i2 +1;
            }else if(num>=51 && num <= 75){
                
                i3 = i3+1;
            }else if (num>=76 && num <= 100){
                
                i4= i4+1;

            } else if(num<0){
                break;
            }
           
        }
        JOptionPane.showMessageDialog(null,+ i1 +"numeros estao no intervalo de [0-25]" );
        JOptionPane.showMessageDialog(null, +i2 +"numeros estao no intervalo de [26-50]");
        JOptionPane.showMessageDialog(null, +i3 +"numeros estao no intervalo de [51-75]");
        JOptionPane.showMessageDialog(null,+ i4+"numeros estao no intervalo de [76-100]" );


    }
}
