public final class PasswordGenerator {

    private int passwordLength;
    private char[] caracteres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '!', '@', '#', '$', '%', '&', '*', '(', ')', '{', '}', '[', ']', '?', '/',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    String passwordGenerate = "";

    public PasswordGenerator(int passwordNivel) {
        if (passwordNivel == 1) {
            this.passwordLength = 10;
        } else if (passwordNivel == 2) {
            this.passwordLength = 12;
        } else {
            this.passwordLength = 16;
        }
    }

    public String passwordBuild() {
        StringBuilder stringBuilder = new StringBuilder(this.passwordGenerate);

        while (passwordGenerate.length() < this.passwordLength) {
            //stringBuilder.insert(this.passwordGenerate.length(), chooseChar());
            this.passwordGenerate += chooseChar();
        }

        return this.passwordGenerate;
    }

    public char chooseChar() {

        int index = (int) (Math.random()* caracteres.length);
        return caracteres[index];
        //return (char) (Math.random()* lower.length);
    }

    public String getPasswordGenerate() {
        return this.passwordGenerate;
    }
}
