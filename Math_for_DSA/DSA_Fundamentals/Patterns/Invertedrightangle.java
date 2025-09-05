public class InvertedRightAngle {
    
    public static void main(String[] args) {
        int N = 5;
        for(int i=0;i<N;i++) {
            for(int j=1;j<=(N-i);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
