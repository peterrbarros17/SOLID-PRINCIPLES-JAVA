package Examples.Salary.Salary;

public class CalculateSalary {
    public double calculate(Employee employee){
        if(Job.DEVELOPER.toString().equals(employee.getJob())){
            return new TenOrTwentyPercent().calculate(employee);
        }
        if(Job.DBA.toString().equals(employee.getJob()) || Job.TESTER.toString().equals(employee.getJob())){
            return new FifteenOrTwentyFivePercent().calculate(employee);
        }

        throw new RuntimeException("Invalid employee");
    }
}
