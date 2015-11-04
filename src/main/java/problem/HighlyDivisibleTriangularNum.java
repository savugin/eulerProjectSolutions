package problem;

public class HighlyDivisibleTriangularNum {
    public static void main(String[] args) {
        HighlyDivisibleTriangularNum.findHighlyDivisibleTriangularNum();
    }

    private static void findHighlyDivisibleTriangularNum() {   
        int diviserCount = 0;
        int triagularNumber = 0;
        for(int i=1; ;i++){
            triagularNumber += i;
            if(triagularNumber > 1000){
                diviserCount = numberOfDivisers(triagularNumber);
            }
            if(diviserCount > 500){
               System.out.print("What is the value of the first triangle number to have over five hundred divisors: " + triagularNumber); 
               break;
            }
        }
    }

    private static int numberOfDivisers(int triagularNumber) {
        int diviserCount = 1;
        int i = triagularNumber;
        while(i > 1){
            if(triagularNumber % i == 0){
                diviserCount++;
            }
            i--;
        }
        return diviserCount;        
    }
    
}
