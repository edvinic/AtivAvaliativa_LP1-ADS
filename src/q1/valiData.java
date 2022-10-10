package q1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class valiData {

    private int vDia;
    private boolean bissex = false, data = false;
    private String today;

    // b) Sua classe deve ter um construtor que inicializa os três atributos e
    // verifica a
    // validade dos valores fornecidos.


    valiData(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        today = dateFormat.format(new Date());
    }

    valiData(String inputData) {
        // e) Forneça o método toString para retornar uma representação da data como
        // string. Considere que a data deve ser formatada mostrando o dia, o mês e o
        // ano separados por barra (/).

        String[] diaS = inputData.split("/");

         // a) Represente uma data usando três atributos: o dia, o mês, e o ano.
        int dia = Integer.parseInt(diaS[0]);
        int mes = Integer.parseInt(diaS[1]);
        int ano = Integer.parseInt(diaS[2]);

        List<Integer> mes31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> mes30 = Arrays.asList(4, 6, 9, 11);

        if (ano > 0) {

            if ((ano % 400 == 0 || ano % 4 == 0) && (ano % 100 != 0)) { // se bissexto
                bissex = true;
            }

            if (mes >= 1 && mes <= 12) { // mes valido

                if (mes30.contains(mes)) { // metrica de dia
                    this.vDia = 30; // se 4, 6, 9, 11;
                } else if (mes31.contains(mes)) {
                    this.vDia = 31; // se 1, 3, 5, 7, 8, 10 ou 12;
                } else if (mes == 2 && bissex) {
                    this.vDia = 29; // se 2 em ano bissexto;
                } else if (mes == 2) {
                    this.vDia = 28; // se 2 em ano não bissexto;
                }

            }

            if (dia >= 0 && dia <= vDia) { // dia valido
                data = true;
            }

        }

    }

    // d) Forneça um método set um get para cada atributo.
    public String getToday() {
        return today;
    }
    public boolean isData() {
        return data;
    }

}    