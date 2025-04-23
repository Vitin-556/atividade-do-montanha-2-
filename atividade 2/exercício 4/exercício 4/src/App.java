public class App {
            public static void main(String[] args) {
                int primeiro = 0;
                int segundo = 1;
                int contador = 2; // Já temos os dois primeiros números
                int totalNumeros = 10;
        
                System.out.print(primeiro + ", " + segundo);
        
                while (contador < totalNumeros) {
                    int proximo = primeiro + segundo;
                    System.out.print(", " + proximo);
        
                    // Atualiza os valores
                    primeiro = segundo;
                    segundo = proximo;
                    contador++;
                }
        
                System.out.println(); // Nova linha no final
            }
        
    }

