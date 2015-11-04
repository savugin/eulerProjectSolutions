package problem;

public class DigitFifthPowers {
    public static void main(String[] args) {
        DigitFifthPowers.findDigitFifthPowers();
    }

    private static void findDigitFifthPowers() {
        long sum = 0;
        int sumOfAll = 0;
        for(int i = 0; i < 10000; i++){        
            sum = find(i);
            if(i == sum){
                sumOfAll += i;
            }
        }
        System.out.println(sumOfAll);
    }

    private static long find(int sum) {
        int[] splitedList = new int[4];
        int i = 0;
        while (sum > 0){
            splitedList[i] = sum % 10;
            sum /=10;
            i++;
        }
        return (long) (Math.pow(splitedList[0], 5) + Math.pow(splitedList[1], 5) + Math.pow(splitedList[2], 5) + Math.pow(splitedList[3], 5));
    }
}
