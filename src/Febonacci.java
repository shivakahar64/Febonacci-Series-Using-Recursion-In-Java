import java.sql.SQLOutput;
import java.util.Scanner;

public class Febonacci {
    public static void main(String[] args) {
        Scanner ST = new Scanner(System.in);

        int Number;
        System.out.print("\n\n  Enter A Number To Check Febonacci Series : ");
        Number = ST.nextInt();
        System.out.println(" -------------------------------------------------------");
        System.out.println("Series Of "+Number+" Is : ");
        for (int i = 0; i < Number; i++)
        {
            System.out.println(Febonacci(i));
        }
    }
    public static int Febonacci(int Number){
        if(Number == 0 || Number == 1)
        {
            return 1;
        }
        else
        {
            return (Febonacci(Number - 1) + Febonacci(Number - 2));
        }
    }
}
