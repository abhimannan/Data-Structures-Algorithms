package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class Plus {
    public static void main(String[] args) {
        int N = 5;
        for(int i=1;i<(N*2);i++) {
            for(int j=1;j<(N*2);j++) {
                if(i==5 || j==N) {
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
