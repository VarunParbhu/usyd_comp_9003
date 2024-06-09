import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        List<String> combination = new ArrayList<>();
        combination.add("A");
        combination.add("B");

        List<String> permutations = generatePermutations(combination, 3);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> generatePermutations(List<String> combination, int length) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper(combination, length, "", permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(List<String> combination, int length, String current, List<String> permutations) {
        if (current.length() == length) {
            permutations.add(current);
            return;
        }
        for (String item : combination) {
            generatePermutationsHelper(combination, length, current + item, permutations);
        }
    }
}
