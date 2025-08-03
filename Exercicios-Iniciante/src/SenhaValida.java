import java.util.Scanner;

public class SenhaValida {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String passWord;

        System.out.println("Crie uma senha: ");
        System.out.println("Tem que ter pelo menos 8 carac, 1 letra Maiuscula & 1 numero");
        passWord = ler.nextLine();

        boolean temMaiuscula = false;
        boolean temNumero = false;

        for (int i = 0; i < passWord.length(); i++) {
            char c = passWord.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }
            if (Character.isDigit(c)) {
                temNumero = true;
            }
        }
        if (passWord.length() >= 8 && temMaiuscula && temNumero) {
            System.out.println("Senha criada com sucesso");
        } else {
            System.out.println("Senha inválida, tente novamente.");
        }

    }

}
