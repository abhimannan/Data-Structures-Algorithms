package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class Numberstar {
    public static void main(String[] args) {
        int N = 5;
        for(int i=5;i>=1;i--) {
            int num = 1;
            for(int j=1;j<=i;j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
