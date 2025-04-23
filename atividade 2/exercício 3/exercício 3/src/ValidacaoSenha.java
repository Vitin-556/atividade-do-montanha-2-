import java.util.Scanner;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";
        String senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(SENHA_CORRETA)) {
            System.out.println("Senha incorreta, tente novamente.");
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Acesso concedido");
        scanner.close();
    }


