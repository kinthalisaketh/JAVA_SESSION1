import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number in words: " + numberToWords(number));
    }
    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String result = "";
        if (num >= 1000) {
            result += convertOnes(num / 1000) + " Thousand ";
            num %= 1000;
        }
        if (num >= 100) {
            result += convertOnes(num / 100) + " Hundred ";
            num %= 100;
        }
        if (num >= 20) {
            result += convertTens(num / 10) + " ";
            num %= 10;
        }
        if (num > 0) {
            result += convertOnes(num) + " ";
        }
        return result.trim();
    }
    private static String convertOnes(int num) {
        switch (num) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }
    private static String convertTens(int num) {
        switch (num) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
            default: return "";
        }
        
 
    }
    
}
