public abstract class Employee {
    public int id_employee;
    public String name;
    public int age;
    public int numberphone;
    public String email;

    public Employee(int id_employee, String name, int age, int numberphone, String email) {
        this.id_employee = id_employee;
        this.name = name;
        this.age = age;
        this.numberphone = numberphone;
        this.email = email;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(int numberphone) {
        this.numberphone = numberphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double salaryCalculation();


}
