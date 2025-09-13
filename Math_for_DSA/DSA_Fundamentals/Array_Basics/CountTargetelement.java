package DSA.Math_for_DSA.DSA_Fundamentals.Array_Basics;

public class CountTargetelement {
    public static void main(String[] args) {
        int[] arr = {};
        int target = 2;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                count++;
            }
        }
        System.out.println("The no. of time the "+target+"accures"+count);
    }
}
