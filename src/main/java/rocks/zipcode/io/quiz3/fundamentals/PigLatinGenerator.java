package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String translate = "";
        String[] split = str.split(" ");
        if (split.length > 1) {
            for (int i = 0; i < split.length; i++) {
                translate += addWay(split[i]) + " ";
            }

            return translate.trim();}

        else return addWay(str);
    }

    public String addWay(String str) {
        String result = "";
        Integer index = VowelUtils.getIndexOfFirstVowel(str);
        if (VowelUtils.startsWithVowel(str)) {

            result = str + "way";

        } if(!VowelUtils.hasVowels(str)&&!VowelUtils.startsWithVowel(str)){
            result = str +"ay";
        }

        if(!VowelUtils.startsWithVowel(str)) {
            for (int i = 0; i < index; i++) {
                result = str.substring(index, str.length()) + str.substring(0,index)+"ay";

            }

        }return result;
    }
}
