public class Aluno {
    private String nome;
    private double media;

    public Aluno(String nomeInicial, double mediaInicial){
        nome = nomeInicial;

        if(0 <= mediaInicial && mediaInicial <= 100 ) {
            media = mediaInicial;
        }
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public String getNome(){
        return nome;
    }

    public void setMedia(Double novaMedia){
        if (0 <= novaMedia && novaMedia <= 100 ) {
            media = novaMedia;
        }
    }

    public double getMedia(){
        return media;
    }

    public char conceito(){
        if (media >= 90){
            return 'A';
        } else if (80 <= media) {
            return 'B';
        } else if (70 <= media){
            return 'C';
        } else if (60 <= media) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
