import java.util.ArrayList;
import java.util.List;

/**
 * Created by gopichand on 1/6/2017.
 */
public class CollectionOperationsImpl implements CollectionOperations
{

    List<Employee> list = new ArrayList<>();

    public boolean add(Employee emp)
    {
        if(list.isEmpty())
        {
            list.add(emp);
            return true;
        }
        for (Employee e:list)
        {
            if(e.getNo() == emp.getNo())
                return false;
        }
        list.add(emp);

        return false;
    }


    public void update(Employee emp)
    {
        if(list.isEmpty())
            System.out.println("list is empty");
        for (Employee e:list)
        {
            if(e.getNo() == emp.getNo())
            {
                e.setName(emp.getName());
                e.setSalary(emp.getSalary());
                e.setAge(emp.getAge());
                break;

            }
            else
                System.out.println("employee is not present");

        }


    }


    public int delete(int no) {
        if (list.isEmpty())
            System.out.println("list is empty");
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNo() == no)
                list.remove(i);
        }

        return -1;
    }


    public void display(int no)
    {
        for (Employee e:list)
        {
            if(e.getNo() == no)
                System.out.println(e);

        }
    }


    public void displayAll()
    {
        for (Employee e:list)
        {
            System.out.println(e);
        }

    }


    //public void sortByAge()
   // {
       // EmployeeUtil.sortByAge(list);
    //}
}
