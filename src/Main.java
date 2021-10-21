import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int passwordNivel;

        Scanner nivel = new Scanner(System.in);
        System.out.println("Selecione o nível da senha que deseja gerar: ");
        System.out.println("1 - 6 caracteres");
        System.out.println("2 - 8 caracteres");
        System.out.println("3 - 10 caracteres");

        passwordNivel = nivel.nextInt();

        if ((passwordNivel <= 3) && (passwordNivel >= 1)) {
            geraSenha(passwordNivel);
        } else {
            System.out.println("Você inseriu um nível inválido.");
        }
    }

    public static void geraSenha(int nivel) {
        PasswordGenerator gerador = new PasswordGenerator(nivel);

        gerador.passwordBuild();

        System.out.println(gerador.getPasswordGenerate());
    }
}
