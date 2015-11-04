package problem;


public class LargestPalindrome {
    public static void main(String[] args){
        LargestPalindrome.largestPalindrome();
    }

    private static void largestPalindrome() {
        int largestValue = 0;
        for(int i = 999; i >=100; i--){
            for(int j = 999; j >= 100; j--){
                int multiplesResult = i * j;
                StringBuffer multiplesResultString = new StringBuffer(Integer.toString(multiplesResult));
                String reverseString = "";
                for(int k = multiplesResultString.length()-1; k >= 0; k--){
                    reverseString += multiplesResultString.charAt(k);
                }
                if(multiplesResultString.toString().equals(reverseString)){
                    if(multiplesResult > largestValue){
                        largestValue = multiplesResult;
                    }
                }
            }
        }
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + largestValue);
    }
}
