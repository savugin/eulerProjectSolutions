package problemSix;

public class SumSquareDifference {
    public static void main(String[] args){
        SumSquareDifference.sumSquareDifference();
    }

    private static void sumSquareDifference() {
        long sumSquare = 0;
        long squareSum = 0;
        for(int i = 1; i <=100; i++){
            squareSum += Math.pow(i, 2);
        }
        for(int i = 1; i <=100; i++){
            sumSquare +=i;
        }
        sumSquare = (long) Math.pow(sumSquare, 2);
        System.out.println(sumSquare - squareSum);
    }
}
