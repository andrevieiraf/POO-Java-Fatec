public class Main {
    public static void main(String[] args) {

        //16/08/2024
        Pessoa p1 = new Pessoa();
        p1.nome = "Joao";
        p1.idade = 18;
        p1.sexo = "Masculino";
        p1.vegetariana = true;

        Churrasco churrasco = new Churrasco();
        churrasco.verificarConsumo(p1);
        System.out.println("Quantidade de carne consumida = " + churrasco.qtdCarne);

    }
}
