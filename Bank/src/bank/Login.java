package bank;
abstract class Login implements Banking{
  public float sal;
  @Override
  public void details()
  {
       System.out.println();
       System.out.println("********* Account Details **********");
       System.out.println("Name = "+name);
       System.out.println("Aadhar No = "+adh);
       System.out.println("Mobile No = "+phno);
       System.out.println("Age = "+age);
       System.out.println("Address = "+add);
       System.out.println("Balance in account = Rs."+sal);
       System.out.println();
  }
  @Override
  public int check(String a,String p)
  {
   if(a.equals(acc) && p.equals(pass))
   {
       sal = 10000;
       return 1;
   }
   else 
       return 0;
  }
}
