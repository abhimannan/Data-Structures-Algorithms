package DSA.Math_for_DSA.DSA_Fundamentals;
import java.util.*;
// Write a C++ program to input a character from user and check whether given character is alphabet, digit or special character.
public class CheckCharOrDigit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num/digit/character");
        char ch = sc.next().charAt(0);
        if(ch>'a' && ch<'z' || ch>'A' && ch<'Z') {
            System.out.println("character");
        }
        else if(ch>='0' && ch<='9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special character");
        }

    }

}
