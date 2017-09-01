/**
 * Created by jc428225 on 28/08/17.
 */
public class CountByThrees
{
    public static void main (String args[])
    {
        final int start = 3;
        final int stop = 300;
        final int numbers_per_line = 30;
        for (int i = start; i <=stop; i += start)
        {
            System.out.print(i + " ");
            if(i % numbers_per_line == 0)
            System.out.println();
        }
    }
}
