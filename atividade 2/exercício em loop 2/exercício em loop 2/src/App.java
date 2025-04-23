import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       


    
        Scanner scanner = new Scanner(System.in);
        int numero;
        long fatorial = 1;

        System.out.print("Digite um número inteiro positivo: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Por favor, digite um número positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }


    }

