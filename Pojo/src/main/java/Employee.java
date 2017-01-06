/**
 * Created by gopichand on 1/6/2017.
 */
public class Employee
{
    private int no;
    private String name;
    private float salary;
    private int age;

    public Employee(int no, String name, float salary, int age) {
        this.no = no;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
