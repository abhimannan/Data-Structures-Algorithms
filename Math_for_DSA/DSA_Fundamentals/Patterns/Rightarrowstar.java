package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class Rightarrowstar {
    public static void main(String[] args) {
        int N = 5;
        int spaces = 0;
        int stars = N;
        for(int i=1;i<(N*2);i++) {
            // spaces
            for(int sp=1;sp<=spaces;sp++) {
                System.out.print(" ");
            }
            // stars
            for(int st=1;st<=stars;st++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<N) {
                spaces = spaces+2;
                stars--;
            }
            else {
                spaces = spaces-2;
                stars++;
            }
        }
    }
}
