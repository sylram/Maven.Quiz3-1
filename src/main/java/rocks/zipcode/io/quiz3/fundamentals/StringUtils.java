package rocks.zipcode.io.quiz3.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        Character index = Character.toUpperCase(str.charAt(indexToCapitalize));
       String replaced = str.substring(0,indexToCapitalize)+index+str.substring(indexToCapitalize+1,str.length());

//        StringBuilder stringBuilder = new StringBuilder(str);
//        stringBuilder.replace(indexToCapitalize-1,indexToCapitalize,index.toString());
        return replaced;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        return baseString.charAt(indexOfString)==characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> subStrings = new ArrayList<>();

        for (int i = 0; i <string.length() ; i++) {

            for (int j = i+1; j <string.length()+1 ; j++) {

                subStrings.add(string.substring(i,j));
                System.out.println(string.substring(i,j));

            }

        }
        Set<String> set = new HashSet<>(subStrings);
        return set.toArray(new String[set.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
