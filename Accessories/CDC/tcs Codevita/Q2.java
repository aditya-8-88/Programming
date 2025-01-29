import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        processInput();
    }

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        
        List<String> segmentPatterns = new ArrayList<>();
        List<String> placementPatterns = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            segmentPatterns.add(scanner.nextLine().strip());
        }
        
        for (int i = 0; i < 3; i++) {
            placementPatterns.add(scanner.nextLine().strip());
        }

        Map<Integer, String> digitPatterns = generateDigitPatterns(segmentPatterns);

        List<List<Integer>> possibleDigitCombinations = findPossibleDigitCombinations(placementPatterns, digitPatterns);

        if (possibleDigitCombinations.isEmpty()) {
            System.out.print("Invalid");
            scanner.close();
            return;
        }

        int sum = calculateTotalSum(possibleDigitCombinations);
        System.out.print(sum);

        scanner.close();
    }

    public static Map<Integer, String> generateDigitPatterns(List<String> segmentPatterns) {
        Map<Integer, String> digitPatterns = new HashMap<>();
        
        for (int digit = 0; digit < 10; digit++) {
            StringBuilder pattern = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                pattern.append(segmentPatterns.get(row).substring(digit * 3, (digit + 1) * 3));
            }
            digitPatterns.put(digit, pattern.toString());
        }

        return digitPatterns;
    }

    public static List<List<Integer>> findPossibleDigitCombinations(List<String> placementPatterns, Map<Integer, String> digitPatterns) {
        List<List<Integer>> possibleDigitCombinations = new ArrayList<>();
        
        for (int i = 0; i < placementPatterns.get(0).length() / 3; i++) {
            StringBuilder currentPattern = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                currentPattern.append(placementPatterns.get(row).substring(i * 3, (i + 1) * 3));
            }

            List<Integer> matchingDigits = findMatchingDigits(digitPatterns, currentPattern.toString());

            if (matchingDigits.isEmpty()) {
                return Collections.emptyList();
            }
            possibleDigitCombinations.add(matchingDigits);
        }

        return possibleDigitCombinations;
    }

    public static List<Integer> findMatchingDigits(Map<Integer, String> digitPatterns, String currentPattern) {
        List<Integer> matchingDigits = new ArrayList<>();
        
        for (Map.Entry<Integer, String> entry : digitPatterns.entrySet()) {
            int differenceCount = 0;
            String pattern = entry.getValue();

            for (int i = 0; i < currentPattern.length(); i++) {
                if (currentPattern.charAt(i) != pattern.charAt(i)) {
                    differenceCount++;
                }
            }

            if (differenceCount <= 1) {
                matchingDigits.add(entry.getKey());
            }
        }
        
        return matchingDigits;
    }

    public static int calculateTotalSum(List<List<Integer>> possibleDigitCombinations) {
        int totalSum = 0;
        
        for (List<Integer> combination : generateCombinations(possibleDigitCombinations)) {
            StringBuilder number = new StringBuilder();
            for (int digit : combination) {
                number.append(digit);
            }
            totalSum += Integer.parseInt(number.toString());
        }

        return totalSum;
    }

    public static List<List<Integer>> generateCombinations(List<List<Integer>> possibleDigitCombinations) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationsHelper(possibleDigitCombinations, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateCombinationsHelper(List<List<Integer>> possibleDigitCombinations, int index, List<Integer> currentCombination, List<List<Integer>> result) {
        if (index == possibleDigitCombinations.size()) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int digit : possibleDigitCombinations.get(index)) {
            currentCombination.add(digit);
            generateCombinationsHelper(possibleDigitCombinations, index + 1, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
