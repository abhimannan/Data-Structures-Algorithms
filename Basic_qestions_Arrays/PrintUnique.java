import java.util.ArrayList;

public class PrintUnique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
        // find largest
        int large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > large) {
                large = arr[i];
            }
        }
        int[] count = new int[large+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        // store the unique elements in the array
        ArrayList<Integer> unique = new ArrayList<>();
        for(int i=0;i<count.length;i++) {
            if(count[i] == 1) {
                unique.add(i);
            }
        }
        for(int i : unique) {
            System.out.print(i + " ");
        }
    }
}
