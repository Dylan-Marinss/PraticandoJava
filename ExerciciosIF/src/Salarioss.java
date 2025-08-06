import java.util.Scanner;

public class Salarioss {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        double acresc;
        float salario;
        float vendaMes;

        System.out.println("Digite aqui seu salario fixo");
        salario = ler.nextFloat();
        System.out.println("Digite a venda do mes: ");
        vendaMes = ler.nextFloat();

        if(vendaMes>100000)
        {
            acresc = salario * 2;
            System.out.println("Bonus do mes: " + acresc);
        }
        else
        {
            acresc = salario*1.5;
            System.out.println("O Bonus do mes: " + acresc);
        }
}
}
