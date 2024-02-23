import java.util.Scanner;
public class MiddleString {
    private static boolean isMiddle(String word1, String word2, String word3) {
        return (word1.compareTo(word2) <= 0 && word2.compareTo(word3) <= 0) || 
                (word3.compareTo(word2) <= 0 && word2.compareTo(word1) <= 0);
    }  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three Strings");
        String word1 = input.nextLine().trim();
        String word2 = input.nextLine().trim();
        String word3 = input.nextLine().trim();
        if (isMiddle(word1, word2, word3)) {
            //word 2 would be printed if its in the middle
            System.out.println(word2);
        } else if (isMiddle(word2, word1, word3)) { 
            //Word 1 is the middle word so it will be printed
            System.out.println(word1);
        } else { 
            //Word 3 is the middle word so it will be printed
            System.out.println(word3);
        }
    }
}