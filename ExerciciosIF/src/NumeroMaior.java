import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n1,n2;

        System.out.println("Digite aqui um numero:");
        n1 = ler.nextInt();
        System.out.println("Digite aqui o segundo numero: ");
        n2 = ler.nextInt();

        if(n1<n2)
        {
            System.out.println("O maior numero é: " + n2);
        }
        else
        {
            System.out.println("O maior numero é: "+ n1) ;
        }
    }
}
