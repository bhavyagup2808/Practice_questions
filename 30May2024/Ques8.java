public class Ques8 {
    public static void main(String[] args) {
        int space =4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            space--;
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");;
            System.out.println();
        }
    
        space = 1;
    
        // Bottom half of the diamond
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= space; j++)
                System.out.println(" ");;
            space++;
            for (int j = 1; j <= 2 * (n - i) - 1; j++)
                System.out.println("*");;
            System.out.println();;
        }
    }
}
