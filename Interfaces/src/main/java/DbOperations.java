import java.sql.SQLException;

/**
 * Created by gopichand on 1/6/2017.
 */
public interface DbOperations
{
    public boolean add(Employee emp) throws ClassNotFoundException, SQLException;
    public void update(Employee emp) throws ClassNotFoundException, SQLException;
    public int delete(int no) throws SQLException, ClassNotFoundException;
    public void display(int no) throws SQLException, ClassNotFoundException;
    public void displayAll() throws ClassNotFoundException, SQLException;
}
