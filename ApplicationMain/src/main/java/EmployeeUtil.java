import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 * Created by gopichand on 1/6/2017.
 */
public class EmployeeUtil
{
    public static Employee readEmployee() {
        System.out.println("enter employee no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("enter name");
        String name = sc.next();
        System.out.println("enter salary");
        float salary = sc.nextFloat();
        System.out.println("enter age");
        int age = sc.nextInt();
        Employee emp = new Employee(no, name, salary, age);
        return emp;
    }

  /*  public static void sortByAge(List<Employee> list) {
        if (list == null) return;
        Comparator<Employee> ageComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        };
        list.sort(ageComparator);

    }*/
}
