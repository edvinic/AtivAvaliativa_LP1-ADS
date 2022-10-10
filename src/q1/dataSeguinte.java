package q1;

public class dataSeguinte {
    
private String dataString;

    dataSeguinte(String inputData) {

        String[] diaS = inputData.split("/");

        int dia = (Integer.parseInt(diaS[0]) + 1);
        int mes = Integer.parseInt(diaS[1]);
        int ano = Integer.parseInt(diaS[2]);
        dataString = dia + "/" + mes + "/" + ano;
        System.out.println(dataString);

        valiData valiData = new valiData(dataString);

        if (mes == 12 && valiData.isData() == false) {
            dia = 1;
            mes = 1;
            ano += 1;
            dataString = dia + "/" + mes + "/" + ano;
        } else if (valiData.isData() == false) {
            mes += 1;
            dia = 1;
            dataString = dia + "/" + mes + "/" + ano;
        }

    }

    public String getDataString() {
        return dataString;
    }

}