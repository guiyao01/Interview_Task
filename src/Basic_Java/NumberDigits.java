package Basic_Java;

/**
 * 1, 1, 2, 3, 5, 8, 13, 21, 34...
 * What is the 30th digit? Use a recursive algorithm to implement
 */
public class NumberDigits {
    int helper(int n) {
        if(n==0)
            return 0;
        if(n > 0 && n <= 2){
            return 1;
        }
        return helper(n-1)+helper(n-2);
    }
    public static void main(String[] args) {
        NumberDigits n = new NumberDigits();
        System.out.println("Result :"+n.helper(30));
    }
}
