public class Main
{
    public static void main(String[] args)
    {
        // Part A
        // 1
        for (int i = 0; i <= 30; i++)
        {
            System.out.println(i);
        }
        // 2
        System.out.println("\n");
        for (int i = 30; i >= 0; i--)
        {
            System.out.println(i);
        }
        // 3
        System.out.println("\n");
        for (int i = 0; i <= 18; i = i + 3)
        {
            System.out.println(i);
        }
        // 4
        System.out.println("\n");
        for (int i = 10; i >= 0; i = i - 2)
        {
            System.out.println(i);
        }

        // Part B
        // 5
        String star = "";

        for (int a = 1; a <= 1; a++)
        {
            star = star + "*";
            System.out.println(star);
            for (int b = 1; b <= 4; b++)
            {
                star = star + "*";
                System.out.println(star);
            }
        }
        System.out.println("\n");

        // 6
        for (int a = 5; a > 0; a -= 1) {
            for (int b = 10; b < (0 - a / 2); b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < a; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();

        // 7
        star = "";
        for (int a = 1; a <= 5; a++)
        {
            star = "";
            for (int b = 1; b <= 5; b++)
            {
                star = star + "*";
            }
            System.out.println(star);
        }
        System.out.println();

        // Extra credit

        // top line
        for (int a = 1; a <= 3; a++)
        {
            star = "";
            for(int b = 1; b <= 18; b++)
            {
                star = star + "*";
            }
            System.out.println(star);
        }

        // side line
        for (int a = 1; a <= 5; a++)
        {
            star = "";
            for (int b = 1; b <= 5; b++)
            {
                star = star + "*";
            }
            System.out.println(star);
        }

        // middle line
        for (int a = 1; a <= 3; a++)
        {
            star = "";
            for (int b = 1; b <= 10; b++)
            {
                star = star + "*";
            }
            System.out.println(star);
        }

        // side line
        for (int a = 1; a <= 5; a++)
        {
            star = "";
            for (int b = 1; b <= 5; b++)
            {
                star = star + "*";
            }
            System.out.println(star);
        }

        // bottom line
        for (int a = 1; a <= 3; a++)
        {
            star = "";
            for(int b = 1; b <= 18; b++)
            {
                star = star + "*";
            }
            System.out.println(star);
        }
    }
}