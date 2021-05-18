import java.util.Scanner;                                                               // This Is Extranal "SYSTEM" Name Library That We Are Using In This Program

public class Febonacci {                                                                // This Is Main Class - Remember Class Name And File Name Should Be Same.

    public static void main(String[] args) {                                            // This Is Main Class Where The Code Will Execute
        Scanner ST = new Scanner(System.in);                                            // Here We Are Creating Object Using "SCANNER" Class With "new" Keyword

        int Number;                                                                     // "INT" Datatype Numerical Variable
        System.out.print("\n\n  Enter A Number To Check Febonacci Series : ");          // Console Output
        Number = ST.nextInt();                                                          // Taking "INT" Type Numerical Value From Users
        System.out.println(" -------------------------------------------------------");
        System.out.println("Series Of "+Number+" Is : ");                               // Console Output With "INT" Value
        for (int i = 0; i < Number; i++)                                                // "FOR LOOP" Is Creating Process When It Will Not False
        {
            System.out.println(Febonacci(i));                                           // In This Console Statement. We Are Colling To A Method(Function).
        }
    }
    public static int Febonacci(int Number){                                            // Static "INTEGER TYPE" Method(Function) With One Argument
        if(Number == 0 || Number == 1)                                                  // If Condition With "Double Equal Operator" And "Logical OR Operator"
        {
            return 1;                                                                   // It Will Return "1". If Using Giving "1" or "0" Input
        }
        else
        {
            return (Febonacci(Number - 1) + Febonacci(Number - 2));     // Main Logic For Checking "FEBONACCI SERIES"
        }
    }
}
