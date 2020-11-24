import java.util.*;

public class Grading {
    public static void main(String args[]) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input[] = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (input[i] >= 38) {
                if (input[i] % 5 >= 3) {
                    input[i] += 5 - input[i] % 5;
                }
            }
        }
        for (i = 0; i < n; i++)
            System.out.println(input[i]);
    }
}
