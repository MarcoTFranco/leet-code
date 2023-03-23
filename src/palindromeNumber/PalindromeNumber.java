package palindromeNumber;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuilder newNum = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            newNum.append(num.charAt(i));
        }
        return num.equals(newNum.toString());
    }

}
