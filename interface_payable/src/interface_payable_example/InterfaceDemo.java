package interface_payable_example;

interface Payable
{
	void pay();
}

class Employee
{
	Payable p=new Payable()
	{
		
		@Override
		public void pay() 
		{
			
			System.out.println("Pay amount in Employee");
		}
	};
}

class Contractor 
{
Payable p=new Payable() {
		
		@Override
		public void pay() 
		{
			
			System.out.println("pay amount in Contractor");
			
		}
	};
}


public class InterfaceDemo 
{

	public static void main(String[] args) 
	{

		Employee e=new Employee();
		e.p.pay();
		

	}

}
