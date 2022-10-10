package q2;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta { // e. Crie as classes ContaCorrente e ContaPoupanca.

    public void atualizar() {
        double taxa = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Deseja atualizar o saldo a que taxa?", "Atualizar Saldo", -1));

        this.saldo += this.saldo * ((taxa / 100) * 2); // ContaPoupanca deve atualizar-se com o triplo da taxa e retirar
                                                       // taxa de 0.10

    }

    @Override
    public void depositar() {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor deseja depositar?"));
        this.saldo = (this.saldo - 0.10) + deposito;
    }

}
