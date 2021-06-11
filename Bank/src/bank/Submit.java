package bank;
public class Submit extends Withdraw {
    float sb;
    float mn;
    @Override
    public float calc(float s,float sal)
    {
        sb = s;
        mn = sal;
        mn = mn + sb;
        return mn;
    }
    @Override
    public void show()
    {
        System.out.println();
        System.out.println("********** Money Submission **************");
        System.out.println("Submit Amount = Rs."+sb);
        System.out.println("Balance Amount = Rs."+mn); 
        System.out.println();
    }
}
