public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,7,8,8,3,5};
        // counting sort algorithm
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        // creating count array with size if largest+1
        int[] count = new int[largest+1];
        // storing the frequencies into the count array
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        // finding that duplicate values in the array if frequency>1
        int frequency = 0;
        for(int i=0;i<count.length;i++) {
            if(count[i] > 1) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }    
}
