package loja;
public class vendedor extends funcionario{

    private String matricula;
    private String setor;
    private boolean venda;



    public vendedor(String nome, String cpf, String matricula, String setor, double salario, boolean venda, double bonus){
        super(nome, cpf, salario, bonus);

        this.matricula = matricula;
        this.setor = setor;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isVenda() {
        return venda;
    }

    public void setVenda(boolean venda) {
        this.venda = venda;
    }

    public boolean fazerVenda(boolean venda){

        if(venda == true){
            System.out.println("Venda realizada.");
            return true;
        }else{
            System.out.println("Venda cancelada.");
            return false;
        }
    }





    

}
