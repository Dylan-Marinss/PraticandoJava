import java.util.Scanner;

public class NumeroValido {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1;

        System.out.println("Digite aqui um numero: ");
        n1 = ler.nextFloat();

        if(n1<=10)
        {
            System.out.println("O numero é valido: ");
        }
        else
        {
            System.out.println("O numero é invalido");
        }
    }
}
