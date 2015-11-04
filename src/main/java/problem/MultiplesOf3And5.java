package problem;

public class MultiplesOf3And5 {

    public static void main(String[] args){
        MultiplesOf3And5.multipleOf3And5();
    }
    
    public static void multipleOf3And5(){
        int sum = 0;
        for(int i = 1; i <1000; i++){
            if((i % 3 == 0) || (i % 5 == 0)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
