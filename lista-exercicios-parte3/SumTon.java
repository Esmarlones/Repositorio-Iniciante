import java.util.Scanner;

public class SumTon {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero desejado: ");

        int n = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <=n ; i++) {
            soma += 1;

        }

        System.out.println(" A soma de 1 até: " + n + " é :" + soma);

        sc.close();
    }
}
