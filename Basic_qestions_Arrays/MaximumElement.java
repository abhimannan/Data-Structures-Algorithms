public class MaximumElement {
    public static int FindMaximumElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int FindMiniumElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {10, 50, 12, 16, 2};
        int large = FindMaximumElement(arr);
        int small = FindMiniumElement(arr);
        System.out.println("max"+large);
        System.out.println("min"+small);
    }
}
