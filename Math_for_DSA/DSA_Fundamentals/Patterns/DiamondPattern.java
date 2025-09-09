package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int N = 5;
        int spaces = N-1;
        int star = 1;
        for(int i=1;i<N*2;i++) {
            // spaces
            for(int sp=1;sp<=(spaces);sp++) {
                System.out.print(" ");
            }
            // stars
            for(int st=1;st<(star*2);st++) {
                System.out.print("*");
            }
            System.out.println();
            // spaces and starts ++,-- based on the conditions
            if(i<N) {
                spaces--;
                star++;
            }
            else {
                spaces++;
                star--;
            }
        }
    }
}
