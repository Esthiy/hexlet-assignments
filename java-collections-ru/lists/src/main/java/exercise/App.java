package exercise;

import java.util.ArrayList;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        if (symbols.length() < word.length()) {
            return false;
        }

        var wordSymbolsList = getCharsList(word);
        var availableSymbolsList = getCharsList(symbols);

        for (var symbol : wordSymbolsList) {
            if (!availableSymbolsList.remove(symbol)) {
                return false;
            }
        }

        return true;
    }

    private static ArrayList<Character> getCharsList(String word) {
        var charList = word.trim().toLowerCase().chars()
                .mapToObj(e -> (char) e)
                .toList();

        return new ArrayList<>(charList);
    }
}
//END
