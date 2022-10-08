package q1;

import javax.swing.JOptionPane;

public class questao1 {

    public static void main(String[] args) {

        String minhaData = JOptionPane.showInputDialog(null, "Insira a data:\n[DD/MM/AAAA]\n‎", "valiData", -1);
        dataSeguinte dataSeg = new dataSeguinte(minhaData);
        String today = new valiData().getToday();
        dataSeguinte tomorrow = new dataSeguinte(today);

        if (new valiData(minhaData).isData()) {
            JOptionPane.showMessageDialog(null,
                    "A data " + minhaData + " é válida\n\nO dia seguinte é " + dataSeg.getDataString(), "DATA VÁLIDA",
                    -1);
        } else {
            JOptionPane.showMessageDialog(null, "A data de hoje é: " + today + "\n\nO dia seguinte é " + tomorrow.getDataString(),
                    "DATA INVÁLIDA", -1);
        }
    }
}