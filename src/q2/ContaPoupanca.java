package q2;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta { // e. Crie as classes ContaCorrente e ContaPoupanca.

    public void atualizar() {
        double taxa = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Deseja atualizar o saldo a que taxa?", "Atualizar Saldo", -1));

        this.saldo += this.saldo * ((taxa / 100) * 3); // e. ContaCorrente deve atualizar-se com o dobro da taxa

    }

}
