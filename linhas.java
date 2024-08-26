import java.util.Scanner;
public class linhas {

public static void main(String[]args) {
    Scanner t = new Scanner (System.in);
    int n;
    int p = 0;
    System.out.println("Insira um número inteiro: ");
    n = t.nextInt();
    for (int i=1; i<=n; i++) {
        for (int j=1; j<=i; j++){
            System.out.print(j+ " ");
       }
       System.out.println(" ");
    }
    }
}