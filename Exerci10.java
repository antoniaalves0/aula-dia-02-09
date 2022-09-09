/* não consegui fazer */
import javax.swing.JOptionPane;

public class Exerci10 {
    public static void main(String[] args) {
        int valor, calculo;
        valor = Integer.parseInt(JOptionPane.showInputDialog("digite um valor:"));
        calculo = valor * 4 * 3 * 2 * 1;
        JOptionPane.showMessageDialog(null, valor + "! =" + valor + "x 4 x 3 x 2 x 1 =" +  calculo);


    }
}
