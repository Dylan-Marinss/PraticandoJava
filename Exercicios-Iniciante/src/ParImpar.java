import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n1;

        System.out.println("Digite o numero para descobri se é impar ou par: ");
        n1 = leitor.nextInt();

        if(n1 % 2 == 0 )
        {
            System.out.println("O numero é par");
        }
        else
        {
            System.out.println("O numero é ímpar");
        }

    }
}
