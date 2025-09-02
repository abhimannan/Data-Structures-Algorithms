public class RotateKtimes {
    public static void Reverse(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        for(int i=0;i<k;i++) {
            Reverse(arr);
        }
        for(int i : arr) {
            System.out.print(i+" ");
        }

    }
}
