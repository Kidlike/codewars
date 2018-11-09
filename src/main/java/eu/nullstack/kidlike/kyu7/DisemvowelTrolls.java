package eu.nullstack.kidlike.kyu7;


/**
 * https://www.codewars.com/kata/disemvowel-trolls/train/java
 */
class DisemvowelTrolls {
    /**
     * Trolls are attacking your comment section!
     * <p>
     * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
     * <p>
     * Your task is to write a function that takes a string and return a new string with all vowels removed.
     * <p>
     * For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
     * <p>
     * Note: for this kata y isn't considered a vowel.
     */
    static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}
