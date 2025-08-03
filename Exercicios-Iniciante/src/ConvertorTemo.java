import java.util.Scanner;

public class ConvertorTemo {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        int Cels, Farh;
        System.out.println("Digite aqui a temperatura em Celsius: ");
        Cels = ler.nextInt();

        Farh = (Cels * 9/5) +32;
        System.out.println("A temperatura em Fahrenheit é: " + Farh);

    }
}
