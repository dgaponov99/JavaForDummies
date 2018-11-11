package Chapter_8;

public class DoPayrollTypeF {

    public static void main(String[] args) {

        FullTimeEmployee ftEmployee = new FullTimeEmployee();

        ftEmployee.setName("Барри");
        ftEmployee.setJobTitle("Директор");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());

        PartTimeEmployee ptEmployee = new PartTimeEmployee();
        ptEmployee.setName("Крис");
        ptEmployee.setJobTitle("Программист");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(50));

        PartTimeWithOver ptoEmployee = new PartTimeWithOver();
        ptoEmployee.setName("Стив");
        ptoEmployee.setJobTitle("Водитель");
        ptoEmployee.setHourlyRate(7.53);
        ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(50));
    }
}
