public class Lcm {
    static int gcd(int a,int b) {
        while(a>0 && b>0) {
            if(a>0 && b>0) {
                a = a%b;
            }
            else {
                b = b%a;
            }
        }
        if(a==0) {
                return b;
            }
            else {
                return a;
            }
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int[] arr = new int[2];
        arr[0] = (a*b)/(gcd(a,b));
        arr[1] = gcd(a,b);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}