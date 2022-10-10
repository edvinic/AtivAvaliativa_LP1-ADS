package q2;

import javax.swing.JOptionPane;

public class Conta { // a. Crie uma classe Conta;
    protected double saldo; // b. Adicione o atributo saldo;
    protected int tipoConta;
    protected String[] options = { "Conta Corrente", "Conta Poupança" };

    Conta() {
        this.saldo = 100;
    }

    // c. Crie os métodos getSaldo(), deposita(double) e saca(double);
    public void depositar() {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor deseja depositar?"));
        this.saldo += deposito;
    }

    public void sacar() {
        double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor deseja sacar?"));
        this.saldo -= saque;
    }

    public void atualizar() {
        // d. Adicione um método na classe Conta, que atualiza essa conta de acordo com
        // uma taxa percentual fornecida pelo usuário;
    }

    public void operacoes() {

        String[] opt = { "Saque", "Depósito", "Atualizar", "Finalizar" };

        int op = JOptionPane.showOptionDialog(null, "Qual operação deseja realizar?", options[tipoConta], 0,
                -1, null, opt, opt);

        switch (op) {
            case 0:
                sacar();
                JOptionPane.showMessageDialog(null, "Novo saldo:\nR$" + saldo, "Saque", JOptionPane.PLAIN_MESSAGE);
                break;

            case 1:
                depositar();
                JOptionPane.showMessageDialog(null, "Novo saldo:\nR$" + saldo, "Depósito", JOptionPane.PLAIN_MESSAGE);
                break;

            case 2:
                atualizar();
                JOptionPane.showMessageDialog(null, "Novo saldo:\nR$" + saldo, "Atualizar", JOptionPane.PLAIN_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema", "Finalizar", -1);
                System.exit(0);
                break;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String[] getOptions() {
        return options;
    }

}
