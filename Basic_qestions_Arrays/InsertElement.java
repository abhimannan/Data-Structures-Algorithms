import java.util.ArrayList;
import java.util.Arrays;

public class InsertElement {
    
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int ele = 25;
        int pos = 3;
        int[] newArr = new int[arr.length+1];
        ArrayList<Integer> addValue = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            addValue.add(arr[i]);
        }
        addValue.add(pos-1,25);
        for(int i : addValue) {
            System.out.print(i+" ");
        }
        System.out.println();
        // remove at 2nd index
        addValue.remove(2);
        for(int i : addValue) {
            System.out.print(i+" ");
        }
        // for(int i=0;i<pos-1;i++) {
        //     newArr[i] = arr[i];
        // }
        // newArr[pos-1] = ele;
        // for(int i=pos;i<newArr.length;i++) {

        //     newArr[i] = arr[i-1];
        // }
        // for(int i : newArr) {
        //     System.out.print(i+ " ");
        // }
        
    }
}
