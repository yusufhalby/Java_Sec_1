import java.util.Scanner;
// prop 5.17
/* (Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid */
public class first {
    public static void main(String[] args){
        /* Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int rows = 1; rows <= N; rows++) {
            // Create spaces in each row
            for (int s = N - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            // Create decending numbers in each row
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            // Create ascending number in each row
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int Num = input.nextInt();
        for (int rows = Num; rows >= 1; rows--) {
            System.out.println("");
            for (int decend = rows; decend>=2; decend--){
                System.out.print(decend + "  ");
            }
            for (int ascend = 1; ascend <= rows; ascend++){
                System.out.print(ascend + "  ");
            }
        }
    }
}
