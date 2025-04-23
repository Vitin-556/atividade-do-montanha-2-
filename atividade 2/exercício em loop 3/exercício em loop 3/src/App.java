public class App {
    
        
            public static void main(String[] args) {
                int[] numeros = {3, 7, 2, 8, 1, 5, 4, 6, 9, 10}; // Vetor com 10 elementos
                int soma = 0;
        
                for (int i = 0; i < numeros.length; i++) {
                    soma += numeros[i];
                }
        
                System.out.println("A soma dos elementos do vetor é: " + soma);
            }
    
        
    }

