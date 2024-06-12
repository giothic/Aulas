package Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno pessoa = new Aluno();

        pessoa.setNome("Giovanna");
        pessoa.setIdade(20);
        pessoa.setNotaUm(6);
        pessoa.setNotaDois(9);
        pessoa.setMedia();

        System.out.println("O nome do aluno é: " + pessoa.getNome());
        System.out.println("A idade do aluno é: " + pessoa.getIdade());

        if(pessoa.getMedia() > 5){
        System.out.println("A média do aluno é: " + pessoa.getMedia());
        System.out.println("Aluno aprovado.");
        }else{
            System.out.println("A média do aluno é: " + pessoa.getMedia());
            System.out.println("Aluno reprovado.");           
        }
    }

}
