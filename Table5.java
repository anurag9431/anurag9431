public class Table5 {
    public static void main(String[] args) {
        // Print the table header
        System.out.println("x\t\t y = e^(-x)");
        
        // Loop through x values from 0 to 1 in steps of 0.1
        for (double x = 0; x <= 1; x += 0.1) {
            // Calculate the corresponding y value
            double y = Math.exp(-x);
            
            // Print the x and y values in the specified format
            System.out.printf("%.1f\t\t%.4f\n", x, y);
        }
    }
}
