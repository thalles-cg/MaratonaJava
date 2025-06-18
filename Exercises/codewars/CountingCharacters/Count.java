package Exercises.codewars.CountingCharacters;

interface Count {
    static int countCharOccurrences(String s, char c) {
        int countOccurrences = 0;
        for (char element : s.toCharArray()){
            if (element == c) countOccurrences++;
        }
        return countOccurrences;
    }
}
