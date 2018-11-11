package Chapter_8;

public class FullTimeEmployee extends Employee {
    private double weeklySalary;
    private double benefitDeduction;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalaryIn) {
        weeklySalary = weeklySalaryIn;
    }

    public double getBenefitDeduction() {
        return benefitDeduction;
    }

    public void setBenefitDeduction(double benefitDeductionin) {
        benefitDeduction = benefitDeductionin;
    }

    public double findPaymentAmount() {
        return weeklySalary - benefitDeduction;
    }
}
