package employeeTakeHomeSalaryAssignment;

public class Class3 extends Class2{
	
double totalSalary;
    
    void salarySlip(){
        
        totalSalary = basicPay + hra - pf - deduction + bonus;
        
        System.out.println("The basic pay of the employee is "+ basicPay);
        System.out.println("The hra is "+hra);
        System.out.println("The pf is "+pf);
        System.out.println("The deduction from the salary is "+deduction);
        System.out.println("The bonus of the employee is "+bonus);
        System.out.println("The take home salary is "+totalSalary);
        
    }

}
