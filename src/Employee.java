public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;

    public Employee (String fio, int dpt, int slr) {
       this.fullName = fio;
       this.department = dpt;
       this.salary = slr;
       id = Main.counter++;
    }

    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

    public void setDepartment(int dpt) {
        this.department = dpt;
    }
    public void setSalary(int slr) {
        this.salary = slr;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", '" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary;
    }

}
