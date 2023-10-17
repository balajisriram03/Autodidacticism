import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int beginning = reader.nextInt();
        int end = reader.nextInt();
        range(beginning, end);
    }
    
    public static void range(int beginning, int end) {
        for(int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
