package loja;
public class secretario extends funcionario {

    private int ramal;
    private String turno;
    private boolean mreuniao;

    public secretario(String nome, String cpf, int ramal, String turno, double salario, double bonus){
        super(nome, cpf, salario, bonus);


        this.ramal = ramal;
        this.turno = turno;
    }


    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    

    public boolean marcarReuniao(boolean mreuniao){
        if(mreuniao == true){
            System.out.println("Reunião marcada.");
            return true;
        }else{
            System.out.println("Não foi possivel marcar a reunião.");
            return false;
        }
    }


    public boolean isMreuniao() {
        return mreuniao;
    }


    public void setMreuniao(boolean mreuniao) {
        this.mreuniao = mreuniao;
    }

    

}
