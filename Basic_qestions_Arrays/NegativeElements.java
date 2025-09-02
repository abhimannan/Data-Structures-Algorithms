public class NegativeElements {
    
    public static void main(String[] args) {
        int[] arr = {-1, -10, 100, 5, 61, -2, -23, 8, -90 ,51};
        for(int i : arr) {
            if(i<0) {
                System.out.print(i+" ");
            }
        }
    }
}
