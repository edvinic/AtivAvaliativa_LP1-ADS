package q2;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        Conta c = new Conta();

        c.setTipoConta(JOptionPane.showOptionDialog(null, "Deseja operar em que tipo de conta?", "Caixa", 0, -1, null,
                c.getOptions(), c.getOptions()[0]));

        if (c.getTipoConta() == 0) {
            c = new ContaCorrente();
        } else {
            c = new ContaPoupanca();
        }

        c.operacoes();

    }

}
