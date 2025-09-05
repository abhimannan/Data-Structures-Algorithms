package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class PyramidStar {
    public static void main(String[] args) {
        int N = 5;
        for(int i=1;i<=5;i++) {
            // spaces
            for(int sp=1;sp<=(N-i);sp++) {
                System.out.print(" ");
            }
            // stars
            for(int st=1;st<=(i*2-1);st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
