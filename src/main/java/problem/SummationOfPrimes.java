package problem;

public class SummationOfPrimes {
    public static void main(String[] args) {
        SummationOfPrimes.findSummationOfPrimes(2000000);
    }

    private static void findSummationOfPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        for(int i = 2; i * i < n ; i++){
            if(!notPrime[i]){
                for(int j = i * i; j < n; j+=i){
                    notPrime[j] = true;
                }
            }
        }
        long sum = 2;
        for(int i = 3; i < n; i+=2){
            if(!notPrime[i]){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
