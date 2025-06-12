public class recursion
{
  public String fun(int n)
  {
      if(n==11)
      {
          return "Dharani";
      }
      System.out.println(n);
      String s=fun(n+1);
      System.out.println(n);
      return s;
  }
	public static void main(String[] args) {
		recursion m=new recursion();
		System.out.println(m.fun(1));
	}
}