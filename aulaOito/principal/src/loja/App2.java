package loja;
public class App2 {
    public static void main(String[] args) throws Exception {

        //Adcionar cliente, deve ter seus atributos e métodos
        //

        gerente gerente1 =  new gerente("Marcelo", "987.263.873-64", "Marcelo64", "Roupas", 1300.00, true, 0);

        vendedor vendedor1 = new vendedor("Juliana", "384.283.346-23", "Juliana23", "Roupas Femininas", 200, false, 0);

        secretario secretario1 = new secretario("Maria", "257.659.345-45", 8922, "Matutino", 1100, 0);

        System.out.println("Informações do Gerente.\n");
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("CPF: " + gerente1.getCpf());
        System.out.println("Usuário: " + gerente1.getUsuario());
        System.out.println("Departamento: " + gerente1.getDepartamento());
        System.out.println("Salário: " + gerente1.getSalario());
        System.out.println("Salário com bonus: " + gerente1.getBonus());
        System.out.println("\n");

        System.out.println("Informações do Vendedor.\n");
        System.out.println("Nome: " + vendedor1.getNome());
        System.out.println("CPF: " + vendedor1.getCpf());
        System.out.println("Matrícula: " + vendedor1.getMatricula());
        System.out.println("Setor: " + vendedor1.getSetor());
        System.out.println("Salário: " + vendedor1.getSalario());
        System.out.println("Salário com bonus: " + vendedor1.getBonus());
        System.out.println("\n");

        System.out.println("Informações do Secretário.\n");
        System.out.println("Nome: " + secretario1.getNome());
        System.out.println("CPF: " + secretario1.getCpf());
        System.out.println("Turno: " + secretario1.getTurno());
        System.out.println("Setor: " + secretario1.getRamal());
        System.out.println("Salário: " + secretario1.getSalario());
        System.out.println("Salário com bonus: " + secretario1.getBonus());
        System.out.println("\n");

        System.out.println("\n");
        System.out.println(gerente1.realizarReuniao(true));
        System.out.println("\n");
        System.out.println(vendedor1.fazerVenda(true));
        System.out.println("\n");
        System.out.println(secretario1.marcarReuniao(true));




    }


}
