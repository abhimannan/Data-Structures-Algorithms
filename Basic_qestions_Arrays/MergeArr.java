import java.util.ArrayList;

public class MergeArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 9, 15};
        int[] arr2 = {2, 5, 8, 10};
        int l1 = arr1.length;
        int l2 = arr2.length;
        int maxLength = Math.max(l1,l2);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++) {
            arr.add(arr1[i]);
            arr.add(arr2[i]);
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
