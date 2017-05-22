/**
 * Created by eheitmuller on 5/22/17.
 */

/*
*
* If a number is even divide it by two, if it is odd perform (3n + 1), find the number with the largest amount of steps
* under 1m
*
* */


public class LargestStep {

    public static void main(String[] args) {

        int limit = 1000000;

        Integer numberWithLargestNumberOfSteps = -1;
        Long largestNumberOfSteps = -1L;

        for(int i=limit; i>=1; i--){
            Long steps = getNumberOfSteps(i);
            if(steps > largestNumberOfSteps){
                largestNumberOfSteps = steps;
                numberWithLargestNumberOfSteps = i;
            }
        }

        System.out.println("Largest number: " + numberWithLargestNumberOfSteps + " steps taken: " + largestNumberOfSteps);
    }


    public static Long getNumberOfSteps(Integer number){
        Long numberOfSteps = 0L;
        Integer currentNumber = number;
        while(currentNumber > 1){
            if(currentNumber % 2 == 0){
                currentNumber /= 2;
            } else {
                currentNumber = (3 * currentNumber) + 1;
            }
            numberOfSteps++;
        }

        return numberOfSteps;
    }
}
