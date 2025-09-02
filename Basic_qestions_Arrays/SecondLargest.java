public class SecondLargest {
    
    public static void main(String[] args) {
        int[] arr = {7, 2 ,3 ,8 ,6 ,6 ,75 ,38 ,3 ,2};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++) {
            if(largest < arr[i] && arr[i]!=largest) {
                secondLargest = largest;
                largest = arr[i];
                
            }
            else if(arr[i] < largest && secondLargest<arr[i]) {
                secondLargest = arr[i];
            }
         }
         if(secondLargest == -1) {
            System.out.println(-1);
         }
         else {
            System.out.println(secondLargest);
         }

    }
}
