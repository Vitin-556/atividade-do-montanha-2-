import java.util.Scanner;


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite números positivos para somar. Digite um número negativo para sair.");

        // Solicita o primeiro número
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;

            // Solicita o próximo número
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        }

        System.out.println("A soma dos números positivos é: " + soma);
        scanner.close();

    }

