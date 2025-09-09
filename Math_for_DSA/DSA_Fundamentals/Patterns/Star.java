package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class Star {
    public static void main(String[] args) {
        int N = 5;
        for(int i=1;i<(N*2);i++) {
            for(int j=1;j<=N;j++) {
                if(i==1 || j==N || i==(N*2-1) || j==N || j==1 || i==N) {
                    if((i==1 && j==1) || (i==1 && j==N) || (i==N && j==1) || (i==N && j==N) || (i==(N*2-1) && (j==1) || (i==N*2-1 && j==N))) {
                        System.err.print(" ");
                    }
                    else {
                         System.out.print("*");
                    }
                   
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
