import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        System.out.println(StringUtils.isBlank("Иванов Иван Иванович"));

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmp("Иванов Иван Иванович", 1, 20000);
        employeeBook.addEmp("Давыдов Давид Давидович", 1, 30000);
        employeeBook.addEmp("Петров Петр Петрович", 1, 25000);
        employeeBook.addEmp("Макаров Дмитрий Даниилович", 2, 15000);
        employeeBook.addEmp("Сорокин Иван Даниилович", 2, 10000);
        employeeBook.addEmp("Егоров Владислав Матвеевич", 3, 40000);
        employeeBook.addEmp("Щербакова Анастасия Всеволодовна", 3, 50000);
        employeeBook.addEmp("Герасимова Маргарита Данииловна", 4, 45000);
        employeeBook.addEmp("Семенова Анна Данииловна", 5, 60000);
        employeeBook.addEmp("Романов Илья Павлович", 5, 65000);
        employeeBook.listEmployees();
        employeeBook.printEmpMinSalary();
        employeeBook.printEmpMaxSalary();
        employeeBook.midSalary();
        employeeBook.listName();
        employeeBook.indexSalary(15);
        employeeBook.listEmployees();
        employeeBook.minSalaryOtdel(1);
        employeeBook.maxSalaryOtdel(1);
        employeeBook.sumSalaryOtdel(1);
        employeeBook.midSalaryOtdel(1);
        employeeBook.indexSalaryOtdel(1,15);
        employeeBook.listEmployees();
        employeeBook.printEmpOtdel(1);
        employeeBook.empSalaryUnder(27000.00);
        employeeBook.empSalaryAbove(27000.00);
        employeeBook.deleteEmp(5);
        employeeBook.listEmployees();
        employeeBook.addEmp("Гончаров Лука Денисович",3,10000);
        employeeBook.updateEmpSalary("Иванов Иван Иванович",30000);
        employeeBook.listEmployees();
        employeeBook.updateEmpOtdel("Гончаров Лука Денисович",2);
        employeeBook.listEmployees();
        employeeBook.printOtdelEmp();
    }
}
