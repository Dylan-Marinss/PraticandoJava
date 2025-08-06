import java.util.Scanner;

public class MediaeNotaValida {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1,n2, media;

        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextFloat();
        media = (n1+n2)/2;

        if(n1<=10 && n2<=10)
        {
            if(media>=7){
                System.out.println("Nota valida\n"+ media + "\nAluno aprovado");
            }
            else if(media<7)
            {
                System.out.println("A media é:\n " + media + "\nAluno Reprovado");
            }
        }
        else
        {
            System.out.println("O numero é invalido");
        }
    }
}
