// prop 5.19
/* (Display numbers in a pyramid pattern) Write a nested for loop that prints the
following output: */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int Num = input.nextInt();
        for (int rows = 1; rows <= Num; rows++){
            // This makes the lines
            System.out.println("");
            for(int i = Num - rows; i>=1; i--){
                System.out.print("    ");
            }
            for (int as = 1; as<= rows; as++){

                int asn = (int) Math.pow(3, as-1);
                System.out.print(asn + "  ");
            }
            for (int des = rows-1; des >=1; des-- ){
                int desn = (int) Math.pow(3, des-1);
                System.out.print(desn + "  ");
            }

        }


    }
}
