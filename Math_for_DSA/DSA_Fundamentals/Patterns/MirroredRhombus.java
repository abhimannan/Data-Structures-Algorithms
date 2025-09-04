package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class MirroredRhombus {
    public static void main(String[] args) {
        int N = 5;
        for(int i=N;i>=1;i--) {
            // spaces
            for(int s=1;s<=(N-i);s++) {
                System.out.print(" ");
            }
            // stars
            for(int st=1;st<=N;st++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
