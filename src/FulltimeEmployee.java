public class FulltimeEmployee extends Employee {
    public double bonusSalary;
    public double penaltySalary;
    public double baseSalary;

    public void FulltimeEmployee() {
    }
    public FulltimeEmployee(int id_employee, String name, int age, int numberphone, String email, double bonusSalary, double penaltySalary, double baseSalary) {
        super(id_employee, name, age, numberphone, email);
        this.bonusSalary = bonusSalary;
        this.penaltySalary = penaltySalary;
        this.baseSalary = baseSalary;
    }


    @Override
    public double salaryCalculation() {
        return baseSalary + (baseSalary - penaltySalary);
    }


}
