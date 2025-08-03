import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        double n1, n2, n3, resp;
        String nomeAluno;

        System.out.println("Digite aqui o nome do aluno: ");
        nomeAluno = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextDouble();
        resp = (n1+n2+n3)/3;

        if(resp<=6)
        {
            System.out.println("O aluno\n" + nomeAluno + "teve a media\n" + resp + "\nESTA REPROVADO");
        }
        else
        {
            System.out.println("O aluno\n" +nomeAluno + "Teve a media\n " + resp + "\nESTA APROVADO");
        }
    }
}
