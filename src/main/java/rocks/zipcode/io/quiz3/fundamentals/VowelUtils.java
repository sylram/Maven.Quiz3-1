package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            if (word.contains(String.valueOf(vowels[i]))) {
                return true;
            }

        }return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))){
                return i;
            }


        } return -1;
    }


    public static Boolean startsWithVowel(String word) {

        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
//        Character character1 =Character.toLowerCase(character);
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        for (int i = 0; i <vowels.length ; i++) {
//        if(!character1.equals(vowels[i])) {
//        return false;}

    return "AEIOUaeiou".indexOf(character) != -1;

        }
}
