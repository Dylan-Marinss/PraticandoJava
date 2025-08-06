import java.util.Scanner;

public class CalcularDesconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double desc10, desc5;
        float compra;

        System.out.println("Digite aqui o valor da sua compra: ");
        compra = ler.nextFloat();

        if(compra>=1000)
        {
            desc10 = compra - (compra * 0.10);
            System.out.println("O valor com o desconto de 10% é: " + desc10);

        }
        else
        {
            desc5 = compra - (compra * 0.05);
            System.out.println("O valor com o desconto de 5% é " + desc5);
        }

    }
}
