package Examples.Salary.Salary;

public class Employee {
    private final String job;
    private final double salaryBase;
    
    public Employee(String job, double salaryBase){
        this.job = job;
        this.salaryBase = salaryBase;
    }

    public String getJob() {
        return job;
    }

    public double getSalaryBase() {
        return salaryBase;
    }
}
