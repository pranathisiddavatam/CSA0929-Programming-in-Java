import java.util.HashSet;
class UniquePermutations {
    public static void main(String[] args) {
        int number = 143;
        System.out.println("Unique permutations of " + number + ":");
        printUniquePermutations(number);
    }

    public static void printUniquePermutations(int number) {
        String numStr = String.valueOf(number);
        HashSet<String> permutations = new HashSet<>();
        generatePermutations("", numStr, permutations);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    private static void generatePermutations(String prefix, String remaining, HashSet<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n), permutations);
            }
        }
    }
}
