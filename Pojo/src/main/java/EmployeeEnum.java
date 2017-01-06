/**
 * Created by gopichand on 1/6/2017.
 */
public enum EmployeeEnum
{
    ADD(1), UPDATE(2), DELETE(3), DISPLAY(4), DISPLAYALL(5), SORT(6), EXIT(7);

    private int value;

    EmployeeEnum(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }


    public static EmployeeEnum convertNameByValue(int a)
    {
        for (EmployeeEnum employeeenum: EmployeeEnum.values())
        {
            if(employeeenum.getValue() == a) {
                return employeeenum;
            }

        }

        return null;
    }
}
