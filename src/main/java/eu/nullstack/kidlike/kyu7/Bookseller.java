package eu.nullstack.kidlike.kyu7;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Bookseller {
    static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<Character, Long> indexByLetter = new HashMap<>();
        for (String letter : lstOf1stLetter) {
            indexByLetter.putIfAbsent(letter.charAt(0), 0L);
        }

        for (String bookStock : lstOfArt) {
            String[] stockTokens = bookStock.split(" ");
            Long copies = Long.valueOf(stockTokens[1]);
            Character letter = stockTokens[0].charAt(0);
            Optional.ofNullable(indexByLetter.get(letter)).ifPresent(sum -> indexByLetter.put(letter, sum + copies));
        }

        return indexByLetter.entrySet().stream()
                .map(entry -> String.format("(%s : %s)", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(" - "));
    }
}
