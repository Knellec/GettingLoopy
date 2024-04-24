import java.util.Scanner;
public class CtoF
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int farenheit = 0;
        boolean loop = true;

        do
        {
            System.out.println("Enter a value in celcius");

            if (in.hasNextInt())
            {
                celsius = in.nextInt();
                loop = false;
            }
            else
            {
                System.out.println("Invalid input. Please enter an integer.");
                loop = true;
            }
            in.nextLine(); // clear buffer
        }
        while(loop == true);

        // convert
        farenheit = celsius * (9/5) + 32;

        // display
        System.out.println("The temperature in farenheit is " + farenheit);
    }
}
