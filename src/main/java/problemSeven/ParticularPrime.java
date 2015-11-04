package problemSeven;

public class ParticularPrime {
    public static void main(String[] args){
        ParticularPrime.find10001stPrime();
    }

    private static void find10001stPrime() {
        long s = System.currentTimeMillis();
        int countPosition = 0;
        int lastPrime = 0;
        for(int i = 2; ; i++){
            boolean count = true; 
            int j = 2;
            while( j < i){
                if(i % j == 0){
                    count = false;
                    j = i;
                } else {
                    j++;
                }
            }
            if(count == true){
                lastPrime = i;
                countPosition++; 
            }
            if (countPosition == 10001){
                System.out.println("The 10001st Position prime is: " + lastPrime);
                break;
            }
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }

}
