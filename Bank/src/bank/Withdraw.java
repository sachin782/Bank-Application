package bank;
public class Withdraw extends Login{
    public float wd;
    public float mn;
    int k;
    public float calc(float w,float sal)
    {
        wd = w;
        mn = sal;
        if(w <= sal)
        {
         mn = mn - wd;
         k = 0;
         return mn;
        }
        else
        {
            System.out.println();
            System.out.println("********** Money Withdrawal **************");
            System.out.println("Less balance!!!!");
            k = 1;
            return mn;
        }
    }
    public void show()
    {
        if(k == 0)
        {
          System.out.println();
          System.out.println("********** Money Withdrawal **************");
          System.out.println("Withdrawn Amount = Rs."+wd);
          System.out.println("Balance Amount = Rs."+mn); 
          System.out.println();
        }
        else
        {
            System.out.println("No Money Withdrawn");
            System.out.println();
        }
    }
}
