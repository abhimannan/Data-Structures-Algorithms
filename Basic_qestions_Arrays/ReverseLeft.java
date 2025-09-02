public class ReverseLeft {
    public static void Reverse(int[] arr,int start,int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        Reverse(arr,0,arr.length-1);
        Reverse(arr,arr.length-k,arr.length-1);
        Reverse(arr,0,arr.length-k-1);
        for(int i : arr) {
            System.out.print(i+" ");
        }

    }
}
