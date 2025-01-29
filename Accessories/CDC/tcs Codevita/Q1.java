import java.util.*;

public class Q1 {

    private static int calculate(String op, int x, int y) {
        switch (op) {
            case "AND":
                return x & y;
            case "OR":
                return x | y;
            case "NAND":
                return ~(x & y) & 1;
            case "NOR":
                return ~(x | y) & 1;
            case "XOR":
                return x ^ y;
            default:
                return 0;
        }
    }

    private static void compute(Map<String, String[]> exprMap, Map<String, int[]> valMap, String target, int cycles) {
        Map<String, int[]> outputMap = new HashMap<>();
        for (String key : exprMap.keySet()) {
            outputMap.put(key, new int[cycles]);
        }

        for (int i = 1; i < cycles; i++) {
            for (String key : exprMap.keySet()) {
                String[] expr = exprMap.get(key);
                String op = expr[0], x = expr[1], y = expr[2];
                int a = getValue(x, outputMap, valMap, i - 1);
                int b = getValue(y, outputMap, valMap, i - 1);
                outputMap.get(key)[i] = calculate(op, a, b);
            }
        }

        int[] result = outputMap.get(target);
        for (int i = 0; i < cycles; i++) {
            System.out.print(result[i] + (i == cycles - 1 ? "" : " "));
        }
    }

    private static int getValue(String var, Map<String, int[]> outputMap, Map<String, int[]> valMap, int cycle) {
        return valMap.containsKey(var) ? valMap.get(var)[cycle] : outputMap.get(var)[cycle];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, String[]> exprMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split("=");
            String key = parts[0].trim();
            String[] values = parts[1].trim().split("[(), ]+");
            exprMap.put(key, values);
        }

        int cycles = Integer.parseInt(sc.nextLine());
        Map<String, int[]> valMap = new HashMap<>();

        while (true) {
            String line = sc.nextLine();
            if (line.matches("[a-zA-Z]+")) {
                compute(exprMap, valMap, line.trim(), cycles);
                break;
            }

            String[] input = line.split(" ");
            String var = input[0];
            int[] values = Arrays.stream(input, 1, input.length).mapToInt(Integer::parseInt).toArray();
            valMap.put(var, values);
        }

        sc.close();
    }
}
