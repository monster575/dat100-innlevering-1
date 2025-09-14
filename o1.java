package o1o4;
import java.util.Scanner;
public class o1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bruttoinntekt (kr): ");
        double inntekt = sc.nextDouble();
        sc.close();

        if (inntekt <= 0) {
            System.out.println("Ugyldig inntekt.");
            return;
        }
        double skatt = 0.0;
        skatt += trinn(inntekt, 217_401, 306_050) * 0.017; 
        skatt += trinn(inntekt, 306_051, 697_150) * 0.040;  
        skatt += trinn(inntekt, 697_151, 942_400) * 0.137;   
        skatt += trinn(inntekt, 942_401, 1_410_750) * 0.167; 
        if (inntekt > 1_410_750) {
            skatt += (inntekt - 1_410_750) * 0.177;         
        }
        System.out.printf("Trinnskatt: %.2f kr%n", skatt);
    }
    private static double trinn(double inntekt, int nedre, int ovre) {
        if (inntekt < nedre) return 0.0;
        double grunnlag = Math.min(inntekt, ovre) - nedre + 0.0;
        return Math.max(grunnlag, 0.0);
    }
}