package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType find =null;
        for (int i = 0; i <array.length ; i++) {
            if(getNumberOfOccurrences(array[i])%2!=0)
                find = array[i];
        }
        return find;

    }

    public SomeType findEvenOccurringValue() {
        SomeType find =null;
        for (int i = 0; i <array.length ; i++) {
            if(getNumberOfOccurrences(array[i])%2==0)
                find = array[i];
        }
        return find;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count =0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==valueToEvaluate){
                count += 1;
            }

        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        ArrayList<SomeType> result = new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            if(predicate.apply(array[i])){
                result.add(array[i]);
            }

        }
        SomeType[] filtered = Arrays.copyOf(array, result.size());
        return result.toArray(filtered);
    }
}
