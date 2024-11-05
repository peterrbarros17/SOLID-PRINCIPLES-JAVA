package Examples.Salary.Salary;

public enum Job {
    DEVELOPER(new TenOrTwentyPercent()),
    DBA(new FifteenOrTwentyFivePercent()),
    TESTER(new FifteenOrTwentyFivePercent());

    private final RulesOfBusiness rule;

    Job(RulesOfBusiness rule){
        this.rule = rule;
    }

    public RulesOfBusiness getRule() {
        return rule;
    }
}
