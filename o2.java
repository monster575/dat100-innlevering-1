import java.util.Scanner;

public class o2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poeng = lesGyldigPoeng(sc, i);
            System.out.println("Karakter: " + karakterFor(poeng));
        }
        sc.close();
    }
    private static int lesGyldigPoeng(Scanner sc, int nr) {
        while (true) {
            System.out.print("Poengsum student " + nr + " (0-100): ");
            if (!sc.hasNextInt()) { 
                sc.next(); 
                System.out.println("Ugyldig input."); 
                continue; 
            }
            int p = sc.nextInt();
            if (p < 0 || p > 100) {
                System.out.println("Feil: poeng må være mellom 0 og 100. Prøv igjen.");
            } else {
                return p;
            }
        }
    }
    public static char karakterFor(int p) {
        if (p >= 90) return 'A';
        if (p >= 80) return 'B';
        if (p >= 60) return 'C';
        if (p >= 50) return 'D';
        if (p >= 40) return 'E';
        return 'F';
    }
}

