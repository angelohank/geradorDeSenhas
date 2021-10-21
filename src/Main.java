import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int passwordNivel;
        int opcaoMenu;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("1 - Gerar nova senha");
            System.out.println("2 - Sair");
            opcaoMenu = entrada.nextInt();

            if (opcaoMenu == 1) {
                exibeMenuGeracaoDeSenha(entrada);
            }
        } while (opcaoMenu != 2);

    }

    private static void exibeMenuGeracaoDeSenha(Scanner entrada) {
        int passwordNivel;
        System.out.println("Selecione o nível da senha que deseja gerar: ");
        System.out.println("1 - 6 caracteres");
        System.out.println("2 - 8 caracteres");
        System.out.println("3 - 10 caracteres");
        passwordNivel = entrada.nextInt();

        if ((passwordNivel <= 3) && (passwordNivel >= 1)) {
            geraSenha(passwordNivel);
        } else {
            System.out.println("Você inseriu um nível inválido.");
        }
    }

    public static void geraSenha(int nivel) {
        PasswordGenerator gerador = new PasswordGenerator(nivel);

        gerador.passwordBuild();
        System.out.println("Sua senha é: " + gerador.getPasswordGenerate());
    }
}
