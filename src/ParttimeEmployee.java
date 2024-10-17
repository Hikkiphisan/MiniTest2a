public class ParttimeEmployee extends Employee {
    public int hourforWork;

    public ParttimeEmployee(int id_employee, String name, int age, int numberphone, String email, int hourforWork) {
        super(id_employee, name, age, numberphone, email);
        this.hourforWork = hourforWork;
    }
    @Override
    public double salaryCalculation() {
        return hourforWork* 100000;
    }



}
