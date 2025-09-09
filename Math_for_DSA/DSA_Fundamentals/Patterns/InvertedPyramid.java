package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class InvertedPyramid {
    public static void main(String[] args) {
        int N = 5;
        for(int i=5;i>=1;i--) {
            // spaces
            for(int sp=1;sp<=(N-i);sp++) {
                System.out.print(" ");
            }
            // stars
            for(int st=1;st<=(i*2)-1;st++) {
                if(i==N || st==1 || st==(i*2-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
