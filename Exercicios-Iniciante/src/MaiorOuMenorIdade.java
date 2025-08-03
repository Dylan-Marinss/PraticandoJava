import java.util.Scanner;

public class MaiorOuMenorIdade {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite aqui o seu nome: ");
        nome = ler.nextLine();
        System.out.println("Qual sua idade? ");
        idade = ler.nextInt();

        if(idade<=17)
        {
            System.out.println("O usuario\n" + nome + "tem a idade\n" + idade + "Você é menor de idade.");
        }
        else
        {
            System.out.println("O usuario\n" + nome + "\ntem a idade\n" + idade + "\nJá pode ser preso.");
        }
    }
}
