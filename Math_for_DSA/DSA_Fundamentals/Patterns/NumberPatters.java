package DSA.Math_for_DSA.DSA_Fundamentals.Patterns;

public class NumberPatters {
    static void pattern1(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for(int i=5;i>=1;i--) {
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i==1 || j==1 || i==n || j==n) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        int num = 1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        for(int i=1;i<=n;i++) {
            int num = 1;
            for(int j=1;j<=i;j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    static void pattern7(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(i%2==0) {
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    static void pattern8(int n) {
        for(int i=n;i>=0;i--) {
            int num = i;
            for(int j=i;j>=1;j--) {    
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    static void pattern9(int n) {
        int num = 1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(num);
                if(num == 0) {
                    num = 1;
                }
                else {
                    num = 0;
                }
            }
            System.out.println();
        }
    }
    static void pattern10(int n) {
        int rows = 6;
        int cols = 5;
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                if(i%2 == 0) {
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    static void pattern11(int n) {
        int rows = 6;
        int cols = 5;
        for(int i=1;i<=rows;i++) {
            int nums = 0;
            for(int j=1;j<=cols;j++) {
                System.out.print(nums);
                if(nums == 0) {
                    nums = 1;
                }
                else {
                    nums = 0;
                }
            }
            System.out.println();
        }
    }
    static void pattern12(int n) {
        int rows = 6;
        int cols = 5;
        int num = 1;
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                System.out.print(num);
                if(num == 1) {
                    num = 0;
                }
                else {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
    static void pattern13() {
        int rows = 5;
        int cols = 5;
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                if(i==(3) || j==(3)) {
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    static void pattern14() {
        int rows = 5;
        int cols = 5;
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                if((i==1 && j==1) || (i==1 && j==5) || (i==5 && j==1) || (i==5 && j==5)) {
                    System.out.print("0");
                }
                else if(i==1 || j==1 || i==5 || j==5) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    static void pattern15() {
        int rows = 5;
        int cols = 5;
        for(int i=1;i<=rows;i++) {
            int num = i;
            for(int j=1;j<=cols;j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    static void pattern16() {
        int rows = 5;
        int cols = 5;
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                if(i==1 || j==1) {
                    System.out.print("5");
                }
                else if(i==2 || j==2) {
                    System.out.print("4");
                }
                else if(i==3 || j==3) {
                    System.out.print("3");
                }
                else if(i==4 || j==4) {
                    System.out.print("2");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    static void pattern17() {
        int rows = 5;
        int cols = 5;
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                if(i==1 || j==5) {
                    System.out.print("5");
                }
                else if(i==2 || j==4) {
                    System.out.print("4");
                }
                else if(i==3 || j==3) {
                    System.out.print("3");
                }
                else if(i==4 || j==2) {
                    System.out.print("2");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    static void pattern18(int n) {
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern19(int n) {
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=(n-i+1);j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern20(int n) {
        for(int i=1;i<=n;i++) {
            int num = i;
            for(int j=1;j<=i;j++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
    static void pattern21(int n) {
        for(int i=1;i<=n;i++) {
            int num = i+1;
            for(int j=1;j<=(n-i);j++) {
                System.out.print(num+" ");
                num = num+2;
            }
            System.out.println();
        }
    }
    static void pattern22(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=i+(i-1);j<(n*2);j=j+2) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern23(int n) {
        for(int i=n;i>=1;i--) {
            int num = i+(i-1);
            for(int j=1;j<=(n-i+1);j++) {
                System.out.print(num+" ");
                num = num+2;
            }
            System.out.println();
        }
    }
    static void pattern24(int n) {
        for(int i=0;i<=n;i++) {
            int num = 1;
            for(int j=1;j<=i;j++) {
                System.out.print(num);
                if(num == 0) {
                    num = 1;
                }
                else {
                    num = 0;
                }
            }
            System.out.println();
        }
    }
    static void pattern25(int n) {
        int num = 1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(num);
                if(num == 1) {
                    num = 0;
                }
                else {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
    static void pattern26(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(i==1 || j==1 || i==n || j==i) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern26(n);
    }
}