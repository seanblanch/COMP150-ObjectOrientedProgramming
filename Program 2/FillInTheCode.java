package L2a;

import java.sql.SQLOutput;

/**
 * @author Sean Blanchard
 * @version 19/8/2018
 * Section_2a_FillinTheCode
 */
public class FillInTheCode
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        double c;

        // Convert the following sentences to legal Java instructions
        // For each one print the values of variables and the result of the operation

        // #1 b gets a plus 3 minus 7

        b = a + 3 - 7;
        System.out.println("When b gets a plus 3 minus 7 the new value is " + b);


        // #2 b gets a times 4

        b = a * 4;
        System.out.println("When b gets a times 4 the new value is " + b);

        // #3 a is incremented by 1 using a shortcut operator

        a+= 1;
        System.out.println("When a is incremented by 1 the new value is " + a);

        // #4 a gets b times the sum of a plus 5

        a = b * a + 5;
        System.out.println("When a gets b times the sum of a plus 5 the new value is " + a);

        


        // #5 b gets the quotient of the division of a by 2
        b = a / 2;
        System.out.println("When b gets the quotient of the division of a by 2 the new value is " + b);





        // #6 b gets the remainder of the division of a by 3

        b = a % 3;
        System.out.println("When b gets the remainder of the division of a by 3 the new value is " + b);


        // #7 c gets the average of a and b

        c = (a + b) / 2;
        System.out.println("When c gets the average of a and b the new value is " + c);


        // #8 c is decremented by 1 using a shortcut operator

        c-= 1;
        System.out.println("When c is decremented by 1 using a shortcut operator the new value is " + c);


        // #9 b is incremented by 5 using a shortcut operator
        b-= 5;
        System.out.println("When b is incremented by 5 the new value is " + b);


    }
}
