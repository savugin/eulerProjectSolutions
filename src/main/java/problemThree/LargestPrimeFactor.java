package problemThree;

public class LargestPrimeFactor {
    public static void main(String[] args){
        LargestPrimeFactor.largestPrimeFactor(5L);
    }
    
    public static void largestPrimeFactor(long number){
        for(int i = 2; i * i< number; i++){
            if(number % i == 0){
                while(number % i == 0){
                    number = number/i;
                }
            }
            if(number != 1){
                System.out.println("Largest Prime Factor: "+ number);
            } else {
                System.out.println("Largest Prime Factor: "+ i);
            }
        }
    }
}
