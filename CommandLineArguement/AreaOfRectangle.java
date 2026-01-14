public class AreaOfRectangle
{
    public static void main(String[] args)
    {
        int length = Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]);
        int areaOfRectangle = length * breadth;
        System.out.printf("Area of Rectangle is = %d\n",areaOfRectangle);
	System.out.println("Area of Rectangle is = "+areaOfRectangle);
    }
}