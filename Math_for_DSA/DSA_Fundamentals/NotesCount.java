package DSA.Math_for_DSA.DSA_Fundamentals;
import java.util.*;

public class NotesCount {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int note500=0;
        int note100 = 0;
        int note50 = 0;
        int note20 = 0;
        int note10 = 0;
        int note5 = 0;
        int note2 = 0;
        int note1 = 0;
        
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();

            if(amount >= 500) {
                note500 = amount / 500;
                amount = amount - (note500 * 500);
            }
            if(amount >= 100) {
                note100 = amount / 100;
                amount = amount - (note100 * 100);
            }
            if(amount >= 50) {
                note50 = amount / 50;
                amount = amount - (note50 * 50);
            }
            if(amount > 20) {
                note20 = amount / 20;
                amount = amount - (note20 * 20);
            }
            if(amount >= 10) {
                note10 = amount / 10;
                amount = amount - (note10 * 10);
            }
            if(amount >= 5) {
                note5 = amount / 5;
                amount = amount - (note5 * 5);
            }
            if(amount >= 2) {
                note2 = amount / 2;
                amount = amount - (note2 * 2);
            }
            if(amount > 1) {
                note1 = amount;
            }
        System.out.println("500's = "+note500);
        System.out.println("100's = "+note100);
        System.out.println("50's = "+note50);
        System.out.println("20's = "+note20);
        System.out.println("10's = "+note10);
        System.out.println("5's = "+note5);
        System.out.println("2's = "+note2);
        System.out.println("1's = "+note1);
    }
}