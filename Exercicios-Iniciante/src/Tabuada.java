import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);

        System.out.println("Digite aqui um numero: ");
       int n1 = leitor.nextInt();

       for(int i = 1; i<=10; i++)
       {
           int resul = n1 * i;
           System.out.println(n1 + " x " + i + " = " + resul);
       }
    }
}
