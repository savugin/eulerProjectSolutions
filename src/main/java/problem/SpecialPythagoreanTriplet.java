package problem;

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        SpecialPythagoreanTriplet.findPythagoreanTriplet();
    }

    private static void findPythagoreanTriplet() {
        outerLoop:for(int i = 1; i < 1000; i++){
            for(int j = 1; j < 1000; j++){
                long squareSum = (long) (Math.pow(i, 2) + Math.pow(j, 2));
                double squareRoot = Math.sqrt(squareSum);
                if( squareRoot == (int)squareRoot){
                    int sum = i + j + (int)squareRoot;
                    if(sum == 1000){
                        System.out.println("Value of a b c are: "+i+" "+j+" "+(int)squareRoot+" And sum: "+ sum + "And product of abc: " + (i * j * (int)squareRoot));
                        break outerLoop; 
                    }
                }
            }
        }
    }
}
