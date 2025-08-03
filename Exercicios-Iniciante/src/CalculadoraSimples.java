import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        double resSoma, resSub, resMult, resDiv;

        System.out.println("Digite aqui o primeiro numero: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite aqui o segundo numero: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha qual operação você quer fazer: ");
        System.out.println("{1} Adição");
        System.out.println("{2} Subtração");
        System.out.println("{3} Multiplicação");
        System.out.println("{4} Divisão");
        int opcs = scanner.nextInt();

        if(opcs == 1)
        {
            resSoma = num1 + num2;
            System.out.println("O Resultado da soma é: " + resSoma);
        } else if (opcs == 2) {
            resSub = num1 - num2;
            System.out.println("O resultado da subtração é: " +resSub);
        } else if (opcs == 3) {
            resMult = num1 * num2;
            System.out.println("O resultado da Multiplicação é: " +resMult);
        }
        else
        {
            resDiv = num1 / num2;
            System.out.println("O resultado da divisão é: " + resDiv);
        }
    }
}
