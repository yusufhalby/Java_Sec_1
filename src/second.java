import java.util.Scanner;

// prop 5.37
/* ( Decimal to binary) Write a program that prompts the user to enter a decimal
integer then displays its corresponding binary value. Don’t use Java’s Integer
.toBinaryString(int) in this program.
*/
public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal number");
        int Num = input.nextInt();
        int i = 0;
        String[] rev={"0","0","0","0","0","0","0","0","0","0","0",} ;

        while(Num > 0){
            if (Num % 2 == 0){
                rev[i]="0";
                Num = Num / 2;
                i++;
            }
            else {
                rev[i]="1";
                Num = Num / 2;
                i++;
            }
        }
        for(int a = i-1; a>=0; a-- ){
            System.out.print(rev[a]);

        }
    }
}