
import java.util.Scanner;


public class TaxCalculation 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  Name: ");
        String name = sc.nextLine();

        System.out.println("Enter  ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Basic Salary: ");
        double basicSalary = Double.parseDouble(sc.nextLine());

        System.out.println("Enter HRA Percentage: ");
        double HRAPer = Double.parseDouble(sc.nextLine());

        System.out.println("Enter DA Percentage: ");
        double DAPer = Double.parseDouble(sc.nextLine());

        Employee p1 = new Employee(id, name, basicSalary, HRAPer, DAPer);
        TaxUtil tax = new TaxUtil();

        System.out.println("\nSelect Employee Type (employee / manager / trainer / sourcing): ");
        String choice = sc.nextLine().toLowerCase();

        switch (choice)
        {
            case "employee":
                System.out.println("\n--- EMPLOYEE DETAILS ---");
                System.out.println(p1);
                System.out.printf("Gross Salary: %.2f\n", p1.calculateGrossSalary());
                System.out.printf("Net Salary (after Tax): %.2f\n", tax.calculateTax(p1));
                break;

            case "manager":
                System.out.println("Enter Project Allowance: ");
                double projectAllowance = Double.parseDouble(sc.nextLine());
                Manager m = new Manager(p1, projectAllowance);
                System.out.println("\n--- MANAGER DETAILS ---");
                System.out.println(p1);
                System.out.printf("Gross Salary: %.2f\n", m.calculateGrossSalary());
                System.out.printf("Net Salary (after Tax): %.2f\n", tax.calculateTax(m));
                break;

            case "trainer":
                System.out.println("Enter Batch Count: ");
                int batchCount = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Perk per Batch: ");
                double perkPerBatch = Double.parseDouble(sc.nextLine());
                Trainer t = new Trainer(p1, batchCount, perkPerBatch);
                System.out.println("\n--- TRAINER DETAILS ---");
                System.out.println(p1);
                System.out.printf("Gross Salary: %.2f\n", t.calculateGrossSalary());
                System.out.printf("Final Salary (after Tax): %.2f\n", tax.calculateTax(t));
                break;

            case "sourcing":
                System.out.println("Enter Enrollment Target: ");
                int enTarget = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Enrollment Reached: ");
                int enReached = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Perk per Enrollment: ");
                double perkPerEnrollment = Double.parseDouble(sc.nextLine());
                Sourcing s = new Sourcing(p1, enTarget, enReached, perkPerEnrollment);
                System.out.println("\n--- SOURCING DETAILS ---");
                System.out.println(p1);
                System.out.printf("Gross Salary: %.2f\n", s.calculateGrossSalary());
                System.out.printf("Final Salary (after Tax): %.2f\n", tax.calculateTax(s));
                break;

            default:
                System.out.println("Invalid choice. Please select employee / manager / trainer / sourcing.");
        }

        sc.close();
    }
}









 class Employee
{

	private int employeeId;
	private String EmployeeName;
	private double basicSalary,
	Hra,DA;


public Employee(int employeeId,Strng employeeName,double basicSalary,double Hra,double DA)
{

	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.basicSalary=basicSalary;
	this.Hra=Hra;
	this.DA=DA;

	
}

public double calculateGrossSalary()
{

	double hra= basicSalary*Hra/100;
	double da=basicSalary*DA/100;
	return basicSalary+hra+da;

}

 public String toString()
	    {
	        return String.format(
	            
	            "-----------------\n" +
	            "ID           : %d\n" +
	            "Name         : %s\n" +
	            "Basic Salary : %.2f\n" +
	            "HRA %%        : %.2f\n" +
	            "DA %%         : %.2f",
	            employeeId, employeeName, basicSalary, HRAPer, DAPer
	        );
	    }
	

}


class Manager
{
	private Employee emp;
	private double projectAllowance;

	public Manager(Employee emp,double projectAllowance)
	{

		this.emp=emp;
		this.projectAllowance=projectAllowance;
		
	}

	public double calculateGrossSalary()
	{
	
		return emp.calculateGrossSalary()+projectAllowance;

	
	}
}

 class Trainer
{
	private Employee empinfo;
	private int batchCount;
	private double PerkPerBatch;
	
	public Trainer(PayrollForEmployee empinfo, int batchCount, double perkPerBatch) 
	
	{
		super();
		this.empinfo = empinfo;
		this.batchCount = batchCount;
		PerkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary()
	{
		return empinfo.calculateGrossSalary()+(batchCount * PerkPerBatch);
	}
	
	
	
}





 class TaxUtil
{
	public double calculateTax(Employee emp)
	{
		double salary = emp.calculateGrossSalary();
		
		if(salary>50000)
		{
			return salary-salary*20/100;
		}
		else {
			return salary-salary*5/100;
		}
	}
	
	public double calculateTax(Manager m)
	{
		double salary = m.calculateGrossSalary();
		
		if(salary>50000)
		{
			return salary-salary*20/100;
		}
		else
		{
			return salary-salary*5/100;
		}
	}
	
	public double calculateTax(Trainer t)
	{
		double salary = t.calculateGrossSalary();
		
		if(salary>50000)
		{
			return salary-salary*20/100;
		}
		else
		{
			return salary-salary*5/100;
		}
	}
	
	public double calculateTax(Sourcing s)
	{
		double salary = s.calculateGrossSalary();
		
		if(salary>50000)
		{
			return salary-salary*20/100;
		}
		else
		{
			return salary-salary*5/100;
		}
	}
	
}


