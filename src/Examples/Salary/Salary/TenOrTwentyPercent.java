package Examples.Salary.Salary;

public class TenOrTwentyPercent implements RulesOfBusiness{

    @Override
    public double calculate(Employee employee) {
        if(employee.getSalaryBase() > 3000.0){
            return employee.getSalaryBase() * 0.1;
        }else{
            return (employee.getSalaryBase() * 0.2);
        }
    }
}
