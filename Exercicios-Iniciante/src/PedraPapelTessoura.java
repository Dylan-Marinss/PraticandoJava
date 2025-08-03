import java.util.Random;
import java.util.Scanner;

public class PedraPapelTessoura{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gen = new Random();

        String[] opcoes = {"pedra", "papel", "tesoura"};

        System.out.print("Digite pedra, papel ou tesoura: ");
        String jogador = scanner.nextLine().toLowerCase();

        String computador = opcoes[gen.nextInt(3)];

        System.out.println("Você escolheu: " + jogador);
        System.out.println("O computador escolheu: " + computador);

        if (jogador.equals(computador)) {
            System.out.println("Empate!");
        } else if (
                (jogador.equals("pedra") && computador.equals("tesoura")) ||
                        (jogador.equals("papel") && computador.equals("pedra")) ||
                        (jogador.equals("tesoura") && computador.equals("papel"))
        ) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu.");
        }
    }
}
