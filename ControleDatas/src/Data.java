public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    public void setDia(int novoDia){
        dia = novoDia;
    }

    public void mostraData(){
        System.out.printf("Data: %02d/%02d/%04d%n", dia, mes, ano);
    }
}
