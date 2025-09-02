package DSA.Math_for_DSA;

public class Toupper {
    
    public static void main(String[] args) {
        char name = "ABHI";
        // char res = (char)(ch+33);
        // System.out.println(res);
        String str = "";
        for(int i=0;i<name.length;i++) {
            char ch = name.charAt(i);
            String res = (char)(ch+'a');
            str = str+res;
        }
        System.out.println(str);
    }
}
