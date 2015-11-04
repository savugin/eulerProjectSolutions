package problemTwo;

public class EvenFibonacciNumber {
    public static void main(String[] args){
        EvenFibonacciNumber.evenFibonacciNumber();
    }
    
    public static void evenFibonacciNumber(){
        int lastFib = 2;
        int secondLastFib = 1;
        int evenSum = 0;
        for(int i = 1; ; i++){
            if(i == 1 || i == 2){
                if(i % 2 == 0){
                    evenSum += i;
                }
            } else {
                int latestfib = secondLastFib + lastFib;
                if(latestfib > 4000000){
                    break;
                }
                if(latestfib % 2 == 0){
                    evenSum += latestfib;
                }
                secondLastFib = lastFib;
                lastFib = latestfib; 
            }
        }
        System.out.println("Even Sum: "+evenSum);
    }
}
