public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 10; // Number of rows of Pascal's triangle to print

        for (int line = 0; line < n; line++) {
            for (int space = 0; space < n - line - 1; space++) {
                System.out.print(" ");
            }
            
            int number = 1;  // First number in each row is 1
            for (int i = 0; i <= line; i++) {
                System.out.print(number + " ");
                number = number * (line - i) / (i + 1);  // Calculate next number in the row
            }
            
            System.out.println();  // Move to the next line
        }
    }
}
