import java.util.Scanner;

public class TipoPagamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float desc, acres;
        float valor, valorReajusto;


        System.out.println("Digite o valor da compra: ");
        valor = ler.nextFloat();
        System.out.println("Qual a forma de pagamento?");
        System.out.println("{1} - Pix");
        System.out.println("{2} - Dinheiro");
        System.out.println("{3} - Cartão debito");
        System.out.println("{4} - Cartão Crédito");
        int opcs = ler.nextInt();

        if(opcs == 1)
        {
            desc = (float) (valor * 0.95);
            valorReajusto = valor - desc;
            System.out.println("O valor original é: " + valor);
            System.out.println("O Desconto é: " + desc);
            System.out.println("O valor final é: " + valorReajusto);
        } else if (opcs == 2) {
            System.out.println("O valor final é: " + valor);
        } else if (opcs == 3) {
            acres = (float) (valor * 0.01);
            valorReajusto = valor + acres;
            System.out.println("O valor original é: " + valor);
            System.out.println("O acrescimo  é: " + acres);
            System.out.println("O valor final é: " + valorReajusto);
        }
        else
        {
            acres = (float) (valor * 0.025);
            valorReajusto = valor + acres;
            System.out.println("O valor original é: " + valor);
            System.out.println("O acrescimo  é: " + acres);
            System.out.println("O valor final é: " + valorReajusto);
        }


    }
}
