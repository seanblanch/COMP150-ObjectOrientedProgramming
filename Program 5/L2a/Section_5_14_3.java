import java.util.Random;

/**
 * Created by atb on 9/17/16.
 * edited by Sean Blanchard
 * 9/24/18
 */
public class Section_5_14_3
{
    public static void main(String[] args)
    {
        Random random = new Random();

        boolean a = random.nextBoolean();
        int b = random.nextInt();
        int c = random.nextInt();


        // #20 if a is true, increment b by 1
        if (a) {
            b++;
            System.out.println("B is : " + b);
        }

        // #21 if a is true, increment b by 2; if a is false, decrement b by 1
        if (a) {
            b+= 2;
            System.out.println("B is : " + b);
        } else {
            b--;
            System.out.println("B is : " + b);
        }


        // #22 if a is true, change a to false; if a is false, change a to true
        if (a) {
            a = false;
            System.out.println("A is : " + a);
        } else {
            a = true;
            System.out.println("A is : " + a);
        }

        // #23 if b is equal to c, then assign true to a
        if (b == c) {
            a = true;
            System.out.println("If A = C, a is : " + a);
        }

        // #24 if b is less than c, increment b by 1; otherwise, leave b unchanged
        if (b < c) {
            b++;
            System.out.println("If B is less than C, add one to B: " + b);
        } else {
            System.out.println("Leave B unchanged: " + b);
        }

        // #25 if b is a multiple of c, set a to true; otherwise, set a to false
        if ((b % c) == 0) {
            a = true;
            System.out.println("If B is a multiple of C, A is : " + a);
        } else {
            a = false;
            System.out.println("If B is not a multiple of C, A is : " + a);
        }

        // #26 if c is not equal to 0, assign to b the value of b divided by c
        if (c != 0) {
            b = (b / c);
            System.out.println("If C does not equal 0, b :" + b);
        }

        // #27 if the product b times c is greater than or equal to 100, then invert a (if a is true, a become false; if a is false, a becomes true);
        //     otherwise assign true to a
        if (b * c >= 100) {
            if (a) {
                a = false;
                System.out.println("A is: " + a);
            } else {
                a = true;
                System.out.println("A is: " + a);
            }
        } else {
                a = true;
                System.out.println("A is: " + a);
            }

        // #28 if a is true and b is greater than 10, increment c by 1
        if ((a) && (b > 10)) {
            c++;
            System.out.println("C is: " + c);
        }

        // #29 if both b and c are less than 10, then assign true to a; otherwise, assign false to a
        if ((b < 10) && (c < 10)) {
            a = true;
            System.out.println("A is: " + a);
        } else {
            a = false;
            System.out.println("A is: " + a);
        }

        // #30 if b or c is greater than 5, then assign true to a; otherwise, assign false to a
        if (b > 5 || c > 5) {
            a = true;
            System.out.println("A is: " + a);
        } else {
            a = false;
            System.out.println("A is: " + a);
        }

    }
}
