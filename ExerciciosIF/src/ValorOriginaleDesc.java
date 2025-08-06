import java.util.Scanner;

public class ValorOriginaleDesc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double desc7, desc3;
        float valor;

        System.out.println("Digite aqui o valor da sua compra: ");
        valor = ler.nextFloat();

        if(valor>5000)
        {
            desc7 = valor - (valor * 0.075);
            System.out.println("O valor original é: " + valor);
            System.out.println("O valor com desconto é: " + desc7 );
        }
        else
        {
            desc3 = valor - (valor * 0.035);
            System.out.println("O valor original é: " + valor);
            System.out.println("O valor com desconto é: " + desc3);
        }
    }
}
