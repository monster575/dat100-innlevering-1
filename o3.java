import java.math.BigInteger;
import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("n (>0): ");
            if (!sc.hasNextInt()) { 
                sc.next(); 
                System.out.println("Ugyldig input."); 
                continue; 
            }
            n = sc.nextInt();
            if (n > 0) break;
            System.out.println("Feil: n må være > 0.");
        }
        sc.close();
        BigInteger resultat = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultat = resultat.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + resultat);
    }
}

