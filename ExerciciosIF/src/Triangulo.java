import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        short n1, n2, n3;

        System.out.println("Digite o primeiro lado: ");
        n1 = ler.nextShort();
        System.out.println("Digite o segundo lado: ");
        n2 = ler.nextShort();
        System.out.println("Digite o terceiro lado: ");
        n3 = ler.nextShort();

        if(n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1 )
        {
            if(n1 == n2 && n2 == n3)
            {
                System.out.println("Triângulo Equilátero");
            }
            else if(n1 == n2 || n2 == n3 || n1 == n3)
            {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        }
        else {
            System.out.println("Os lado não formam um triangulo! Melhore ");
        }
    }
}
