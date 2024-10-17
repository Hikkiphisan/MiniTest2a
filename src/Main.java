import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[8];
        employees[0] = new FulltimeEmployee(12,"Nguyen Van A",23,012312412313,"nguyenvanA@gmail.com", 15000000, 2000000, 5000000);
        employees[1] = new FulltimeEmployee(35,"Nguyen Huu B",44,04354234223,"nguyenhuuB@gmail.com", 16000000, 1000000, 5000000);
        employees[2] = new FulltimeEmployee(36,"Nguyen Hung C",32,0732426223,"nguyHUNGC@gmail.com", 13000000, 2000000, 5000000);
        employees[3] = new FulltimeEmployee(23,"Tran Thi D",43,0363462344,"nguyenTHId@gmail.com", 11000000, 1000000, 5000000);
        employees[4] = new FulltimeEmployee(46,"Dao Phu T",27,0624246247,"DaophuT@gmail.com", 16000000, 2000000, 5000000);
        employees[5] = new FulltimeEmployee(26,"Nguyen Dao H",29,062462267,"nguyendaoh@gmail.com", 13000000, 1000000, 5000000);
        employees[6] = new ParttimeEmployee(73,"Nguyen Chien B",19,06763436,"chienwin@gmail.com", 80);
        employees[7] = new ParttimeEmployee(252,"Tran Duc V",21,066272434,"vu1231@gmail.com", 76);


        System.out.println("Trung bình lương của nhân viên cả công ty:");
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumSalary += employees[i].salaryCalculation();
        }
        double averageALlCompany = sumSalary / employees.length;
        System.out.println(averageALlCompany);
        System.out.println("Số lương phải trả cho tất cả các nhân viên bán thời gian :" + sumSalary);

        System.out.println("Danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty");
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] instanceof FulltimeEmployee) {
                if (employees[i].salaryCalculation() < averageALlCompany) {
                    employees[i].getName();
                } else {
                    System.out.println("Nhân viên tên là "+ employees[i].getName() + " có mức lương là  " + employees[i].salaryCalculation() + " không thấp hơn mức lương trung bình là " + averageALlCompany);
                }
            } else {
                System.out.println( "Nhân viên tên là "+ employees[i].getName() + " không làm fulltime");
            }
        }


        System.out.println("Sắp xếp nhân viên toàn thời gian theo số lương tăng dần.");
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = employees.length; j > i; j--) {
                if (employees[i] instanceof FulltimeEmployee &&
                        employees[j] instanceof FulltimeEmployee) {
                    if (employees[j].salaryCalculation() < employees[j - 1].salaryCalculation()) {
                        Employee temp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FulltimeEmployee) {
                System.out.println(employees[i].getName());
            }
        }


    }
}