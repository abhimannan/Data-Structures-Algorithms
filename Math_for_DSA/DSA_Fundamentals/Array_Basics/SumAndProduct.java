package DSA.Math_for_DSA.DSA_Fundamentals.Array_Basics;

public class SumAndProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum = 0;
        int pro = 1;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            pro*=arr[i];
        }
        System.out.println(sum + " " + pro);
    }
}