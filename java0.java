/*import java.util.Scanner;

class Vishvak
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int a = read.nextInt() , i;
		int[] b = new int[a+1];

		System.out.println("Enter the array elements : ");
		for(i=0 ; i<a ; i++)
		{
			b[i] = read.nextInt();
		}

		System.out.print("The Array element's are : ");
		for(i=0 ; i<a ; i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.print("\n");

		read.close();
	}
}*/

//1.
/*import java.util.Scanner;

class whileExample
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = read.nextInt() , i=0;

        while(i<a)
        {
            System.out.println("Hello");
            i++;
        }

        read.close();
    }
}*/

//2
/*import java.util.Scanner;

class ForExample
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = read.nextInt() , i;

        for(i=0 ; i<a ; i++)
        {
            System.out.println("Hello");
        }

        read.close();
    }
}*/

//3
/*import java.util.Scanner;

class Array
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the no.of Array element's : ");
        int a = read.nextInt() , i;

        System.out.print("Enter the Array element's : ");
        int[] b = new int[a];
        for(i=0 ; i<a ; i++)
        {
            b[i] = read.nextInt();
        }

        System.out.println("The Array Element's are : ");
        for(i=0 ; i<a ; i++)
        {
            System.out.print(b[i] + " ");
        }

        read.close();
    }
}*/

//4
class ToDar
{
    public static void main(String[] args)
    {
        int k=1 , i , j;
        int[][] a = new int[2][3];

        for(i=0 ; i<2 ; i++)
        {
            for(j=0 ; j<3 ; j++)
            {
                a[i][j] = k;
                k++;
            }
        }

        for(i=0 ; i<2 ; i++)
        {
            for(j=0 ; j<3 ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
