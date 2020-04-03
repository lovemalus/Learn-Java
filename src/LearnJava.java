/**
* This program is input Hello World!
*
*/

public class LearnJava {

    public static void main(String[] args)
    {
        String greeting = "Hello World!";
        //join add delimiter /
        String all = String.join("/","S","M","L","XL");
        System.out.println(greeting);
        System.out.println(all);
        // Print the same "=" as "greeting"
        for (int i = 0; i < greeting.length();i++)
            System.out.print("=");
        System.out.println();
    }
}
