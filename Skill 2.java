//Skill - 2.
import java.util.Scanner;

//1-At char.
class A
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String a = read.nextLine();

        System.out.println("Char at (2) : " + a.charAt(1));
        System.out.println("Length of the String : " + a.length());
    }
}

//2-Substring
class B
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String a = read.nextLine();

        System.out.println(a.substring(0));
        System.out.println(a.substring(0,(a.length() - 1)));
    }
}

//3-indexing
class c
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String a = read.nextLine();

        System.out.println(a.indexOf(""));
        System.out.println(a.lastIndexOf(""));
        System.out.println(a.contains("H"));
    }
}

//4-Case convertion.
class d
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String a = read.nextLine();

        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
    }
}

//5-Trimming of white spaces.
class e
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String a = read.nextLine();

        System.out.println("[" + a.trim() + "]");
    }
}

//6-character Replace.
class f
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String a = read.nextLine();

        System.out.println(a.replace("l" , "V"));
        System.out.println(a.replaceAll("l" , "V"));//Same as replace.
        System.out.println(a.replaceFirst("H" , "L"));
    }
}

//7-Comparision.
class g
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your String-1 : ");
        String a = read.nextLine();
        System.out.print("Enter your String-2 : ");
        String b = read.nextLine();

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.compareTo(b));
    }
}

//8-Joining & Concatnating.
class h
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your String-1 : ");
        String a = read.nextLine();
        System.out.print("Enter your String-2 : ");
        String b = read.nextLine();

        System.out.println(a.concat(" ").concat(b));
        String joined = String.join("-" , "A" , "B" , "C");
        System.out.println(joined);
    }
}

//Convertion.
class I
{
    public static void main(String[] args)
    {
        String s = "Java";
        char[] chars = s.toCharArray();
        for (char c : chars) System.out.print(c + " ");//Advaned for loop.
        System.out.println();
        byte[] bytes = s.getBytes();
        for (byte b : bytes) System.out.print(b + " ");
    }
}

//Set builder form.
class J
{
    public static void main(String[] args)
    {
        StringBuilder a = new StringBuilder("Hello");
        a.append(" World");
        a.insert(5,"Java");
        a.delete(0,5);
        a.replace(0,4,"Hi");
        a.reverse();
        System.out.println(a);
    }
}

//Concat '+'
class K
{
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "World";
        String c = a + " " + b;
        System.out.println(c);
    }
}

//Substring
class L
{
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = a.substring(2,4);
        System.out.println(b);
    }
}

//Sentence replace.
class M
{
    public static void main(String[] args)
    {
        String a = "I love JAVA";
        String b = a.replace("JAVA" , "C");
        System.out.println(b);
    }
}

//Spilit
class N
{
    public static void main(String[] args)
    {
        String a = "Apple , Banana , Grapes";
        String b[] = a.split(",");
        for(String c : b) System.out.print(c);
    }
}

//Trim again....
class O
{
    public static void main(String[] args)
    {
        String a = " Hello world ";
        System.out.println("Before : [" + a + "]");
        System.out.print("After : [" + a.trim() + "]");
    }
}
