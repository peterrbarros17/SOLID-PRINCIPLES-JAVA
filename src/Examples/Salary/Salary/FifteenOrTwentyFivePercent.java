package Examples.Salary.Salary;

public class FifteenOrTwentyFivePercent implements RulesOfBusiness{

    @Override
    public double calculate(Employee employee) {
        if(employee.getSalaryBase() > 2000.0){
            return employee.getSalaryBase() * 0.15;
        }else{
            return employee.getSalaryBase() * 0.20;
        }
    }
}
