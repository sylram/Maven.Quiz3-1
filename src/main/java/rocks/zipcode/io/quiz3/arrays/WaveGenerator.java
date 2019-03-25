package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String toLowerCase = str.toLowerCase();

        ArrayList<String> waves = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                waves.add(StringUtils.capitalizeNthCharacter(toLowerCase, i));
                System.out.println(StringUtils.capitalizeNthCharacter(str, i));
            }

        }return waves.toArray(new String[waves.size()]);
    }
}
