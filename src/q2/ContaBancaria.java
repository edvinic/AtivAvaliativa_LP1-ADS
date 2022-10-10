package q2;

import javax.swing.JOptionPane;

public class ContaBancaria {
    private String numConta;
    private double saldo;
    private String[] options = { "Voltar", "Sair" };

    public void menuConta() {

        String[] menuOptions = { "Extrato", "Saque", "Deposito" };
        int menu = JOptionPane.showOptionDialog(null, "Olá Cliente, qual operação deseja fazer?",
                "Conta n° " + numConta, 0, -1, null, menuOptions, menuOptions[0]);

        switch (menu) {
            case 0:
                extratoConta();
                break;

            case 1:
                saqueConta();
                break;

            case 2:
                depositoConta();
                break;

        }

    }

    public void opcaoConta(int option) {

        if (option == 0) {
            menuConta();
        } else {
            JOptionPane.showConfirmDialog(null, "Clique para terminar a consulta a conta n° " + numConta, "SAIR", -1,
                    -1);

            System.exit(0);
        }

    }

    public void extratoConta() {

        int optMenu = JOptionPane.showOptionDialog(null, "Conta n° " + numConta + "\n\nSaldo: " + saldo,
                "EXTRATO BANCÁRIO", 0,
                -1, null, options, options[0]);

        opcaoConta(optMenu);

    }

    public void saqueConta() {

        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Seu saldo é de: " + saldo + "\n\nQual valor deseja sacar?", "SACAR DINHEIRO",
                -1));

        if (valorSaque > saldo) {
            int opt = JOptionPane.showConfirmDialog(null,
                    "O valor inserido é maior que seu saldo \n\nDeseja inserir outro valor para saque?",
                    "Valor não disponivel", 0, -1);

            if (opt == 0) {
                saqueConta();
            } else {
                opcaoConta(opt);
            }

        } else if (valorSaque < saldo) {

            saldo -= valorSaque;

            int optMenu = JOptionPane.showOptionDialog(null,
                    "Conta n° " + numConta + "\n\nA operação foi concluida e seu novo saldo é de: " + saldo,
                    "SAQUE CONCLUIDO", 0,
                    -1, null, options, options[0]);

            opcaoConta(optMenu);
        }

    }

    public void depositoConta() {

        double valorDeposito = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Qual valor para deposito?", "DEPOSITO", -1));

        saldo += valorDeposito;

        int optMenu = JOptionPane.showOptionDialog(null,
                "Conta n° " + numConta + "\n\nA operação foi concluida e seu novo saldo é de: " + saldo,
                "DEPOSITO CONCLUIDO", 0,
                -1, null, options, options[0]);

        opcaoConta(optMenu);

    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}