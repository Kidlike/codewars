package eu.nullstack.kidlike.kyu6;

/**
 * https://www.codewars.com/kata/vasya-clerk/train/java
 */
class VasyaClerk {
    /**
     * The new "Avengers" movie has just been released!
     * There are a lot of people at the cinema box office standing in a huge line.
     * Each of them has a single 100, 50 or 25 dollars bill. An "Avengers" ticket costs 25 dollars.
     * <p>
     * Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
     * <p>
     * Can Vasya sell a ticket to each person and give the change if he initially has no money and
     * sells the tickets strictly in the order people follow in the line?
     * <p>
     * Return YES, if Vasya can sell a ticket to each person and
     * give the change with the bills he has at hand at that moment. Otherwise return NO.
     *
     * <h3>Examples:</h3>
     * <pre>
     * Line.Tickets(new int[] {25, 25, 50}) // => YES
     * Line.Tickets(new int[]{25, 100}) // => NO. Vasya will not have enough money to give change to 100 dollars
     * Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO. Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)
     * </pre>
     */
    static String Tickets(int[] peopleInLine) {
        int reg25 = 0;
        int reg50 = 0;

        for (int bill : peopleInLine) {
            switch (bill) {
                case 25:
                    reg25++;
                    break;
                case 50:
                    reg25--;
                    reg50++;
                    break;
                case 100:
                    if (reg50 > 0) {
                        reg50--;
                        reg25--;
                    } else {
                        reg25 -= 3;
                    }
            }

            if (reg25 < 0 || reg50 < 0) {
                return "NO";
            }
        }

        return "YES";
    }
}
