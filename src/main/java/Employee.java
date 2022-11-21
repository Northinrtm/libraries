import org.apache.commons.lang3.StringUtils;

public class Employee {
    private String name;
    private int otdel;
    private double salary;
    private static int id = 0;
    private int idEmp = 1;

    Employee(String name, int otdel, double salary) {
        if (!(StringUtils.isBlank(name)) {
            String[] nameSplit = StringUtils.split(name);
            name = "";
            for (String s : nameSplit) {
                s = StringUtils.capitalize(s);
                name += s + " ";
            }
            this.name = name;
        } else {
            throw new RuntimeException("400 Bad Request");
        }
        this.otdel = otdel;
        this.salary = salary;
        idEmp = id++;
    }

    @Override
    public String toString() {
        return "Сотрудник " + name + " id: " + idEmp + " отдел: " + otdel + " зарплата: " + salary;
    }

    public String getName() {
        return name;
    }

    public int getOtdel() {
        return otdel;
    }

    public double getSalary() {
        return salary;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
