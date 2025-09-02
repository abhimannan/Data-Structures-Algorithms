package DSA.Math_for_DSA.DSA_Fundamentals;

public class PrimesRange {
    static void Prime(int range) {
        boolean[] arr = new boolean[range+1];
        for(int i=2;i<=Math.sqrt(range);i++) {
            if(!arr[i]) {
                for(int j=i*2;j<=range;j+=i) {
                    arr[j] = true;
                }
            }
        }
        for(int i=2;i<arr.length;i++) {
            if(!arr[i]) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int range = 20;
        Prime(range);
    }
}
