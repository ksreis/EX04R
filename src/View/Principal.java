package View;
import java.util.Scanner;
import Controller.Vezes;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número de 10 a 999999: ");
        int n = sc.nextInt();
        
        System.out.print("Digite o segundo número de de 0 a 9: ");
        int dig = sc.nextInt();
        
        if (dig < 0 || dig > 9) {
            System.out.println(" Incorreto.");
            System.exit(0);
        }
        
        int count = Vezes.cDigit(n, dig);
        
        System.out.printf("O 2º N %d aparece %d vezes no 1º N %d.", dig, count, n);
        
        sc.close();
    }
}