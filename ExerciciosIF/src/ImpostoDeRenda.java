import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float salario;
        double ir;

        System.out.print("Digite aqui o seu salario: ");
        salario = ler.nextFloat();

        if(salario < 2112)
        {
            ir = 0;
        }else if(salario <= 2826)
        {
            ir  = (salario * 0.075) - 158.40;
        } else if (salario <= 3751.05) {
            ir = (salario * 0.15) - 370.40;
        } else if (salario<= 4664.68) {
            ir = (salario * 0.225) - 651.73;
        }else
        {
            ir = (salario * 0.275) - 884.96;
        }

        System.out.println("O valor do imposto de renda é: R$"+ ir);
    }
}
