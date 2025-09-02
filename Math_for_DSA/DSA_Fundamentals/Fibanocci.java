package DSA.Math_for_DSA.DSA_Fundamentals;

public class Fibanocci {
    public static void main(String[] args) {
        int n = 10;
        int pre = 0;
        int next = 1;
        // System.out.print(pre+" "+next+" ");
        int res = 0;
        int i = 0;
        while(i < n) {
            System.out.print(res + " ");
            pre = next;
            next = res;
            res = pre+next;
            i++;
        }
    }
}