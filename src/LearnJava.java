/**
* This program is input Hello World!
*
*/

public class LearnJava {

    public static void main(String[] args)
    {
        String greeting = "Hello World!";
        System.out.println(greeting);
        // 打印出和 greeting一样长度的“=”
        for (int i = 0; i < greeting.length();i++)
            System.out.print("=");
        System.out.println();
    }
}
