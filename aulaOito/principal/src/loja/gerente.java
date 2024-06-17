package loja;
public class gerente extends funcionario {

    private String usuario;
    private String departamento;
    private boolean reuniao;


    public gerente(String nome, String cpf, String usuario, String departamento, double salario, boolean reuniao, double bonus){
        super(nome, cpf, salario, bonus);

        this.usuario = usuario;
        this.departamento = departamento;
    }



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isReuniao() {
        return reuniao;
    }

    public void setReuniao(boolean reuniao) {
        this.reuniao = reuniao;
    }

    public boolean realizarReuniao(boolean reuniao){

        if(reuniao == true){
            System.out.println("Reunião realizada.");
            return true;
        }else{
            System.out.println("Reunião adiada.");
            return false;
        }
    }

    

}
