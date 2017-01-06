import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gopichand on 1/6/2017.
 */
public class DbOperationsImple implements DbOperations
{

    public  int delete(int eno) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
        Statement statement = connection.createStatement();
        statement.execute("delete from sys.employee where no = " + eno);
        return eno;
    }









    public boolean add(Employee emp) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
        Statement statement = connection.createStatement();
        StringBuilder queryBuilder = new StringBuilder("insert into sys.employee (name,no,salary,age) values(");
        queryBuilder
                .append("'")
                .append(emp.getName())
                .append("',")
                .append(emp.getNo())
                .append(",")
                .append(emp.getSalary())
                .append(",")
                .append(emp.getAge())
                .append(")");
        System.out.println(queryBuilder.toString());
        statement.execute(queryBuilder.toString());
        return true;
    }

    public void update(Employee emp) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
        Statement statement = connection.createStatement();
        StringBuilder queryBuilder = new StringBuilder("update sys.employee set ");
        queryBuilder
                .append("name = '").append(emp.getName()).append("',")
                .append("no = ").append(emp.getNo()).append(",")
                .append("salary = ").append(emp.getSalary()).append(",")
                .append("age = ").append(emp.getAge())
                .append(" where no = ")
                .append(emp.getNo());
        System.out.println(queryBuilder.toString());
        statement.execute(queryBuilder.toString());

    }

    public void display(int no) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select name, no, salary, age from sys.employee where no = " + no);

        if(resultSet.next()){
            Employee employee = new Employee();
            employee.setName(resultSet.getString(1));
            employee.setNo((resultSet.getInt(2)));
            employee.setSalary(resultSet.getFloat(3));
            employee.setAge(resultSet.getInt(4));
            System.out.println(employee);
        }
    }

    public void displayAll() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select name, no, salary, age from sys.employee");

        List<Employee> employees = new ArrayList<>();
        while(resultSet.next()){
            Employee employee = new Employee();
            employee.setName(resultSet.getString(1));
            employee.setNo(resultSet.getInt(2));
            employee.setSalary(resultSet.getFloat(3));
            employee.setAge(resultSet.getInt(4));
            employees.add(employee);
        }
        for (Employee e: employees)
        {
            System.out.println(e);
        }


    }
}
