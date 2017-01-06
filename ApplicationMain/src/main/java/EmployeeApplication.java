import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by gopichand on 1/6/2017.
 */
public class EmployeeApplication
{
    //CollectionOperations coperations = new CollectionOperationsImpl();
    DbOperations dboperations = new DbOperationsImple();
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        EmployeeApplication application = new EmployeeApplication();

        EmployeeEnum choice = null;
        do
        {
            choice = userOperation();
            switch(choice)
            {
                case ADD:
                    application.addEmployee();
                    break;
                case UPDATE:
                    application.updateEmployee();
                    break;
                case DELETE:
                    application.deleteEmployee();
                    break;
                case DISPLAY:
                    application.displayEmployee();
                    break;
                case DISPLAYALL:
                    application.displayAllEmployee();

               /* case SORT:
                    System.out.println("sort by age");
                    application.sort();
                    break;*/
                case EXIT:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }while(choice != null);
    }

   /* private void sort()
    {
        coperations.sortByAge();
    }*/

    private void displayAllEmployee() throws SQLException, ClassNotFoundException
    {
        dboperations.displayAll();
        //coperations.displayAll();

    }

    private void displayEmployee() throws SQLException, ClassNotFoundException {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        //coperations.display(ch);
        dboperations.display(ch);
    }

    private void deleteEmployee() throws SQLException, ClassNotFoundException

    {
        System.out.println("enter employee no to delete");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        //int value = coperations.delete(ch);
        dboperations.delete(ch);

    }

    private void updateEmployee() throws SQLException, ClassNotFoundException {
        Employee emp = EmployeeUtil.readEmployee();
        // coperations.update(emp);
        dboperations.update(emp);
    }

    private void addEmployee() throws SQLException, ClassNotFoundException {
        Employee emp = EmployeeUtil.readEmployee();
        boolean success = dboperations.add(emp);
        // boolean ssuccess = coperations.add(emp);
        if(success)
            System.out.println("employee added succesfully");
        else
            System.out.println("employee already exist");


    }

    private static EmployeeEnum userOperation()
    {
        display();
        System.out.println("enter choice");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        EmployeeEnum enumvalue = null;
        do
        {
            if(a == 7)
                break;
            enumvalue = EmployeeEnum.convertNameByValue(a);

        }while(enumvalue == null);

        return enumvalue;
    }




    private static void display()
    {
        System.out.println("1.ADD\n 2.UPDATE\n 3.DELETE\n 4.DISPLAY\n 5.DISPLAYALL\n 6.SORT\n 7.EXIT");
    }
}
