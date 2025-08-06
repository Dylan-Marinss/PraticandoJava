import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float salario, salarioLiquido;
        double desconto = 0;

        System.out.print("Digite aqui o seu salario: ");
        salario = ler.nextFloat();

        if (salario <= 1412.00) {
            desconto = salario * 0.075;
        } else if (salario <= 2666.68) {
            desconto = (1412.00 * 0.075)
                    + ((salario - 1412.00) * 0.09);
        } else if (salario <= 4000.03) {
            desconto = (1412.00 * 0.075)
                    + ((2666.68 - 1412.00) * 0.09)
                    + ((salario - 2666.68) * 0.12);
        } else if (salario <= 7786.02) {
            desconto = (1412.00 * 0.075)
                    + ((2666.68 - 1412.00) * 0.09)
                    + ((4000.03 - 2666.68) * 0.12)
                    + ((salario - 4000.03) * 0.14);
        } else {
            desconto = (1412.00 * 0.075)
                    + ((2666.68 - 1412.00) * 0.09)
                    + ((4000.03 - 2666.68) * 0.12)
                    + ((7786.02 - 4000.03) * 0.14);
        }

        salarioLiquido = (float)(salario - desconto);

        System.out.printf("O Desconto do INSS é: R$ %.2f%n", desconto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
    }
}

