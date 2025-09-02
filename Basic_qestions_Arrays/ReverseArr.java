public class ReverseArr {
    public static int[] Reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 16, 35, 500};
        Reverse(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
