class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    void listEmployees() {
        System.out.println("Список всех сотрудников:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    int sumSalary() {
        int sum = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    void printSumSalary() {
        System.out.println("Сумма затрат на запрлату всем сотруденикам за месяц: " + sumSalary());
    }

    Employee empMinSalary() {
        Employee emp = null;
        double min = sumSalary();
        for (Employee e : employees) {
            if (e != null) {
                if (min > e.getSalary()) {
                    min = e.getSalary();
                    emp = e;
                }
            }
        }
        return emp;
    }

    void printEmpMinSalary() {
        System.out.println("Сотрудник с минимальной зарплатой: " + empMinSalary());
    }

    Employee empMaxSalary() {
        Employee emp = null;
        double max = 0;
        for (Employee e : employees) {
            if (e != null) {
                if (max < e.getSalary()) {
                    max = e.getSalary();
                    emp = e;
                }
            }
        }
        return emp;
    }

    void printEmpMaxSalary() {
        System.out.println("Сотрудник с максимальной зарплатой: " + empMaxSalary());
    }

    void midSalary() {
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                count++;
            }
        }
        System.out.println("Средняя зарплата: \n" + ((double) sumSalary() / count));
    }

    void listName() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.getName());
            }
        }
    }

    void indexSalary(double index) {
        for (Employee e : employees) {
            if (e != null) {
                e.setSalary(e.getSalary() * (index / 100.00) + e.getSalary());
            }
        }
    }

    void minSalaryOtdel(int i) {
        double a = sumSalary();
        Employee emp = null;
        for (Employee e : employees) {
            if (e != null) {
                if ((e.getOtdel() == i) && (a > e.getSalary())) {
                    a = e.getSalary();
                    emp = e;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + i + ":\n" + emp);
    }

    void maxSalaryOtdel(int i) {
        double a = empMinSalary().getSalary();
        for (Employee e : employees) {
            if (e != null) {
                if ((e.getOtdel() == i) && (a < e.getSalary())) {
                    a = e.getSalary();
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + i + ":\n" + a);
    }

    void sumSalaryOtdel(double i) {
        double sum = 0;
        for (Employee e : employees) {
            if (e != null) {
                if (e.getOtdel() == i) {
                    sum += e.getSalary();
                }
            }
        }
        System.out.println("Сумма затрат на зарплаты в " + i + " отделе:\n" + sum);
    }

    void midSalaryOtdel(int i) {
        int sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                if (e.getOtdel() == i) {
                    sum += e.getSalary();
                    count++;
                }
            }
        }
        System.out.println("Средняя зарплата в " + i + " отделе: \n" + (double) sum / (double) count);
    }

    void indexSalaryOtdel(int i, int index) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getOtdel() == i) {
                    e.setSalary(e.getSalary() * (index / 100.00) + e.getSalary());
                }
            }
        }
    }

    void printEmpOtdel(int i) {
        System.out.println("Список сотрудников отдела:");
        for (Employee e : employees) {
            {
                if (e != null) {
                    if (e.getOtdel() == i) {
                        System.out.println(e.getName() + " " + e.getSalary());
                    }
                }
            }
        }
    }

    void empSalaryUnder(double i) {
        System.out.println("Сотрудники чья зарплата ниже " + i + " :");
        for (Employee e : employees) {
            if (e != null) {
                if (e.getSalary() < i) {
                    System.out.println(e);
                }
            }
        }
    }

    void empSalaryAbove(double i) {
        System.out.println("Сотрудники чья зарплата выше " + i + " :");
        for (Employee e : employees) {
            if (e != null) {
                if (e.getSalary() > i) {
                    System.out.println(e);
                }
            }
        }
    }

    void addEmp(String name, int otdel, int salary) {
        Employee emp = new Employee(name, otdel, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = emp;
                break;
            }
        }
    }


    void deleteEmp(int id) {
        int i = -1;
        for (Employee e : employees) {
            if (e != null) {
                i++;
                if (id == e.getIdEmp()) {
                    employees[i] = null;
                }
            }
        }
    }

    void updateEmpSalary(String name, double i) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getName().equals(name)) {
                    e.setSalary(i);
                }
            }
        }
    }

    void updateEmpOtdel(String name, int i) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getName().equals(name)) {
                    e.setOtdel(i);
                }
            }
        }
    }

    void printOtdelEmp() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сотрудники " + i + " отдела:");
            for (Employee e : employees) {
                if (e != null) {
                    if (e.getOtdel() == i) {
                        System.out.println(e.getName() + " " + e.getSalary());
                    }
                }
            }
        }
    }
}