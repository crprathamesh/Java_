import java.lang.*;
import java.util.*;

public class Calculator 
{
    public static void main(String[] args) 
    {
        int N1 = 0, N2 =0, Res = 0, Choice = 0;
              Scanner S = new Scanner(System.in);

              while(true)
        {
            System.out.print("\n============*****============\n");

            System.out.print("\n***** Calculator ***** \n");
            System.out.print("\n Choice :");
            System.out.print("\n\t 1. Addition");
            System.out.print("\n\t 2. Subtraction");
            System.out.print("\n\t 3. multiplication");
            System.out.print("\n\t 4. Division");
            System.out.print("\n\t 5. Reminder");
            System.out.print("\n\t 6. Exit");

            System.out.print("\n============*****============\n");

            System.out.print("\n Select your choice :");
            Choice = S.nextInt();

            if ((Choice > 0) && (Choice < 0))
            {
                System.out.println("\n Enter the 1st number : ");
                N1 = S.nextInt();
                System.out.print("\n Enter the 2nd number :");
                N2 =S.nextInt();
            }
            switch (Choice)
            {
                case 1:
                        /// Add
                        Res = N1 + N2;
                        System.out.println("\n Addition of " + N1 + " & " + N2+ " is = " + Res + "." );
                        S.next();
                        break;
                 case 2:
                        /// Sub
                        Res = N1 + N2;
                        System.out.println("\n Subrsction of " + N1 + "&" + N2+ " is = " + Res +"." );
                        S.next();
                        break;
                 case 3:
                        /// Mull
                        Res = N1 * N2;
                        System.out.println("\n Mulltiplaction of " + N1 + "&" + N2+ " is = " + Res +"." );
                        S.next();
                        break;
                case 4:
                        /// Div
                        Res = N1 / N2;
                        System.out.println("\n Division of " + N1 + "&" + N2+ " is = " + Res +"." );
                        S.next();
                        break;
                 case 5:
                        /// Rem
                        Res = N1 % N2;
                        System.out.println("\n Reminder of " + N1 + "&" + N2+ " is = " + Res +"." );
                        S.next();
                        break;
                  case 6:
                        break;
                    default:
                         /// Invalid
                        System.out.println("\n invalid Inpute!!!");
            }
            if (Choice == 6)
            {
                break;
            }
  
        }     

              
    }    

}
