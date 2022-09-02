import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Fatorial fatorial = new Fatorial();

        int input = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        fatorial.setValor(input);

        JOptionPane.showMessageDialog(null, "<html>Fatorial de " + input + " eh: "
                + fatorial.getFat() + "<hr>" + fatorial.getEquacao() + "</html>");

    }
}