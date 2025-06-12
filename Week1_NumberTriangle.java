public class Week1_NumberTriangle {
    public static void main(String[] args) {
        int rows = 5;
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for numbers
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            // Move to the next line after each row
            System.out.println();
    }
}

}
