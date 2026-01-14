public class ArithmeticOpUsingCmd

{
    public static void main(String[] args)
    {
        
          int a = Integer.parseInt(args[0]);
          int b = Integer.parseInt(args[1]);

          System.out.println("Sum of two no is = "+(a+b));
	  System.out.println("Subtraction of two no is ="+(a-b));
	  System.out.println("Multiplication of two no is ="+(a*b));
	  System.out.println("Divsion of two no is ="+(a/b));

    }
}