import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Primeiro numero: ");
        n1 = ler.nextInt();
        System.out.println("Segundo numero: ");
        n2 = ler.nextInt();
        System.out.println("Terceiro numero: ");
        n3 = ler.nextInt();

        if(n1 < n3 && n3 > n2)
        {
            System.out.println("O maior numero é: " + n3);
        } else if (n1 > n2 && n1 > n3) {
            System.out.println("O maior numero é: " + n1);
        }
        else
        {
            System.out.println("O maior numero é: "+ n2);
        }

    }
}
