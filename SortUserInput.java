import java.util.*;

public class SortUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] inputArray = new String[n];

        System.out.println("Enter the elements (e.g., words or numbers): ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextLine();
        }

        Arrays.sort(inputArray);

        System.out.println("Sorted elements: ");
        for (String item : inputArray) {
            System.out.println(item);
        }

        scanner.close();
    }
}
