import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite aqui um numero: ");
        int n1 = ler.nextInt();
        if(n1<=0)
        {
            System.out.println("O numero é negativo");
        }
        else
        {
            System.out.println("O numero é positivo");
        }
    }
}
