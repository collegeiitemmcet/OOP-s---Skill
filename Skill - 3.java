//Skill - 03.
import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the 1st String : ");
        String a = read.nextLine();

        System.out.print("Enter the 2nd String : ");
        String b = read.nextLine();

        System.out.println("Original String : " + a);

        // Substring
        System.out.println("Substring (0 to 4) : " + a.substring(0, 4));

        // charAt
        System.out.println("Character at 3rd position : " + a.charAt(3));

        // contains
        System.out.println("Contains 'll' : " + a.contains("ll"));

        // startsWith and endsWith
        System.out.println("Starts with 'H' : " + a.startsWith("H"));
        System.out.println("Ends with 'o' : " + a.endsWith("o"));

        // indexOf and lastIndexOf
        System.out.println("Index of 'H' : " + a.indexOf('H'));
        System.out.println("Last index of 'o' : " + a.lastIndexOf('o'));

        // replace
        System.out.println("Replacing 'H' with 'o' : " + a.replace('H', 'o'));

        // equalsIgnoreCase
        System.out.println("Ignore case equal : " + a.equalsIgnoreCase(b));

        // split
        System.out.println("Split : ");
        String[] words = a.split(" "); // splits based on space
        for (String word : words)
        {
            System.out.println(word);
        }

        //Concat
        System.out.println("The Adding of '!' : " + a.concat("!"));

        //Format
        String format = String.format("Welcome to %s : " , a);
        System.out.println("Formatted string : " + format);

        //repeat
        System.out.println("Repeat 3-times : " + a.repeat(3));

        read.close();
    }
}
