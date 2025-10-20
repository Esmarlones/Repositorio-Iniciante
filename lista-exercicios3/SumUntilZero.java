import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int soma = 0;
        int num;

        do {
            System.out.println("Digite um numero (0 para sair)");
            num = sc.nextInt();

            soma =+ num;
        } 
        while ( num != 0);
        System.out.println( "Soma Total: " + soma );

        sc.close();

    }
}
