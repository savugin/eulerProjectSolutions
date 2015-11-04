package problem;

public class SmallestMultiple {
    public static void main(String[] args){
        SmallestMultiple.smallestMultiple();
    }

    private static void smallestMultiple() {
        for(int i = 20; ; i++){
            int a = 0;
            for(int j = 2; j <= 20; j++){
                if(i % j > 0) {
                    break;
                }
                a++;
            }
            if(a == 20){
                System.out.println(i);
                break;
            }
        }
        
    }
}
