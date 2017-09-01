/**
 * Created by jc428225 on 1/09/17.
 */
import java.util.Scanner;
public class CountByAnything
{
    public static void main (String args[])
    {
        final int stop = 200;
        final int numbers_per_line;
        Scanner keyboard = new Scanner(System.in);
        int Values;
        System.out.print("Enter number to count by");
        Values = keyboard.nextInt();
        numbers_per_line = Values * 10;
        for(int i = Values; i <= stop; i += Values)
        {
            System.out.print(i + " ");
            if(i % numbers_per_line == 0)
                System.out.println();
        }
    }

}
