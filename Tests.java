//Name: Camron Campbell
public class Tests 
{

	public static void main(String[] args)
	{
	double Test1 = 92.7;
	double Test2 = 87.9;
	double Test3 = 79.6;
	double total = Test1 + Test2 + Test3;
	double average = total/3;
	System.out.println("Test score 1: " + Test1);
	System.out.println("Test score 2: " + Test2);
	System.out.println("Test score 3: " + Test3);
	System.out.print("The average of 3 test scores is: ");
	System.out.format("%.2f%n",average);
	}

}
