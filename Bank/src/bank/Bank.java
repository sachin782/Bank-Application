package bank;
import java.util.Scanner;
public class Bank extends Submit {
    public static int ch;
    public Bank()
    {
       ch = 0; 
    }
    public static void main(String[] args) {
       String accn,passw;
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter Account No = ");
       accn = sc.nextLine();
       System.out.print("Enter Password = ");
       passw = sc.nextLine();
       Bank b = new Bank();
       if(b.check(accn,passw)==1)
       {
          System.out.println("Login success");
          System.out.println();
          float w,s,sa;
          Withdraw wi = new Withdraw();
          Submit su = new Submit();
          do
          {
           System.out.println("1.Account Details");
           System.out.println("2.Withdraw");
           System.out.println("3.Submit");
           System.out.println("4.Exit");
           System.out.print("Choice = ");
           ch = sc.nextInt();
           switch(ch)
           {
              case 1:
                  b.details();
                  break;
              case 2:
                  System.out.print("Enter withdraw amount = Rs.");
                  w = sc.nextFloat();
                  sa = wi.calc(w,b.sal);
                  b.sal = sa;
                  wi.show();
                  break;
              case 3:
                  System.out.print("Enter submit amount = Rs.");
                  s = sc.nextFloat();
                  sa = su.calc(s,b.sal);
                  b.sal = sa;
                  su.show();
                  break;
              case 4:
                  System.exit(0);
                  break;
              default:
                  System.out.println("Invalid choice");
                  break;
          }
         }while(b.ch !=4);
       }
       else
       {
           System.out.println("Invalid Login");
           System.exit(0);
       }
    } 
  }
