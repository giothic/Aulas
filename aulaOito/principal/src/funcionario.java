public class funcionario {

    private String nome;
    private String cpf;
    private double salario;
    @SuppressWarnings("unused")
    private double bonus;

    public funcionario(String nome, String cpf, double salario, double bonus){

        this.bonus = bonus;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus = salario + (salario * 0.10);
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
