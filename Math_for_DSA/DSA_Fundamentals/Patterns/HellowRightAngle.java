package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class HellowRightAngle {
    public static void main(String[] args) {
        int N = 5;
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=i;j++) {
                if(i==N || j==1 || i==j) {
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
