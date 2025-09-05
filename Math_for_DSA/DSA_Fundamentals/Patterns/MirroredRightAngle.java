package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class MirroredRightAngle {
    public static void main(String[] args) {
        int N = 5;
        for(int i=1;i<=N;i++) {
            // spaces
            for(int s=1;s<=(N-i);s++) {
                System.out.print(" ");
            }
            // stars
            for(int st=1;st<=i;st++) {
                if(st==1 || i==N || st==(i)) {
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
