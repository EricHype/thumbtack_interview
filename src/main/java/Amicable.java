import java.util.HashMap;

/**
 * Created by eheitmuller on 5/22/17.
 */
/*
*
* Numbers are considered amicable if the sum of all the proper divisors of two numbers are equal
*
* ie: 1184's divisors sum to 1210, 1210's divisors sum to 1184
*
* */

public class Amicable {

    static HashMap<Integer, Integer> amicableMap = new HashMap<>();

    public static void main(String[] args) {

        Integer limit = 10000;

        //fill map
        for(int i=1; i< limit; i++){
            amicableMap.put(i, getSumOfProperDivisors(i));
        }

        //check for amicability
        for(Integer key : amicableMap.keySet()){
            Integer value = amicableMap.get(key);
            Integer pairedValue = amicableMap.get(value);

            if(key.equals(pairedValue)){
                System.out.println(key + " and " + value + " are amicable");
            }
        }

    }

    public static Integer getSumOfProperDivisors(Integer number){
        Integer sum = 0;
        for(int i=1; i<= Math.ceil(number / 2.0); i++){
            if(number % i == 0 ){
                sum += i;
            }
        }
        return sum;
    }
}
