package Escola;

public class Aluno {

    private String nome;
    private int idade;
    private float media, n1, n2;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNotaUm(){
        return n1;
    }

    public void setNotaUm(float n1){
        this.n1 = n1;
    }

    public float getNotaDois(){
        return n2;
    }

    public void setNotaDois(float n2){
        this.n2 = n2;
    }

    public float getMedia(){
        return media;
    }

    public void setMedia(){
        this.media = (n1 + n2) / 2;
    }

    
}
